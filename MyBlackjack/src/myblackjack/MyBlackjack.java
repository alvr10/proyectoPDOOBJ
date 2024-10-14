/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myblackjack;

/**
 *
 * @author alvar
 */
public class MyBlackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Card card1 = new Card(Suit.CORAZONES, Value.J);
        Card card2 = new Card(Suit.PICAS, Value.A);
        
        System.out.println(card1);
        System.out.println(card2.getEnumValue().getValue());
        
    }
    
}
