/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho 2 xâu s1 và s2. Chèn xâu s1 vào giữa xâu s2. In kết quả ra màn hình
package decuong1b10;

/**
 *
 * @author Admin
 */
public class DeCuong1B10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "WORD";
        String s2 = "hello  hello ";
        int midpoint = s2.length() / 2;
        String result = s2.substring(0, midpoint) + s1 + s2.substring(midpoint);
        System.out.println(result); // in kết quả ra màn hình
    }       
}
