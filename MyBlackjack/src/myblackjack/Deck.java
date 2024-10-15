/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author alvar
 */
public class Deck {
    private final List<Card> cards;
    
    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(suit, value));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card getDeckTopCard() {
        if (cards.isEmpty()) {
            return null;
        }
        Card topCard = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        
        return topCard;
    }
    
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
