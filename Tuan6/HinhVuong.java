package Tuan6;

import java.util.Scanner;

public class HinhVuong implements Hinh {
    private int canh;

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong [canh=" + canh +", dien tich=" + DienTich() + "]";
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        setCanh(sc.nextInt());
    }

    @Override
    public void Output() {
        System.out.println(this.toString());
    }

    @Override
    public float DienTich() {
        return (float)canh*canh;
    }
    
}
