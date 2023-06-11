package onclass;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    protected double luong;
    protected String NgayNhanViec, PBK;
//constructor
    public NhanVien(){
        
    }
    public NhanVien(double luong, String ngayNhanViec, String pBK) {
        this.luong = luong;
        NgayNhanViec = ngayNhanViec;
        PBK = pBK;
    }
    public NhanVien(String ten, int namSinh, double luong, String ngayNhanViec, String pBK) {
        super(ten, namSinh);
        this.luong = luong;
        NgayNhanViec = ngayNhanViec;
        PBK = pBK;
    }
//getset
    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getNgayNhanViec() {
        return NgayNhanViec;
    }
    public void setNgayNhanViec(String ngayNhanViec) {
        NgayNhanViec = ngayNhanViec;
    }
    public String getPBK() {
        return PBK;
    }
    public void setPBK(String pBK) {
        PBK = pBK;
    }


    @Override
    public String toString() {
        return "NhanVien [luong=" + luong + ", NgayNhanViec=" + NgayNhanViec + ", PBK=" + PBK + "]";
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        setLuong(sc.nextDouble());
        System.out.print("Nhap ngay nhan viec: ");
        setNgayNhanViec(sc.next());
        System.out.print("Nhap phong ban khoa: ");
        setPBK(sc.next());
    }

    public void output(){
        System.out.print(" " + toString());
    }

}
