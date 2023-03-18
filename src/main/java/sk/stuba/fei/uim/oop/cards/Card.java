package sk.stuba.fei.uim.oop.cards;

public abstract class Card {
    private final String name;

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void playEffect(Game game, Player targetPlayer);
}

