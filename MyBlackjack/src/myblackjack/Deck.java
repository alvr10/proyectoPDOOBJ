/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alvar
 */
public final class Deck {
    private final List<Card> cards;
    
    public Deck() {
        int i = 1;
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                String suffixNum = Integer.toString(i);
                
                if (i < 10) {
                    suffixNum = "0" + i;
                }
                
                String filePath = "images/card_" + suffixNum + ".png";
                cards.add(new Card(suit, value, filePath));
                i++;
            }
        }

        shuffleCards();
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public Deck(Deck other) {
        this.cards = other.cards;
    }
    
    public void shuffleCards() {
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
