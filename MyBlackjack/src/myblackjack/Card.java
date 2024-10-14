/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

/**
 *
 * @author alvar
 */
public class Card {
    private Suit suit;
    private Value value;
    
    public Card() {
        this.suit = null;
        this.value = null;
    }
    
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    
    public Card(Card other) {
        this.suit = other.suit;
        this.value = other.value;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public Value getEnumValue() {
        return value;
    }
    
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card{");
        sb.append("suit=").append(suit);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
