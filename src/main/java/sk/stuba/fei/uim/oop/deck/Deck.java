package sk.stuba.fei.uim.oop.deck;

import java.util.ArrayList;
import java.util.Collections;
import sk.stuba.fei.uim.oop.cards.Card;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    
    public Deck(List<Card> cards) {
        this.cards = cards;
        shuffle();
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card draw() throws DeckEmptyException {
        if (cards.isEmpty()) {
            throw new DeckEmptyException();
        }
        return cards.remove(0);
    }
    
    public void add(Card card) {
        cards.add(card);
    }
}


