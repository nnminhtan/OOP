package onclass;

import java.util.Scanner;

public class NhanVienCLC extends NhanVien {
    protected String TrinhDo;
    protected String Nganh;
    protected String NoiDaoTao;
//constructor
    public NhanVienCLC(){

    }
    public NhanVienCLC(double luong, String ngayNhanViec, String pBK, String trinhDo, String nganh, String noiDaoTao) {
        super(luong, ngayNhanViec, pBK);
        TrinhDo = trinhDo;
        Nganh = nganh;
        NoiDaoTao = noiDaoTao;
    }

    public NhanVienCLC(String ten, int namSinh, double luong, String ngayNhanViec, String pBK, String trinhDo,
            String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhanViec, pBK);
        TrinhDo = trinhDo;
        Nganh = nganh;
        NoiDaoTao = noiDaoTao;
    }
//getset
    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        TrinhDo = trinhDo;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public String getNoiDaoTao() {
        return NoiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        NoiDaoTao = noiDaoTao;
    }

    @Override
    public String toString() {
		return "NhanVienCLCao [trinhDo=" + TrinhDo + ", nganh=" + Nganh + ", noiDaoTao=" + NoiDaoTao + ", hoTen="
				+ Ten + ", namSinh=" + NamSinh + "]";    
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap trinh do: ");
        setTrinhDo(sc.next());
        System.out.print("Nhap nganh: ");
        setNganh(sc.next());
        System.out.print("Nhap noi dao tao: ");
        setNoiDaoTao(sc.next());
    }

    public void output(){
        System.out.print(" " + toString());
    }
}
