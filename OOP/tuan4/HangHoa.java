package OOP.tuan4;

import java.util.Scanner;

public class HangHoa {
    protected String MaHang, TenHang;
    protected long DonGia;
//declare getset
    public String getMaHang() {
        return MaHang;
    }
    public void setMaHang(String maHang) {
        MaHang = maHang;
    }
    public String getTenHang() {
        return TenHang;
    }
    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }
    public long getDonGia() {
        return DonGia;
    }
    public void setDonGia(long donGia) {
        DonGia = donGia;
    }

//tostring
@Override
    public String toString() {
        return "HangHoa [MaHang=" + MaHang + ", TenHang=" + TenHang + ", DonGia=" + DonGia + "]";
    }

//input
    protected void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        setMaHang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        setTenHang(sc.nextLine());
        System.out.print("Nhap don gia: ");
        setDonGia(sc.nextLong());
    }

//output
    protected void output(){
        System.out.println(this.toString());
    }
}
