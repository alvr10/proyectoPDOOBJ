/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myblackjack;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        Player player = new Player(username);
        Player dealer = new Player("dealer");

        Card card1 = new Card(Suit.CORAZONES, Value.A);
        Card card2 = new Card(Suit.PICAS, Value.CINCO);
        Card card3 = new Card(Suit.DIAMANTES, Value.A);
        Card card4 = new Card(Suit.TREBOLES, Value.DIEZ);

    }

}
