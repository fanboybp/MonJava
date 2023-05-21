/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Xây dựng chương trình java có 1 lớp chính, 1 lớp ngoài thực hiện các công việc sau:
 //Nhập dữ liệu cho 3 cạnh tam giác
 //Tính diện tích tam giác
 //Tính chu vi tam giác
package muc2b3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class tamgiac{
    Double a;
    Double b;
    Double c;
    Scanner sc=new Scanner(System.in);
    public void nhap()
    {   
       System.out.println("nhap vao a b c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    public Double chuvi()
    {
        return a+b+c;
    }
    public Double dientich()
    {   
        Double p=a+b+c;
        return Math.sqrt(p*((p-a)*(p-b)*(p-c)));
    }
}
public class Muc2B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tamgiac tc1=new tamgiac();
        tc1.nhap();
        System.out.println("canh a :"+tc1.a);
        System.out.println("canh b :"+tc1.b);
        System.out.println("canh c :"+tc1.c);
        if(tc1.a+tc1.b>tc1.c && tc1.a+tc1.c>tc1.b && tc1.b+tc1.c>tc1.a)
        {
            System.out.println("La tam giac ");
            System.out.println("chu vi tam giac :"+tc1.chuvi());
             System.out.println("dien tich tam giac :"+tc1.dientich());
        }
        else
        {
            System.out.println("khong phai la tam giac");
        }
    }
    
}
