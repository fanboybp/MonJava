Code Progress bar click
import java.awt.Color;
public class click extends javax.swing.JFrame {
    public click() {
        initComponents();
        progress.setStringPainted(true);
        progress.setForeground(Color.black);
    }
@SuppressWarnings("unchecked")
private void progressAncestorAdded(javax.swing.event.AncestorEvent evt) {                                       
        // TODO add your handling code here:
        
    }
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int value = 0;
        value = progress.getValue() + 10;
        if(value > progress.getMaximum()){
            value = progress.getMaximum();
        }
        progress.setValue(value);
    }    
public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new click().setVisible(true);
            }
        });
    }
// Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JProgressBar progress;
    // End of variables declaration                   
}