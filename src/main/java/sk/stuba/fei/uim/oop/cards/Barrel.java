package sk.stuba.fei.uim.oop.cards;

public class Barrel extends BlueCard {
    public Barrel() {
        super("Barrel");
    }

    @Override
    public void playEffect(Game game, Player targetPlayer) {
        // Do nothing, since the effect is passive
    }
}


