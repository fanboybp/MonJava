/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho một số tự nhiên n bất kỳ. Tính tổng s=1+1/2!+1/3!+...+1/n!
package decuong1b1;

/**
 *
 * @author Admin
 */
import java.math.BigInteger;
import java.util.Scanner;
public class Decuong1B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        double sum = 0;
        double giaithua = 1;

        for (int i = 1; i <= n; i++) {
            giaithua *= i;
            sum += 1.0 / giaithua;
        }

        System.out.println("Tong s = " + sum);
    }
}