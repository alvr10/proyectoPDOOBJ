/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

/**
 * 
 * @author alvar
 */
public class Person {
    private final String username;
    private final Hand hand;
    private boolean playerStands;

    public Person() {
        this.username = "Desconocido";
        this.hand = new Hand();
        this.playerStands = false;
    }

    public Person(String username) {
        this.username = username;
        this.hand = new Hand();
        this.playerStands = false;
    }

    public Person(Person other) {
        this.username = other.getUsername();
        this.hand = other.getHand();
        this.playerStands = false;
    }

    public String getUsername() {
        return username;
    }

    public Hand getHand() {
        return hand;
    }

    public Boolean getPlayerStands() {
        return playerStands;
    }

    public void setPlayerStands(boolean stand) {
        playerStands = stand;
    }
}
