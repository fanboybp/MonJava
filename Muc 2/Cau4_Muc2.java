/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Xây dựng chương trình java có 1 lớp chính, 1 lớp ngoài thực hiện các công việc sau:
// Nhập dữ liệu cho 3 cạnh tam giác
// Tính diện tích tam giác
 //Tính chu vi tam giác
package muc2b4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Muc2B4 {

    /**
     * @param args the command line arguments
     */
   class TamGiac {
   private double canh1, canh2, canh3;

   // Phương thức nhập dữ liệu cho 3 cạnh tam giác
   public void nhapDuLieu() {
      Scanner sc = new Scanner(System.in);

      System.out.print("Nhập độ dài cạnh 1: ");
      canh1 = sc.nextDouble();
      System.out.print("Nhập độ dài cạnh 2: ");
      canh2 = sc.nextDouble();
      System.out.print("Nhập độ dài cạnh 3: ");
      canh3 = sc.nextDouble();
   }

   // Phương thức tính chu vi tam giác
   public double tinhChuVi() {
      return canh1 + canh2 + canh3;
   }

   // Phương thức tính diện tích tam giác
   public double tinhDienTich() {
      double p = (canh1 + canh2 + canh3) / 2;
      return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
   }
}
    public static void main(String[] args) {
        // TODO code application logic here
      TamGiac tg = new TamGiac();
      tg.nhapDuLieu();
      System.out.println("Chu vi tam giác là: " + tg.tinhChuVi());
      System.out.println("Diện tích tam giác là: " + tg.tinhDienTich());
   }
 }
    

