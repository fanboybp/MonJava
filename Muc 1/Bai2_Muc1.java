/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Nhập một số tự nhiên n bất kỳ. Tính tích p=1.2.3.....n
package decuong1b2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Decuong1B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tu nhien n: ");
        int n = scanner.nextInt();

        int p = 1; // khoi tao gia tri p ban dau la 1
        for (int i = 2; i <= n; i++) {
            p *= i; // p nhan voi i
        }
        System.out.println("Tich p=1.2.3...." + n + " la: " + p);
    }
}
  
