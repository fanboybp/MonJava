Code Cờ caro
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Caro extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    public Caro() {
        initComponents();
    }
    private void gameScore()
    {
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    private void WinningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        //PLAYER X CODING
        if(b1 == ("X")&& b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
        }
        
        if(b4 == ("X")&& b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
        }
        
        if(b7 == ("X")&& b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        
        if(b1 == ("X")&& b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
        
        if(b2 == ("X")&& b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
        }
        
        if(b3 == ("X")&& b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        
        if(b1 == ("X")&& b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        
        if(b3 == ("X")&& b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
        //PLAYER O
        if(b1 == ("O")&& b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
        }
        if(b4 == ("O")&& b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
        }
        if(b7 == ("O")&& b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        if(b1 == ("O")&& b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
        if(b2 == ("O")&& b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
        }
        if(b3 == ("O")&& b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        if(b1 == ("O")&& b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
        }
        if(b3 == ("O")&& b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Win","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
        }
    }
@SuppressWarnings("unchecked")
private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
          // TODO add your handling code here:
        txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn1.setForeground(Color.RED);
        }
        else
        {
            txtbtn1.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }
private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(Color.RED);
        }
        else
        {
            txtbtn2.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }
private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(Color.RED);
        }
        else
        {
            txtbtn3.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }
    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(Color.RED);
        }
        else
        {
            txtbtn4.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }
private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(Color.RED);
        }
        else
        {
            txtbtn5.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(Color.RED);
        }
        else
        {
            txtbtn6.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(Color.RED);
        }
        else
        {
            txtbtn7.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(Color.RED);
        }
        else
        {
            txtbtn8.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }                                       

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(Color.RED);
        }
        else
        {
            txtbtn9.setForeground(Color.MAGENTA);
        }
        choose_a_Player();
        WinningGame();
    }
private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
    }                                        

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }
public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caro().setVisible(true);
            }
        });
    }
// Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration                   
}