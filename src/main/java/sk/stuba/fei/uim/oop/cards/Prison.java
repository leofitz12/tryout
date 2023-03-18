package sk.stuba.fei.uim.oop.cards;

class Prison extends BlueCard {
    public Prison() {
        super("Prison");
    }

    @Override
    public void play(Game game, Player currentPlayer, Player targetPlayer) {
        targetPlayer.setInJail(true);
    }
}
