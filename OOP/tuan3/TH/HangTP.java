package TH;

import java.time.LocalDate;
import java.util.Scanner;

public class HangTP extends HangHoa{
    private String ngaySX;
    private int HanDung;
    // public String loaimh = setLoaiMH("HangTP");
    public HangTP(){
        
    }

    public HangTP(String maHang, String tenHang, String nSX, double gia , String ngaySX, int hanDung) {
        super(maHang, tenHang, nSX, gia);
        this.ngaySX = ngaySX;
        this.HanDung = hanDung;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getHanDung() {
        return HanDung;
    }

    public void setHanDung(int hanDung) {
        HanDung = hanDung;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ngay san xuat (yyyy-MM-dd): ");
        setNgaySX(sc.nextLine());
        System.out.print("Nhap Han dung: ");
        setHanDung(sc.nextInt()); 
    }

    public void output() {
        // LocalDate ngaySX1 = LocalDate.parse(getNgaySX());
        // LocalDate ngayHH = ngaySX1.plusDays(getHanDung());
        System.out.print(this.toString());

    }

    @Override
    public String toString() {
        return "HangTP [MaHang=" + MaHang + ", TenHang=" + TenHang + ", NSX=" + NSX + ", Gia=" + Gia + ", ngaySX=" + ngaySX + ", HanDung=" + HanDung + "]" + "\n";
    }
}
