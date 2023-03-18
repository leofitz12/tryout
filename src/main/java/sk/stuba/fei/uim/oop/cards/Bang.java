package sk.stuba.fei.uim.oop.cards;

public class Bang extends BrownCard {
    public Bang() {
        super("Bang");
    }

    @Override
    public void playEffect(Game game, Player sourcePlayer, Player targetPlayer) {
        targetPlayer.loseLife();
    }
}

