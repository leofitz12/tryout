package sk.stuba.fei.uim.oop.cards;

class Dynamite extends BlueCard {
    public Dynamite() {
        super("Dynamite");
    }

    @Override
    public void play(Game game, Player currentPlayer, Player targetPlayer) {
        currentPlayer.loseLife();
        game.checkForEnd();
    }
}