/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class MayTinhBe1 extends javax.swing.JFrame {

    Double num1,num2,ketqua;
    String operator;
    
    /**
     * Creates new form MayTinhBe1
     */
    public MayTinhBe1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        Tru = new javax.swing.JButton();
        Nhan = new javax.swing.JButton();
        Chia = new javax.swing.JButton();
        Cong = new javax.swing.JButton();
        XoaAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caculator");

        Tru.setText("-");
        Tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TruActionPerformed(evt);
            }
        });

        Nhan.setText("*");
        Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhanActionPerformed(evt);
            }
        });

        Chia.setText("/");
        Chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChiaActionPerformed(evt);
            }
        });

        Cong.setText("+");
        Cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongActionPerformed(evt);
            }
        });

        XoaAll.setText("Xoa trang");
        XoaAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaAllActionPerformed(evt);
            }
        });

        jLabel1.setText("So A");

        jLabel2.setText("So B ");

        bang.setText("Ket Qua");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bang)
                            .addComponent(XoaAll))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtb, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txta)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cong)
                        .addGap(18, 18, 18)
                        .addComponent(Tru)
                        .addGap(18, 18, 18)
                        .addComponent(Nhan)
                        .addGap(18, 18, 18)
                        .addComponent(Chia)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bang))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tru)
                    .addComponent(Nhan)
                    .addComponent(Chia)
                    .addComponent(Cong)
                    .addComponent(XoaAll))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongActionPerformed
        // TODO add your handling code here:
        num1 = Double.valueOf(txta.getText());
        operator = "+";        
        txta.setText("");
    }//GEN-LAST:event_CongActionPerformed

    private void TruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TruActionPerformed
        // TODO add your handling code here:
        num1 = Double.valueOf(txta.getText());
        operator = "-";
        txta.setText("");
    }//GEN-LAST:event_TruActionPerformed

    private void NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhanActionPerformed
        // TODO add your handling code here:
        num1 = Double.valueOf(txta.getText());
        operator = "*";
        txta.setText("");
    }//GEN-LAST:event_NhanActionPerformed

    private void ChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChiaActionPerformed
        // TODO add your handling code here:\
        num1 = Double.valueOf(txta.getText());
        operator = "/";
        txta.setText("");
    }//GEN-LAST:event_ChiaActionPerformed

    private void XoaAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaAllActionPerformed
        // TODO add your handling code here:
        txta.setText("");
        txtb.setText("");
        txtc.setText("");
    }//GEN-LAST:event_XoaAllActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
        // TODO add your handling code here:
        if(operator.equals("+")){
            num2 = Double.valueOf(txtb.getText());
            ketqua =   num1+num2;      
        }if(operator.equals("-")){
            num2 = Double.valueOf(txtb.getText());
            ketqua =   num1-num2;
        }if(operator.equals("*")){
            num2 = Double.valueOf(txtb.getText());
            ketqua =   num1*num2;
        }if(operator.equals("/")){
            num2 = Double.valueOf(txtb.getText());
            ketqua =   num1/num2;
        }
        txtc.setText(""+ketqua);
    }//GEN-LAST:event_bangActionPerformed

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
            java.util.logging.Logger.getLogger(MayTinhBe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinhBe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinhBe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinhBe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MayTinhBe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chia;
    private javax.swing.JButton Cong;
    private javax.swing.JButton Nhan;
    private javax.swing.JButton Tru;
    private javax.swing.JButton XoaAll;
    private javax.swing.JButton bang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    // End of variables declaration//GEN-END:variables
}
