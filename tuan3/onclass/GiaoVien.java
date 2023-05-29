package onclass;

import java.util.Scanner;

public class GiaoVien extends NhanVienCLC {
    protected float ThuLaoGD;
//constructor
    public GiaoVien(){

    }
    public GiaoVien(double luong, String ngayNhanViec, String pBK, String trinhDo, String nganh, String noiDaoTao,
            float thuLaoGD) {
        super(luong, ngayNhanViec, pBK, trinhDo, nganh, noiDaoTao);
        ThuLaoGD = thuLaoGD;
    }

    public GiaoVien(String ten, int namSinh, double luong, String ngayNhanViec, String pBK, String trinhDo,
            String nganh, String noiDaoTao, float thuLaoGD) {
        super(ten, namSinh, luong, ngayNhanViec, pBK, trinhDo, nganh, noiDaoTao);
        ThuLaoGD = thuLaoGD;
    }
//getset
    public float getThuLaoGD() {
        return ThuLaoGD;
    }

    public void setThuLaoGD(float thuLaoGD) {
        ThuLaoGD = thuLaoGD;
    }

    @Override
    public String toString() {
		return "GiaoVien [ThuLaoGD=" + ThuLaoGD + ", TrinhDo=" + TrinhDo + ", Nganh=" + Nganh + ", NoiDaoTao=" + NoiDaoTao
				+ ", Ten=" + Ten + ", NamSinh=" + NamSinh + "]";
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thu lao GD: ");
        setThuLaoGD(sc.nextFloat());
    }

    public void output(){
        System.out.print(" " + this.toString());
    }
}
