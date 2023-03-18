package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.game.InvalidInputException;

public class Barrel extends BlueCard {
    public Barrel() {
        super("Barrel");
    }
    
    @Override
    public void playEffect(Game game, Player player) throws InvalidInputException {
        if (game.rollDice() <= 2) {
            throw new InvalidInputException("Barrel exploded");
        }
    }
}




