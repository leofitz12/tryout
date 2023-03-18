package sk.stuba.fei.uim.oop.deck;

import java.util.ArrayList;
import java.util.List;
import sk.stuba.fei.uim.oop.cards.Card;

public class DiscardPile {
    private List<Card> pile;

    public DiscardPile() {
        this.pile = new ArrayList<>();
    }

    public void add(Card card) {
        pile.add(card);
    }

    public boolean isEmpty() {
        return pile.isEmpty();
    }

    public int size() {
        return pile.size();
    }

    public Card peek() {
        if (isEmpty()) {
            throw new DeckEmptyException();
        }
        return pile.get(size() - 1);
    }

    public Card takeTopCard() {
        if (isEmpty()) {
            throw new DeckEmptyException();
        }
        return pile.remove(size() - 1);
    }

    public void clear() {
        pile.clear();
    }
}
