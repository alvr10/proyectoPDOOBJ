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
    private String path;
    
    public Card() {
        this.suit = null;
        this.value = null;
        this.path = "";
    }
    
    public Card(Suit suit, Value value, String path) {
        this.suit = suit;
        this.value = value;
        this.path = path;
    }
    
    public Card(Card other) {
        this.suit = other.suit;
        this.value = other.value;
        this.path = other.path;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    public Value getEnumValue() {
        return value;
    }
    
    public String getPath() {
        return path;
    }
    
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    public void setValue(Value value) {
        this.value = value;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Card{");
        sb.append("suit=").append(suit);
        sb.append(", value=").append(value);
        sb.append(", path=").append(path);
        sb.append('}');
        return sb.toString();
    }
}
