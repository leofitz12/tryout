package sk.stuba.fei.uim.oop.deck;

public class DeckEmptyException extends RuntimeException {
    public DeckEmptyException() {
        super("Deck is empty");
    }
}


