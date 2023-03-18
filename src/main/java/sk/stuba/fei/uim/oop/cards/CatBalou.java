package sk.stuba.fei.uim.oop.cards;

public class CatBalou extends BrownCard {
    public CatBalou() {
        super("Cat Balou");
    }

    @Override
    public void playEffect(Game game, Player sourcePlayer, Player targetPlayer) {
        targetPlayer.discardRandomCard();
    }
}

