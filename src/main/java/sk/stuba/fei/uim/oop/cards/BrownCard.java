package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;
import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.game.InvalidInputException;

public abstract class BrownCard extends Card {
    public BrownCard(String name) {
        super(name);
    }
    
    public abstract void playEffect(Game game, Player player, Player target) throws InvalidInputException;
    
    @Override
    public void play(Game game, Player player, Player target) throws InvalidInputException{
        playEffect(game, player, target);
    }
}



