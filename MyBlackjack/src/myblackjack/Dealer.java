/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myblackjack;

/**
 *
 * @author alvar
 */
public class Dealer extends Person {
    public Dealer() {
        super();
        setPlayerStands(false);
    }

    public Dealer(String username) {
        super(username);
        setPlayerStands(false);
    }

    public Dealer(Dealer other) {
        super(other.getUsername());
        setPlayerStands(other.getPlayerStands());
    }
}
