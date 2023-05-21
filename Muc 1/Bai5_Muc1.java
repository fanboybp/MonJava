/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho một dãy số bất kỳ. In max, min của dãy số đó
package decuong.pkg1b5;

/**
 *
 * @author Admin
 */
public class DeCuong1B5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {5, 6, 2, 9, 1, 8, 4};
    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);     
    }
    
}
