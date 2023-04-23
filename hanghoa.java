package OOP.tuan1;

import java.util.Scanner;

public class hanghoa {
    protected String MaHang, TenHang, NSX;
    protected double Gia;
    protected void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        MaHang=sc.nextLine();
        System.out.print("Nhap ten hang: ");
        TenHang=sc.nextLine();
        System.out.print("Nhap NSX: ");
        NSX=sc.nextLine();
        System.out.print("Nhap gia: ");
        Gia=sc.nextDouble();
    }
    protected void output(){
        System.out.print(MaHang + " " + TenHang + " " + NSX);
    }
    protected double Tinh_gia_ban(){
        return Gia;
    }

}
