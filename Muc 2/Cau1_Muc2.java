/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*Xây dựng chương trình java có 1 lớp chính, 1 lớp ngoài thực hiện các công
việc sau:
- Nhập thông tin sinh viên: họ tên, mã sinh viên, điểm toán, điểm văn
- Tính điểm trung bình của 2 điểm trên
- Xếp loại sinh viên theo điểm trung bình (<5 loại kém; >7 loại giỏi; còn lại loại
khá)
*/
package muc2b1;

import java.util.Scanner;
 
class ngoai {
    String hoten;
        String masv;
        double diemtoan;
        double diemvan;
    public void nhapthongtin()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ten cua ban");
        hoten=sc.nextLine();
        System.out.println("nhap vao ma sinh vien");
        masv=sc.nextLine();
        System.out.println("nhap vao diem toan va diem van");
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
            System.out.println("Loai giỏi");
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
public class Muc2B1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
    ngoai sv1=new ngoai();
    sv1.nhapthongtin();
    System.out.println("ho ten:"+sv1.hoten);
    System.out.println("ma sinh vien:"+sv1.masv);
    System.out.println("diem van:"+sv1.diemtoan);
    System.out.println("diem toan:"+sv1.diemvan);
    System.out.println("diem trung binh:"+sv1.dtb());
    sv1.sapxep();
    }
 }
    

