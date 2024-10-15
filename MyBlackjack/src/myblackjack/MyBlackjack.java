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
        Card card1 = new Card(Suit.CORAZONES, Value.A);
        Card card2 = new Card(Suit.PICAS, Value.CINCO);
        Card card3 = new Card(Suit.DIAMANTES, Value.A);
        Card card4 = new Card(Suit.TREBOLES, Value.DIEZ);

        // Crear la primera mano y añadir las cartas
        Hand hand1 = new Hand();
        hand1.addCard(card1);
        hand1.addCard(card2);
        hand1.addCard(card3);
        hand1.addCard(card4);
        
        // Calcular y mostrar el valor total de la primera mano
        int totalValue1 = hand1.calculateTotalValue();
        System.out.println("Valor total de la primera mano: " + totalValue1);

        // Crear cartas para el segundo escenario
        Card card5 = new Card(Suit.CORAZONES, Value.A);
        Card card6 = new Card(Suit.PICAS, Value.SEIS);
        Card card7 = new Card(Suit.DIAMANTES, Value.DIEZ);
        Card card8 = new Card(Suit.TREBOLES, Value.A);
        Card card9 = new Card(Suit.CORAZONES, Value.CUATRO);

        // Crear la segunda mano y añadir las cartas
        Hand hand2 = new Hand();
        hand2.addCard(card5);
        hand2.addCard(card6);
        hand2.addCard(card7);
        hand2.addCard(card8);
        hand2.addCard(card9);
        
        // Calcular y mostrar el valor total de la segunda mano
        int totalValue2 = hand2.calculateTotalValue();
        System.out.println("Valor total de la segunda mano: " + totalValue2);
    }

}
