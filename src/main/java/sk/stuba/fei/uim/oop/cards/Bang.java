package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.game.InvalidInputException;


public class Bang extends BrownCard {
    public Bang() {
        super("Bang");
    }
    
    @Override
    public void playEffect(Game game, Player player, Player target) throws InvalidInputException {
        if (player.getDistance(target) > 1) {
            throw new InvalidInputException("Target is out of range");
        }
        if (target.hasCard("Missed!")) {
            target.removeCard("Missed!");
            return;
        }
        target.decrementHealth();
    }
}




