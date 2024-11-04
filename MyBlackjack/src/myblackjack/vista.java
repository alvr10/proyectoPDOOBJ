/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
*/
package myblackjack;

/**
*
* @author alvar
*/
public interface vista {
   void showCard(Card card);
   void updateScore(int playerScore, int dealerScore);
   void showMessage(String message);
   void drawCard(Card card);
   void stay();
}
