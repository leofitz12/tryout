package sk.stuba.fei.uim.oop.players;

import sk.stuba.fei.uim.oop.cards.Card;
import sk.stuba.fei.uim.oop.cards.Dynamite;
import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.cards.BrownCard;
import sk.stuba.fei.uim.oop.cards.BlueCard;
import sk.stuba.fei.uim.oop.game.InvalidInputException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Player {
    private final int MAX_HAND_SIZE;
    private int lives;
    private List<Card> hand;
    private List<Card> inPlay;
    private int position = 0;
    private Game game;
    private Object weapon;


    public Player(int maxHandSize) {
        MAX_HAND_SIZE = maxHandSize;
        lives = 4;
        hand = new ArrayList<>();
        inPlay = new ArrayList<>();
    }

    public int getPosition() {
        return position;
    }

    public List<Card> getCardsInHand() {
        return this.hand;
    }
    


    public void incrementHealth() {
        this.lives++;
    }

    public void addCards(List<Card> cards) {
        this.hand.addAll(cards);
    }


    public void removeCard(String cardName) throws InvalidInputException {
        for (Card card : hand) {
            if (card.getName().equals(cardName)) {
                hand.remove(card);
                return;
            }
        }
        throw new InvalidInputException("The player does not have the card " + cardName + " in their hand.");
    }

    public boolean hasCard(String string) {
        for (Card card : hand) {
            if (card.getName().equals(string)) {
                return true;
            }
        }
        return false;
    }
    


    public int getDistance(Player player) {
        int distance = Math.abs(this.getPosition() - player.getPosition());
        if (distance > game.getPlayers().size() / 2) {
            distance = game.getPlayers().size() - distance;
        }
        return distance;
    }
    
    

    public void drawCards(List<Card> deck, int numCards) {
        for (int i = 0; i < numCards; i++) {
            if (deck.isEmpty()) {
                break;
            }
            Card card = deck.remove(0);
            hand.add(card);
        }
    }

    public void playCard(int cardIdx, Game game, Player targetPlayer) throws InvalidInputException {
        Card card = hand.get(cardIdx);
        if (card instanceof BlueCard) {
            playBlueCard(card, game);
        } else if (card instanceof BrownCard) {
            playBrownCard(card, game, targetPlayer);
        } else {
            throw new InvalidInputException("Invalid card type");
        }
        hand.remove(cardIdx);
    }

    private void playBlueCard(Card card, Game game) throws InvalidInputException {
        BlueCard blueCard = (BlueCard) card;
        blueCard.playEffect(game, this);
        inPlay.add(blueCard);
    }

    private void playBrownCard(Card card, Game game, Player targetPlayer) throws InvalidInputException {
        BrownCard brownCard = (BrownCard) card;
        brownCard.playEffect(game, this, targetPlayer);
    }

    public void setPendingCard(Card card) throws InvalidInputException {
        if (inPlay.contains(card)) {
            throw new InvalidInputException("Card is already in play");
        }
        inPlay.add(card);
    }

    public void endEffect(Card card) throws InvalidInputException {
        if (!inPlay.contains(card)) {
            throw new InvalidInputException("Card is not in play");
        }
        inPlay.remove(card);
    }

    public List<Card> getPending() {
        return Collections.unmodifiableList(inPlay);
    }

    public void decrementHealth() {
        lives--;
    }

    public void discardRandomCard() {
        if (hand.size() > lives) {
            int randIdx = (int) (Math.random() * hand.size());
            Card card = hand.remove(randIdx);
        }
    }

    public void loseLife() {
        lives--;
    }

    public int getLives() {
        return lives;
    }

    public List<Card> getHand() {
        return Collections.unmodifiableList(hand);
    }

    @Override
    public String toString() {
        return "Player{" +
                "lives=" + lives +
                ", hand=" + hand +
                ", inPlay=" + inPlay +
                '}';
    }

	public boolean isAlive() {
		return false;
	}

    public void playCards() {
    }
}


