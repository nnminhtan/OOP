package Tuan6;

import java.util.Scanner;

public class HinhCN implements Hinh{
    private int dai, rong;

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    @Override
    public String toString() {
        return "HinhCN [dai=" + dai + ", rong=" + rong + ", dien tich=" + DienTich() + "]";
    }

    @Override
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        setDai(sc.nextInt());
        System.out.print("Nhap chieu rong: ");
        setRong(sc.nextInt());
    }

    @Override
    public void Output() {
        System.out.println(this.toString());
    }

    @Override
    public float DienTich() {
        return (float)dai*rong;
    }
    
}
