/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package myblackjack;

/**
 *
 * @author alvar
 */
public enum Value {
    DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), J(10), Q(10), K(10), A(11);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getNumericValue() {
        return value;
    }
}
