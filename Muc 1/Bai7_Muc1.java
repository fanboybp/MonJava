/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Cho một xâu ký tự bất kỳ. Đếm xem trong xâu có bao nhiêu lần xuất hiện của xâu con “abc”
package decuong1b7;

/**
 *
 * @author Admin
 */
public class DeCuong1B7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "HelloabcabcWorldabc";
        String subStr = "abc";
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        System.out.println("So lan xuat hien cua \"" + subStr + "\" trong \"" + str + "\" la    : " + count);
    }
}
    

