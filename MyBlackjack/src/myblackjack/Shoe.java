/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvar
 */
public class Shoe {
    private final List<Deck> shoe;
    private final int numberOfDecks;
    
    public Shoe() {
        this.numberOfDecks = 6;
        shoe = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            shoe.add(new Deck());
        }
    }
    
    public Shoe(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
        shoe = new ArrayList<>();
        for (int i = 0; i < numberOfDecks; i++) {
            shoe.add(new Deck());
        }
    }

    public Shoe(Shoe other) {
        this.numberOfDecks = other.numberOfDecks;
        this.shoe = other.shoe;
    }
    
    public List<Deck> getShoe() {
        return shoe;
    }
    
    public Card getTopCardFromTopDeck() {
        for (Deck deck : shoe) {
            if (!deck.getCards().isEmpty()) {
                return deck.getDeckTopCard();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shoe{");
        sb.append("shoe=").append(shoe);
        sb.append(", numberOfDecks=").append(numberOfDecks);
        sb.append('}');
        return sb.toString();
    }
}
