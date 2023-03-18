package sk.stuba.fei.uim.oop.cards;

public class StageCoach extends BrownCard {
    public StageCoach() {
        super("Stage Coach");
    }

    @Override
    public void playEffect(Game game, Player sourcePlayer, Player targetPlayer) {
        sourcePlayer.drawCards(2);
    }
}

