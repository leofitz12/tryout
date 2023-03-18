package sk.stuba.fei.uim.oop.cards;

public abstract class BlueCard extends Card {
    private boolean isFront;

    public BlueCard(String name) {
        super(name);
        this.isFront = false;
    }

    public boolean isFront() {
        return isFront;
    }

    public void setFront(boolean front) {
        isFront = front;
    }
}


