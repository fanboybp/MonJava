Code Giải PT bậc 2
package BT75;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class bt75 extends JFrame {
    JTextField txtA,txtB,txtC,txtKQ;
    JButton btGiai,btXoa,btThoat;
    private void addControl()
    {
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        JPanel pnTop=new JPanel();
        JLabel lbltitle=new JLabel("Giai phuong trinh bac 2");
        Font ft=new Font("Arial",Font.BOLD,25);
        lbltitle.setFont(ft);
        lbltitle.setForeground(Color.BLACK);
        pnTop.setBackground(Color.GRAY);
        pnTop.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnTop.add(lbltitle);
        con.add(pnTop,BorderLayout.NORTH);
        JPanel pnCenter=new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
        con.add(pnCenter,BorderLayout.CENTER);
        //Định dạng cho txtA
        JPanel pnA=new JPanel();
        pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblA=new JLabel("A: ");
        Font ftlaybel=new Font("Arial",Font.BOLD,14);
        lblA.setFont(ftlaybel);
        txtA=new JTextField(20);
        pnA.add(lblA);
        pnA.add(txtA);
        pnCenter.add(pnA);
        //Định dạng cho txtB
        JPanel pnB=new JPanel();
        pnA.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblB=new JLabel("B: ");
        lblB.setFont(ftlaybel);
        txtB=new JTextField(20);
        pnB.add(lblB);
        pnB.add(txtB);
        pnCenter.add(pnB);
        //Định dạng cho txtC
        JPanel pnC=new JPanel();
        pnC.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblC=new JLabel("C: ");
        lblC.setFont(ftlaybel);
        txtC=new JTextField(20);
        pnC.add(lblC);
        pnC.add(txtC);
        pnCenter.add(pnC);
        //Tạo JPanel chứa kết quả
        JPanel pnKQ=new JPanel();
        pnKQ.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblKQ=new JLabel("Ket qua: ");
        lblKQ.setFont(ftlaybel);
        pnKQ.add(lblKQ);
        pnCenter.add(pnKQ);
        JPanel pnOutput=new JPanel();
        txtKQ=new JTextField(22);
        txtKQ.setEnabled(false);
        txtKQ.setHorizontalAlignment(SwingConstants.CENTER);
        pnOutput.setLayout(new FlowLayout(FlowLayout.CENTER));
        pnOutput.add(txtKQ);
        pnCenter.add(pnOutput);
        //Tạo đường viền xung quanh ba biến a,b,c
        TitledBorder borderCenter=new TitledBorder(BorderFactory.createLineBorder(Color.red),"Nhap a,b,c");
        JPanel pnBot=new JPanel();
        pnBot.setLayout(new FlowLayout(FlowLayout.CENTER));
        btGiai=new JButton("Giai");
        btThoat=new JButton("Thoat");
        btXoa=new JButton("Xoa");
        pnBot.add(btGiai);
        pnBot.add(btThoat);
        pnBot.add(btXoa);
        TitledBorder borderBot=new TitledBorder(BorderFactory.createLineBorder(Color.yellow),"Chon thao tac");
        pnBot.setBorder(borderCenter);
        pnCenter.setBorder(borderCenter);
        con.add(pnBot,BorderLayout.SOUTH);
    }
    //Thêm các sự kiện cho Button
    private void addEvents()
    {
        btThoat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                int ret=JOptionPane.showConfirmDialog(null,"Ban chac chan muon thoat?","Thoat",JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        btXoa.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                txtA.setText("");
                txtB.setText("");
                txtC.setText("");
                txtKQ.setText("");
            }
        });
        btGiai.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                try{
                    double a=Double.parseDouble(txtA.getText());
                    double b=Double.parseDouble(txtB.getText());
                    double c=Double.parseDouble(txtC.getText());
                    double delta=b*b-4*a*c;
                    double x1,x2;
                    //tính nghiệm
                    if(delta>0)
                    {
                        x1=(double)((-b+Math.sqrt(delta))/(2*a));
                        x2=(double)((-b-Math.sqrt(delta))/(2*a));
                        txtKQ.setText("Phương trình có 2 nghiệm là: "+"x1= "+x1+" va x2= "+x2);
                    }
                    else if(delta==0)
                    {
                        x1=(-b/(2*a));
                        txtKQ.setText("Phương trình có nghiệm kép: "+"x1 = x2 = "+x1);
                    }
                    else
                    {
                        txtKQ.setText("Phuong trinh vo nghiem");
                    }
                }catch(Exception e2)
                {
                    JOptionPane.showMessageDialog(null,"Input khong hop le");
                }
            }
        });
        
    }
    public bt75()
    {
        super("Giai phuong trinh bac 2");
        addControl();
        addEvents();
    }
    public static void main(String[] args){
        bt75 ui=new bt75();
        ui.setSize(400,300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }

    
}