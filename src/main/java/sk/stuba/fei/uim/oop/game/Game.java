package sk.stuba.fei.uim.oop.game;


import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.deck.DiscardPile;
import sk.stuba.fei.uim.oop.cards.Card;
import sk.stuba.fei.uim.oop.deck.Deck;


import java.util.ArrayList;

import java.util.List;

public class Game {

    private List<Player> players;
    private Deck deck;
    public DiscardPile discardPile;
    private Player currentPlayer;
    
    public Game(List<Player> numPlayers) {
        this.players = numPlayers;
        this.discardPile = new DiscardPile();
        this.currentPlayer = numPlayers.get(0);
    }
    

    public Game(int numPlayers) {
    }


    public void start() {
        // Shuffle the deck
        deck.shuffle();

        // Deal 4 cards to each player
        for (Player player : players) {
            List<Card> cards = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                Card card = deck.draw();
                cards.add(card);
            }
            player.addCards(cards);
        }

        // Main game loop
        while (true) {
            // Check if the game is over
            if (isGameOver()) {
                break;
            }

            // Draw two cards for the current player
            List<Card> drawnCards = new ArrayList<>();
            for (int i = 0; i < 2; i++) {
                Card card = deck.draw();
                drawnCards.add(card);
            }
            currentPlayer.addCards(drawnCards);

            // Execute the effect of the blue cards in front of the player

            // Let the player play cards
            currentPlayer.playCards();

            // Discard excess card

            // Switch to the next player
            int currentIndex = players.indexOf(currentPlayer);
            int nextIndex = (currentIndex + 1) % players.size();
            currentPlayer = players.get(nextIndex);
        }
    }


    public List<Player> getPlayers() {
        return players;
    }

    public DiscardPile getDiscardPile() {
        return discardPile;
    }

    public boolean isGameOver() {
        int numPlayers = players.size();
        int numAlivePlayers = 0;
        for (Player player : players) {
            if (player.isAlive()) {
                numAlivePlayers++;
            }
        }
        return numAlivePlayers <= 1;
    }


    public int rollDice() {
        return 0;
    }


    public int getPlayersDistance(Player currentPlayer2, Player targetPlayer) {
        return 0;
    }


    public Object getDeck() {
        return null;
    }


    public void playGame() {
    }


	public void drawCard(Player player) {
	}
}


