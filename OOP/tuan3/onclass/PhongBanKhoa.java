package onclass;

import java.util.Scanner;

public class PhongBanKhoa extends NhanVien{
    protected String MaPBK, TenPBK;
//constructor
    public PhongBanKhoa(){

    }
    public PhongBanKhoa(double luong, String ngayNhanViec, String pBK, String maPBK, String tenPBK) {
        super(luong, ngayNhanViec, pBK);
        MaPBK = maPBK;
        TenPBK = tenPBK;
    }

    public PhongBanKhoa(String ten, int namSinh, double luong, String ngayNhanViec, String pBK, String maPBK,
            String tenPBK) {
        super(ten, namSinh, luong, ngayNhanViec, pBK);
        MaPBK = maPBK;
        TenPBK = tenPBK;
    }
//getset
    public String getMaPBK() {
        return MaPBK;
    }

    public void setMaPBK(String maPBK) {
        MaPBK = maPBK;
    }

    public String getTenPBK() {
        return TenPBK;
    }

    public void setTenPBK(String tenPBK) {
        TenPBK = tenPBK;
    }

    @Override
    public String toString() {
        return "PhongBanKhoa [MaPBK=" + MaPBK + ", TenPBK=" + TenPBK + "]";
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma PBK: ");
        setMaPBK(sc.next());
        System.out.print("Nhap Ten PBK: ");
        setTenPBK(sc.next());
    }

    public void output(){
        System.out.print(" " + toString());
    }
}
