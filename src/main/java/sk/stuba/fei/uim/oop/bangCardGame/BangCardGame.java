package sk.stuba.fei.uim.oop.bangCardGame;

import java.util.*;

public class BangCardGame {
    private Deck deck;
    private List<Player> players;
    private int currentPlayerIndex;

    public BangCardGame(int numPlayers) {
        deck = new Deck();
        players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player("Player " + (i + 1), 4));
        }
        currentPlayerIndex = 0;
    }

    public void start() {
        // shuffle the deck
        deck.shuffle();

        // deal 4 cards to each player
        for (Player player : players) {
            player.drawCards(deck, 4);
        }

        // play the game until there's only one player left
        while (players.size() > 1) {
            Player currentPlayer = players.get(currentPlayerIndex);

            // check if current player is dead
            if (currentPlayer.getLives() <= 0) {
                System.out.println(currentPlayer.getName() + " is dead.");
                players.remove(currentPlayer);
                continue;
            }

            System.out.println("It's " + currentPlayer.getName() + "'s turn.");

            // execute blue card effects
            List<BlueCard> blueCards = currentPlayer.getBlueCards();
            for (BlueCard blueCard : blueCards) {
                blueCard.executeEffect(currentPlayer);
            }

            // draw 2 cards
            currentPlayer.drawCards(deck, 2);

            // play cards
            List<Card> cardsToPlay = currentPlayer.selectCardsToPlay();
            for (Card card : cardsToPlay) {
                card.executeEffect(currentPlayer, players);
                if (card instanceof BrownCard) {
                    currentPlayer.discardCard(card);
                }
            }

            // discard excess cards
            currentPlayer.discardExcessCards();

            // switch to the next player
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        // print the winner
        System.out.println(players.get(0).getName() + " has won the game!");
    }
}

