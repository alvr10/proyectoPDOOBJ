/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class Player extends Person {
    private int money;
    private int bet;
    private int insuranceBet;

    public Player() {
        super();
        this.money = 1000;
        this.bet = 0;
    }

    public Player(String username) {
        super(username);
        this.money = 1000;
        this.bet = 0;
    }

    public int getMoney() {
        return money;
    }

    public int getBet() {
        return bet;
    }

    public int getInsuranceBet() {
        return insuranceBet;
    }

    public void betMoney() {
        Scanner scanner = new Scanner(System.in);
        if (money <= 0) {
            System.out.println("No tienes más dinero para seguir jugando.");
        }

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Tienes $" + money + " para apostar.");
                System.out.print("Introduce una cantidad para apostar: ");
                bet = scanner.nextInt();

                if (bet <= money && bet > 0) {
                    validInput = true;
                } else {
                    System.out.println("Debes introducir una cantidad válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir una cantidad válida.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public void betInsurance() {
        if (money <= 0) {
            System.out.println("No tienes más dinero para apostar seguros.");
        }

        money -= bet / 2;
        insuranceBet = bet / 2;
    }

    public void drawCard(Card card) {
        getHand().addCard(card);
    }

    public void surrender() {
        System.out.println("Te has rendido.");
        money += bet / 2;
        bet = 0;
    }

    public void doubleDown(Card card) {
        money -= bet;
        bet *= 2;
        System.out.println("Has doblado la apuesta, recibes una sola carta.");

        getHand().addCard(card);
        System.out.println("Rebiste: " + card.toString());
    }
}
