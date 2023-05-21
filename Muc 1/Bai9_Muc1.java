/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho xâu ký tự là họ tên của bạn. In tách họ và tên bạn.
package decuong1b9;

/**
 *
 * @author Admin
 */
public class DeCuong1B9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hoTen = "Lam Thanh Tuan";
        
        // Tach ho va ten bang ham split()
        String[] arrHoTen = hoTen.split(" ");
        String ho = arrHoTen[0];
        String ten = arrHoTen[arrHoTen.length - 1];
        
        // In ra ho va ten
        System.out.println("Ho: " + ho);
        System.out.println("Ten: " + ten);
    }
    
}
