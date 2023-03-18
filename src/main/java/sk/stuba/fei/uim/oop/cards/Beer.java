package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.players.Player;
import sk.stuba.fei.uim.oop.game.Game;


public class Beer extends BrownCard {
    public Beer() {
        super("Beer");
    }
    
    @Override
    public void playEffect(Game game, Player player, Player target) {
        player.incrementHealth();
    }
}



