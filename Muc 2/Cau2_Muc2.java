/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Xây dựng chương trình java có 1 lớp chính, 1 lớp nội thực hiện các công việcsau:
// Nhập thông tin sinh viên: họ tên, mã sinh viên, điểm toán, điểm văn
// Tính điểm trung bình của 2 điểm trên
// Xếp loại sinh viên theo điểm trung bình (<5 loại kém; >7 loại giỏi; còn lại loại khá)
package muc2b2;

import java.util.Scanner;

 class lopnoicau2 {
    String Hoten;
    String Masv;
    double diemtoan;
    double diemvan;
    Scanner sc=new Scanner(System.in);
    public void nhapthongtin()
    {
        System.out.println("nhap ten cua ban");
        Hoten=sc.nextLine();
         System.out.println("nhap ma sinh vien cua ban");
        Masv=sc.nextLine();
        System.out.println("nhap diem toan va diem van");
        diemtoan=sc.nextDouble();
        diemvan=sc.nextDouble();
    }
   public double dtb()
    {
        return (diemtoan+diemvan)/2;
    }
    public void sapxep()
    {
        if(dtb()<5)
        {
            System.out.println("Loai kem");
        }
        else if(dtb()>7)
        {
            System.out.println("Loai gioi");
        }
        else
        {
            System.out.println("loai kha");
        }
    }
 } 

/**
 *
 * @author Admin
 */
public class Muc2B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lopnoicau2 sv1=new lopnoicau2();
        sv1.nhapthongtin();
        System.out.println("Ho ten cua sinh vien:"+sv1.Hoten);
        System.out.println("Ma cua sinh vien:"+sv1.Masv);
        System.out.println("diem toan :"+sv1.diemtoan);
        System.out.println("diem van :"+sv1.diemvan);
        System.out.println("diem trung binh :"+sv1.dtb());
        sv1.sapxep();
    }
    
}
