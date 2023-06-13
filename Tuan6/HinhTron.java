package Tuan6;

import java.util.Scanner;

public class HinhTron implements Hinh{
    private int R;

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    @Override
    public String toString() {
        return "HinhVuong [Ban Kinh=" + R +", dien tich=" + DienTich() + "]";
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh : ");
        setR(sc.nextInt());
    }

    @Override
    public void Output() {
        System.out.println(this.toString());
    }

    @Override
    public float DienTich() {
        return (float) PI * R * R;
    }
}
