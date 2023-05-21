Code Calculator
import javax.swing.JOptionPane;

public class Tinh extends javax.swing.JFrame {

    public Tinh() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
private void CongActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        StringBuilder ab = new StringBuilder();
        String num1 = txtFirstNumber.getText();
        if (num1.equals("")){
            ab.append("First number is required!\n");
        }
        String num2 = txtSecondNumber.getText();
        if (num2.equals("")){
            ab.append("Second number is required! \n");
        }
        if (ab.length()>0){
            JOptionPane.showMessageDialog(this,ab.toString());
            return;
        }
        try{
            int n1 =Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            txtResult.setText(""+(n1+n2));
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }        
private void TruActionPerformed(java.awt.event.ActionEvent evt) {                                    
        StringBuilder ab = new StringBuilder();
        String num1 = txtFirstNumber.getText();
        if (num1.equals("")){
            ab.append("First number is required!\n");
        }
        String num2 = txtSecondNumber.getText();
        if (num2.equals("")){
            ab.append("Second number is required! \n");
        }
        if (ab.length()>0){
            JOptionPane.showMessageDialog(this,ab.toString());
            return;
        }
        try{
            int n1 =Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            txtResult.setText(""+(n1-n2));
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }                                   

    private void NhanActionPerformed(java.awt.event.ActionEvent evt) {                                     
        StringBuilder ab = new StringBuilder();
        String num1 = txtFirstNumber.getText();
        if (num1.equals("")){
            ab.append("First number is required!\n");
        }
        String num2 = txtSecondNumber.getText();
        if (num2.equals("")){
            ab.append("Second number is required! \n");
        }
        if (ab.length()>0){
            JOptionPane.showMessageDialog(this,ab.toString());
            return;
        }
        try{
            int n1 =Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            txtResult.setText(""+(n1*n2));
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }                                    

    private void ChiaActionPerformed(java.awt.event.ActionEvent evt) {
		StringBuilder ab = new StringBuilder();
        String num1 = txtFirstNumber.getText();
        if (num1.equals("")){
            ab.append("First number is required!\n");
        }
        String num2 = txtSecondNumber.getText();
        if (num2.equals("")){
            ab.append("Second number is required! \n");
        }
        if (ab.length()>0){
            JOptionPane.showMessageDialog(this,ab.toString());
            return;
        }
        try{
            int n1 =Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            txtResult.setText(""+(n1/n2));
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }               
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Chia;
    private javax.swing.JButton Cong;
    private javax.swing.JButton Nhan;
    private javax.swing.JButton Tru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtFirstNumber;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSecondNumber;
    // End of variables declaration                   
}
