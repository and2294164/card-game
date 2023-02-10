package com.example.cards;

import java.util.*;

public class StandardDeck implements Deck {

    List<Card> cards;


    // default constructor
    public StandardDeck() {
        this.cards = newDeck();
    }

    // create a new deck
    private List<Card> newDeck() {

        List<Card> newDeck = new ArrayList<>();

        Arrays.stream(Suit.values()).forEach(suit -> {

            Arrays.stream(FaceValue.values())
                    .map(faceValue -> new Card(suit, faceValue))
                    .forEach(newDeck::add);

        });

        return newDeck;
    }

    // shuffles the deck
    @Override
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    // cuts the deck at a given card number
    @Override
    public void cut(int index) {

        List<Card> top = this.cards.subList(0, index);
        List<Card> bottom = this.cards.subList(index, this.cards.size());

        this.cards.clear();
        this.cards.addAll(bottom);
        this.cards.addAll(top);

    }


    // deals top card
    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    // turns over the top card
    @Override
    public Card turnOver() {
        return this.cards.get(0);
    }

    // returns where in the deck a certain card is
    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }

    // generates an unshuffled deck
    @Override
    public void newOrder(Deck cards) {
        Collections.sort(this.cards);
    }

    // tells how many cards are left in the deck
    @Override
    public int size() {
        return this.cards.size();
    }

    // prints off the card order
    @Override
    public String toString() {
        String sb = "StandardDeck{" + "cards=" + cards +
                '}';
        return sb;
    }
}
