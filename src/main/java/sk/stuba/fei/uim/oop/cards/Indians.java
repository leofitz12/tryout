package sk.stuba.fei.uim.oop.cards;

public class Indians extends BrownCard {
    public Indians() {
        super("Indians");
    }

    public void execute(Player currentPlayer, Game game) {
        for (Player targetPlayer : game.getOtherPlayers(currentPlayer)) {
            if (targetPlayer.hasBangCard()) {
                targetPlayer.removeBangCard();
            } else {
                targetPlayer.decrementLife();
                if (targetPlayer.isDead()) {
                    game.handlePlayerDeath(targetPlayer);
                }
            }
        }
    }
}
