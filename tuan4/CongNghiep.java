package OOP.tuan4;

import java.util.Scanner;

public class CongNghiep extends HangDM{
    private int TrongLuong;

    //getset
    public int getTrongLuong() {
        return TrongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        TrongLuong = trongLuong;
    }
//tostring
    @Override
    public String toString() {
        return "CongNghiep [MaHang=" + MaHang + ", TenHang=" + TenHang + ", DonGia=" + DonGia + ", ThoiGianBH=" + ThoiGianBH + ", DienAp=" + DienAp + ", CongSuat=" + CongSuat 
        + ", QG=" + QG + "TrongLuong=" + TrongLuong + "]";
    }

//input
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trong luong: ");
        setTrongLuong(sc.nextInt());
    }

//output
    public void output(){
        System.out.println(this.toString());
    }

}
