package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.game.InvalidInputException;
import sk.stuba.fei.uim.oop.players.Player;

public class Missed extends BrownCard {
    public Missed() {
        super("Missed!");
    }
    
    @Override
    public void playEffect(Game game, Player player, Player target) throws InvalidInputException {
        // Do nothing
    }
}





