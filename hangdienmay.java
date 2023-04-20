package OOP.tuan1;

import java.util.Scanner;

public class hangdienmay extends hanghoa{
    protected int Warranty_time, DienAp, CongSuat;
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        Warranty_time= sc.nextInt();
        System.out.print("Nhap dien ap: ");
        DienAp=sc.nextInt();
        System.out.print("Nhap cong suat");
        CongSuat=sc.nextInt();
        sc.close();
    }
    public void output(){
        super.output();
        System.out.print(" " + DienAp + " " + CongSuat + " " + Warranty_time);
    }
    public double Tinh_gia_ban(){
        super.Tinh_gia_ban();
        return (Gia + (Gia*10/100));
    }
}
