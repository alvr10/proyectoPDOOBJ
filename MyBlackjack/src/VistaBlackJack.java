/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import myblackjack.*;

/**
 *
 * @author alvar
 */
public final class VistaBlackJack extends javax.swing.JFrame {
    Player player = new Player();
    Dealer dealer = new Dealer();
    Shoe shoe = new Shoe();
    boolean play = true;

    /**
     * Creates new form Blackjack
     */
    public VistaBlackJack() {
        initComponents();
        setVisibility(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitButton = new javax.swing.JButton();
        surrenderButton = new javax.swing.JButton();
        doubleDownButton = new javax.swing.JButton();
        standButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hitButton.setText("HIT");
        hitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hit(evt);
            }
        });

        surrenderButton.setText("SURR");
        surrenderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surrender(evt);
            }
        });

        doubleDownButton.setText("DB DOWN");
        doubleDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleDown(evt);
            }
        });

        standButton.setText("STAND");
        standButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stand(evt);
            }
        });

        playButton.setText("PLAY");
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(standButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surrenderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doubleDownButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(playButton)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(playButton)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitButton)
                    .addComponent(doubleDownButton)
                    .addComponent(standButton)
                    .addComponent(surrenderButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void hit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hit
        player.drawCard(shoe.getTopCardFromTopDeck());
        updateGameState();
    }//GEN-LAST:event_hit

    private void surrender(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surrender
        player.surrender();
        updateGameState();
    }//GEN-LAST:event_surrender

    private void doubleDown(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleDown
        player.doubleDown(shoe.getTopCardFromTopDeck());
        updateGameState();
    }//GEN-LAST:event_doubleDown

    private void stand(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stand
        player.stand();
        updateGameState();
    }//GEN-LAST:event_stand
    
    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        setVisibility(true);
        new Thread(() -> {
            iniciarJuego();
        }).start();
    }//GEN-LAST:event_playButtonMouseClicked
    
    public void setVisibility(boolean visible) {
        hitButton.setVisible(visible);
        surrenderButton.setVisible(visible);
        doubleDownButton.setVisible(visible);
        standButton.setVisible(visible);
    }
    
    private void iniciarJuego() {
        while (play) {
            player.getHand().addCard(shoe.getTopCardFromTopDeck());
            dealer.getHand().addCard(shoe.getTopCardFromTopDeck());
            
            player.getHand().calculateTotalValue();
            dealer.getHand().calculateTotalValue();
            
            // Lógica de blackjack simplificada para fines de demostración
            if (dealer.getHand().checkForBlackjack() && player.getHand().checkForBlackjack()) {
                System.out.println("Es empate.");
                play = false;
            } else if (dealer.getHand().checkForBlackjack()) {
                System.out.println("Crupier recibe blackjack. Pierdes.");
                play = false;
            } else if (player.getHand().checkForBlackjack()) {
                System.out.println("Recibes blackjack. Ganas.");
                play = false;
            }
        }
        updateGameState();
    }

    private void updateGameState() {
        // Aquí puedes actualizar los elementos de la interfaz gráfica, como mostrar el estado de las manos de los jugadores y el crupier
        System.out.println("Estado actualizado: Muestra las cartas en GUI"); // Ejemplo de actualización
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaBlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaBlackJack().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doubleDownButton;
    private javax.swing.JButton hitButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton standButton;
    private javax.swing.JButton surrenderButton;
    // End of variables declaration//GEN-END:variables
}
