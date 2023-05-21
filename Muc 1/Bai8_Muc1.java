/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Cho xâu S bất kỳ. In xâu S1 là xâu đảo ngược của xâu S
package decuong1b8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DeCuong1B8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap xau S: ");
        String s = scanner.nextLine();
        
        String s1 = new StringBuilder(s).reverse().toString();
        System.out.println("Xau S1 la: " + s1);
    }
}
    

