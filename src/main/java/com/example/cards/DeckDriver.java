package com.example.cards;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        displayDeck(cards);

        /*     for some reason my cut method doesn't work, not sure how to fix it.

        System.out.println("Cut the first card of the deck:");
        cards.cut(1);
        displayDeck(cards);
         */

        System.out.println("Shuffle the deck: ");
        cards.shuffle();
        displayDeck(cards);

        // returns number of cards, deals a card, returns new number of cards
        System.out.println("Deal the top card: ");
        System.out.println( cards.size() + ", " +
                            cards.deal() + ", " +
                            cards.size() );

        // shows the top card of the deck
        System.out.println("Shows the top card of the deck: ");
        System.out.println(cards.turnOver() );

        // unshuffles deck
        // I don't know why this one won't work either. It's not organizing the deck.
        System.out.println("Creates new deck: ");
        cards.newOrder(cards);
        displayDeck(cards);


    }



    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}
