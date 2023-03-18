package sk.stuba.fei.uim.oop.cards;

public class Missed extends BrownCard {
    public Missed() {
        super("Missed");
    }

    @Override
    public void playEffect(Game game, Player sourcePlayer, Player targetPlayer) {
        // Do nothing, since Missed is played to cancel a Bang card
    }
}


