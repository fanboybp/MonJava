/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Xây dựng chương trình java có 1 lớp chính, 1 lớp nội xuất ra màn hình:
// 10 bộ số đầu tiên khác 0 của 5
//10 số tận cùng bằng 3
// Bình phương các số từ 1 đến 50 chia hết cho 12
package muc2b5;

/**
 *
 * @author Admin
 */
class lopnoicau5 {
    public void boso5()
    {
        for(int i=1;i<=50;i++)
        {
            if(i%5==0)
            {
                System.out.print(" "+i);
            }
        }
    }
    public void sotancung()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(" "+((i*10)+3));
        }
    }
    public void chiahet12()
    {
        for(int i=1;i<=50;i++)
        {
            if(i%12==0)
            {
                System.out.print(" "+i*i);
            }
        }
    }
}
public class Muc2B5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        lopnoicau5 a=new lopnoicau5();
        System.out.println("binh phuong cac so tu 1 den 50 chia het cho 12");
        a.chiahet12();
         System.out.println("\n10 boi so dau tien khac 0 cua 5");
        a.boso5();
         System.out.println("\n10 so tan cung bang 3");
        a.sotancung();
        
    }
    
}
