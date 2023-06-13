package Tuan6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int SL = sc.nextInt();
        Hinh ds[] = new Hinh[SL];
        for (int i = 0; i < ds.length; i++) {
            System.out.println("1: Hinh Vuong");
            System.out.println("2: Hinh Chu Nhat");
            System.out.println("3: Hinh Tron");
            int chon = sc.nextInt();
            switch(chon) {
                case 1:{
                    ds[i] = new HinhVuong();
                    ds[i].Input();
                    ds[i].Output();
                    break;
                }	
                case 2:{
                    ds[i] = new HinhCN();
                    ds[i].Input();
                    ds[i].Output();
                    break;
                }
                case 3:{
                    ds[i] = new HinhTron();
                    ds[i].Input();
                    ds[i].Output();
                    break;
                }
                default:{
                    System.out.println("phai chon 1!");
                    break;
                }
            }
        }
    }
}
