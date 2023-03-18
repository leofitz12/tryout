package sk.stuba.fei.uim.oop.cards;

public class Beer extends BrownCard {
    public Beer() {
        super("Beer");
    }

    @Override
    public void playEffect(Game game, Player sourcePlayer, Player targetPlayer) {
        sourcePlayer.gainLife();
    }
}

