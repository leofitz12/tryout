package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.game.InvalidInputException;

public abstract class Card {
    public static final String Prison = null;
    protected String name;
    
    public Card(String name) {
        this.name = name;
    }

    public boolean canPlay(Game game, Player player) {
        // Check if the player has enough bangs to play this card
        int bangCount = 0;
        for (Card card : player.getCardsInHand()) {
            if (card instanceof Bang) {
                bangCount++;
            }
        }
    
        return true;
    }
    
    
    public String getName() {
        return name;
    }
    
    public abstract void play(Game game, Player player, Player target) throws InvalidInputException;
}



