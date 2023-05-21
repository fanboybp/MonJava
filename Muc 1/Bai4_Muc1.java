/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho một dãy số bất kỳ. In dãy số theo chiều tăng dần
package decuong1b4;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Decuong1B4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {5, 8, 1, 3, 9};

        // Sử dụng phương thức sort của class Arrays để sắp xếp mảng theo chiều tăng dần
        Arrays.sort(arr);

        // In ra mảng đã được sắp xếp
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
