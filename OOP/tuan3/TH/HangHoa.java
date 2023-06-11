package TH;

import java.util.Scanner;

public class HangHoa {
    protected String MaHang, TenHang, NSX;
    protected double Gia;

    public HangHoa(){

    }

    public HangHoa(String maHang, String tenHang, String nSX, double gia) {
        this.MaHang = maHang;
        this.TenHang = tenHang;
        this.NSX = nSX;
        this.Gia = gia;
    }

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
    public String getNSX() {
        return NSX;
    }
    public void setNSX(String nSX) {
        NSX = nSX;
    }
    public double getGia() {
        return Gia;
    }
    public void setGia(double gia) {
        Gia = gia;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        setMaHang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        setTenHang(sc.nextLine());
        System.out.print("Nhap NSX: ");
        setNSX(sc.nextLine());
        System.out.print("Nhap gia: ");
        setGia(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "HangHoa [MaHang=" + MaHang + ", TenHang=" + TenHang + ", NSX=" + NSX + ", Gia=" + Gia + "]";
    }

    public void output(){
        if(MaHang != null)
            System.out.printf(this.toString());
    }
	public static void add(HangDienMay hangDienMay) {
	}
    public static void add(HangTP hangTP) {
	}
}

