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
public class Hand {
    private final List<Card> hand;
    private int totalValue;
    private boolean isBlackjack;
    private boolean busted;
    private boolean hasAce;
    private boolean hasFigure;

    public Hand() {
        hand = new ArrayList<>();
        this.totalValue = 0;
        this.isBlackjack = false;
        this.busted = false;
        this.hasAce = false;
        this.hasFigure = false;
    }

    public Hand(List<Card> cards) {
        this.hand = cards;
        this.isBlackjack = false;
        this.busted = false;
        this.hasAce = false;
        this.hasFigure = false;
    }

    public Hand(Hand other) {
        this.hand = other.hand;
        this.totalValue = other.totalValue;
        this.isBlackjack = other.isBlackjack;
        this.busted = other.busted;
        this.hasAce = other.hasAce;
        this.hasFigure = other.hasFigure;
    }

    public List<Card> getCards() {
        return hand;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public boolean isIsBlackjack() {
        return isBlackjack;
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

        if (handValue > 21) {
            busted = true;
        }

        totalValue = handValue;
        return totalValue;
    }

    public boolean checkForBlackjack() {
        for (Card card : hand) {
            switch (card.getEnumValue()) {
                case A -> hasAce = true;
                case J, Q, K -> hasFigure = true;
                default -> {
                }
            }
        }

        isBlackjack = hasAce && hasFigure;
        return isBlackjack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hand{");
        sb.append("hand=").append(hand);
        sb.append(", totalValue=").append(totalValue);
        sb.append(", isBlackjack=").append(isBlackjack);
        sb.append(", busted=").append(busted);
        sb.append(", hasAce=").append(hasAce);
        sb.append(", hasFigure=").append(hasFigure);
        sb.append('}');
        return sb.toString();
    }
}
