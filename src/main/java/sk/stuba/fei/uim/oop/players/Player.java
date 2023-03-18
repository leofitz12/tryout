package sk.stuba.fei.uim.oop.players;

import sk.stuba.fei.uim.oop.cards;

import java.util.ArrayList;

public class Player {
    private final String name;
    private final List<Card> hand;
    private final List<BlueCard> blueCards;
    private final int maxHandSize;
    private int lives;

    public Player(String name, int maxHandSize, int startingLives) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.blueCards = new ArrayList<>();
        this.maxHandSize = maxHandSize;
        this.lives = startingLives;
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return Collections.unmodifiableList(hand);
    }

    public List<BlueCard> getBlueCards() {
        return Collections.unmodifiableList(blueCards);
    }

    public int getMaxHandSize() {
        return maxHandSize;
    }

    public int getLives() {
        return lives;
    }

    public void decrementLives() {
        lives--;
    }

    public void drawCards(Deck deck, int numCards) {
        for (int i = 0; i < numCards; i++) {
            Card drawnCard = deck.drawCard();
            if (drawnCard != null) {
                hand.add(drawnCard);
            }
        }
    }

    public void playCard(Card card, Player targetPlayer) {
        card.play(this, targetPlayer);
        hand.remove(card);
    }

    public boolean canDiscardCard() {
        return hand.size() > maxHandSize;
    }

    public void discardCard(Card card) {
        hand.remove(card);
    }

    public boolean hasBlueCard(Class<? extends BlueCard> blueCardClass) {
        for (BlueCard blueCard : blueCards) {
            if (blueCard.getClass().equals(blueCardClass)) {
                return true;
            }
        }
        return false;
    }

    public void addBlueCard(BlueCard blueCard) {
        blueCards.add(blueCard);
    }

    public void removeBlueCard(BlueCard blueCard) {
        blueCards.remove(blueCard);
    }
}

