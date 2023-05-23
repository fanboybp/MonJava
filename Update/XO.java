
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class GameXOorYT extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    /**
     * Creates new form GameXOorYT
     */
    public GameXOorYT() {
        initComponents();
    }
    
    private void gameScore(){
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }
    
    private void chonmotplayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }else{
            startGame = "X";
        }
    }
    
    private void winGame(){
        String b1 = p1.getText();
        String b2 = p2.getText();
        String b3 = p3.getText();
        String b4 = p4.getText();
        String b5 = p5.getText();
        String b6 = p6.getText();
        String b7 = p7.getText();
        String b8 = p8.getText();
        String b9 = p9.getText();
        
        if(b1==("X") && b2==("X") && b3==("X")){
            xCount++;
            gameScore();
            p1.setBackground(Color.ORANGE);
            p2.setBackground(Color.ORANGE);
            p3.setBackground(Color.ORANGE);
            
            System.out.print("youwwin");    
            System.exit(0);
        }     
        if(b4==("X") && b5==("X") && b6==("X")){
            xCount++;
            gameScore();
            p4.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p6.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b7==("X") && b8==("X") && b9==("X")){
            xCount++;
            gameScore();
            p7.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            p9.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b1==("X") && b4==("X") && b7==("X")){
            xCount++;
            gameScore();
            p1.setBackground(Color.ORANGE);
            p4.setBackground(Color.ORANGE);
            p7.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b2==("X") && b5==("X") && b8==("X")){
            xCount++;
            gameScore();
            p2.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b3==("X") && b6==("X") && b9==("X")){
            xCount++;
            gameScore();
            p2.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b1==("X") && b5==("X") && b9==("X")){
            xCount++;
            gameScore();
            p1.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b3==("X") && b5==("X") && b7==("X")){
            xCount++;
            gameScore();
            p3.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p7.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b1==("O") && b2==("O") && b3==("O")){
            xCount++;
            gameScore();
            p1.setBackground(Color.ORANGE);
            p2.setBackground(Color.ORANGE);
            p3.setBackground(Color.ORANGE);
            
            System.out.print("youwwin");    
            System.exit(0);
        }     
        if(b4==("O") && b5==("O") && b6==("O")){
            xCount++;
            gameScore();
            p4.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p6.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b7==("O") && b8==("O") && b9==("O")){
            xCount++;
            gameScore();
            p7.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            p9.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b1==("O") && b4==("O") && b7==("O")){
            xCount++;
            gameScore();
            p1.setBackground(Color.ORANGE);
            p4.setBackground(Color.ORANGE);
            p7.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b2==("O") && b5==("O") && b8==("O")){
            xCount++;
            gameScore();
            p2.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b3==("O") && b6==("O") && b9==("O")){
            xCount++;
            gameScore();
            p2.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b1==("O") && b5==("O") && b9==("O")){
            xCount++;
            gameScore();
            p1.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p8.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
        if(b3==("O") && b5==("O") && b7==("O")){
            xCount++;
            gameScore();
            p3.setBackground(Color.ORANGE);
            p5.setBackground(Color.ORANGE);
            p7.setBackground(Color.ORANGE);
            System.out.print("youwwin");    
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });

        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });

        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });

        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });

        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerx.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        playerx.setText("X:");

        playero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        playero.setText("O:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("xxxxxxx");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("oooooo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playerx)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(playero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtreset, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtexit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtexit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
        p1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p1.setForeground(Color.red);
        }else{
            p1.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p1ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        p1.setText(null);
        p2.setText(null);
        p3.setText(null);
        p4.setText(null);
        p5.setText(null);
        p6.setText(null);
        p7.setText(null);
        p8.setText(null);
        p9.setText(null);
    }//GEN-LAST:event_txtresetActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
        p4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p4.setForeground(Color.red);
        }else{
            p4.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p4ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        // TODO add your handling code here:
        p7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p7.setForeground(Color.red);
        }else{
            p7.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        // TODO add your handling code here:
        p8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p8.setForeground(Color.red);
        }else{
            p8.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
        p9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p9.setForeground(Color.red);
        }else{
            p9.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p9ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
        p5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p5.setForeground(Color.red);
        }else{
            p5.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
        p6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p6.setForeground(Color.red);
        }else{
            p6.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p6ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
        p3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p3.setForeground(Color.red);
        }else{
            p3.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p3ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
        p2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            p2.setForeground(Color.red);
        }else{
            p2.setForeground(Color.MAGENTA);
        }
        chonmotplayer();
        winGame();
    }//GEN-LAST:event_p2ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
         {
        System.exit(0);
    }
    }//GEN-LAST:event_txtexitActionPerformed
   
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
            java.util.logging.Logger.getLogger(GameXOorYT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameXOorYT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameXOorYT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameXOorYT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameXOorYT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
