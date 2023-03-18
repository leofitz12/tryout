package sk.stuba.fei.uim.oop.cards;

public abstract class BrownCard extends Card {
    public BrownCard(String name) {
        super(name);
    }
    
    public abstract void playEffect(Game game, Player sourcePlayer, Player targetPlayer);
}


