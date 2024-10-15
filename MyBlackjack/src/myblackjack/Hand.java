/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alvar
 */
public class Hand {
    private final List<Card> hand;
    private int totalValue;
    private boolean isBlackjack;
    private boolean hasOneAce;
    private boolean busted;
    
    public Hand() {
        hand = new ArrayList<>();
        this.isBlackjack = false;
        this.hasOneAce = false;
        this.busted = false;
        this.totalValue = 0;
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public boolean isIsBlackjack() {
        return isBlackjack;
    }

    public boolean isHasOneAce() {
        return hasOneAce;
    }

    public boolean isBusted() {
        return busted;
    }
    
    public void addCard(Card card) {
        this.hand.add(card);
    }
    
    public int calculateTotalValue() {
        int handValue = 0;
        int valuePerAce = 11;
        
        if (hasOneAce == true) {
            valuePerAce = 1;
        }
        
        for (Card card : hand) {
            handValue += switch (card.getEnumValue()) {
                case J, Q, K -> 10;
                case A -> {
                    hasOneAce = true;
                    yield valuePerAce;
                }
                default -> card.getEnumValue().getNumericValue();
            };
        }
        
        if (hasOneAce && handValue > 21) {
            handValue -= 10;
        }
                
        totalValue = handValue;
        return totalValue;
    }
}
