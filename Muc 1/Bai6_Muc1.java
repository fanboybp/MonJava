/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho một dãy số bấy kỳ. In ra các số chẵn và số lẽ trên 2 dòng khác nhau
package decuong1b6;

/**
 *
 * @author Admin
 */
public class Decuong1B6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Cac so chan la:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                 System.out.print(arr[i] + " ");
             }
        }

        System.out.println("\nCac so le la:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
