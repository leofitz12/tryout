package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.game.Game;

import sk.stuba.fei.uim.oop.game.InvalidInputException;
import sk.stuba.fei.uim.oop.players.Player;

public abstract class BlueCard extends Card {
    public BlueCard(String name) {
        super(name);
    }

    
    public abstract void playEffect(Game game, Player player) throws InvalidInputException;
    
    @Override
    public void play(Game game, Player player, Player target)throws InvalidInputException{
        player.setPendingCard(this);
        playEffect(game, player);
    }
}



