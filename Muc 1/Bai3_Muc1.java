/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho một dãy số bấy kỳ. In ra các số nguyên tố thuộc dãy đó (nếu có).
package decuong1b3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Decuong1B3 {

    public static boolean isPrime(int num) { // Hàm kiểm tra số nguyên tố
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap day so khong cach boi khoang trang: ");
        String input = scanner.nextLine();
        
        String[] numbers = input.split(" "); // Tách các số trong dãy
        
        System.out.print("Cac so nguyen trong day la: " );
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (isPrime(num)) {
                System.out.print(num + "");
            }
        }
    }
    
}
