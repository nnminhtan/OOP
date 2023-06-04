package OOP.tuan4;

import java.util.Scanner;

public class GiaDung extends HangDM{
    private int SoLuong;

//getset
    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

//tostring
    @Override
    public String toString() {
        return "GiaDung [MaHang=" + MaHang + ", TenHang=" + TenHang + ", DonGia=" + DonGia + ", ThoiGianBH=" + ThoiGianBH + ", DienAp=" + DienAp + ", CongSuat=" + CongSuat 
        + ", QG=" + QG + "SoLuong=" + SoLuong + "]";
    }

//input
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        setSoLuong(sc.nextInt());
    }

//output
    public void output(){
        System.out.println(this.toString());
    }

}
