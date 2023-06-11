package onclass;

import java.util.Scanner;

public class NVQuanLy extends NhanVienCLC {
    protected float PhuCapCV;
//constructor
    public NVQuanLy(){

    }
    public NVQuanLy(double luong, String ngayNhanViec, String pBK, String trinhDo, String nganh, String noiDaoTao,
            float phuCapCV) {
        super(luong, ngayNhanViec, pBK, trinhDo, nganh, noiDaoTao);
        PhuCapCV = phuCapCV;
    }

    public NVQuanLy(String ten, int namSinh, double luong, String ngayNhanViec, String pBK, String trinhDo,
            String nganh, String noiDaoTao, float phuCapCV) {
        super(ten, namSinh, luong, ngayNhanViec, pBK, trinhDo, nganh, noiDaoTao);
        PhuCapCV = phuCapCV;
    }
//getset
    public float getPhuCapCV() {
        return PhuCapCV;
    }

    public void setPhuCapCV(float phuCapCV) {
        PhuCapCV = phuCapCV;
    }
      
    @Override
    public String toString() {
        return "NVQuanLy [PhuCapCV=" + PhuCapCV + ", TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", noiDaoTao="
        + NoiDaoTao + ", Ten=" + Ten + ", namSinh=" + NamSinh + "]";    
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phu cap cong viec cua nhan vien: ");
        setPhuCapCV(sc.nextFloat());
    }
    
    public void output(){
        System.out.print(" " + this.toString());
    }
}
