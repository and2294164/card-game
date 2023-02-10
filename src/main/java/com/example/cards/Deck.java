package com.example.cards;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    //  API for the card deck
    void shuffle();                                 // shuffle deck
    void cut (int index);                           // cut at specific place
    Card deal();                                    // deal top card
    Card turnOver();                                // turnOver a card
    int search (Card card);                         // return the index of a card
    void newOrder(Deck cards);                      // reorders the deck
    int size();                                     // returns number of cards left in deck

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
