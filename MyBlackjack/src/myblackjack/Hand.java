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
        int numberOfAces = 0;

        for (Card card : hand) {
            handValue += switch (card.getEnumValue()) {
                case J, Q, K -> 10;
                case A -> {
                    numberOfAces++;
                    yield 11;
                }
                default -> card.getEnumValue().getNumericValue();
            };
        }

        if (handValue > 21 && numberOfAces > 1) {
            for (int i = 0; i < numberOfAces - 1; i++) {
                handValue -= 10;
            }
        }

        if (handValue > 21 && numberOfAces == 1) {
            for (int i = 0; i < numberOfAces; i++) {
                handValue -= 10;
            }
        }

        totalValue = handValue;
        return totalValue;
    }
}
