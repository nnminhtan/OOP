package TH;

import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private int Warranty_time, DienAp, CongSuat;
    // public String loaimh = setLoaiMH("HangDM");

    public HangDienMay(){

    }


    public HangDienMay(String maHang, String tenHang, String nSX, double gia ,int warranty_time, int dienAp, int congSuat) {
        super(maHang, tenHang, nSX, gia);
        this.Warranty_time = warranty_time;
        this.DienAp = dienAp;
        this.CongSuat = congSuat;
    }


    public int getWarranty_time() {
        return Warranty_time;
    }
    public void setWarranty_time(int warranty_time) {
        Warranty_time = warranty_time;
    }
    public int getDienAp() {
        return DienAp;
    }
    public void setDienAp(int dienAp) {
        DienAp = dienAp;
    }
    public int getCongSuat() {
        return CongSuat;
    }
    public void setCongSuat(int congSuat) {
        CongSuat = congSuat;
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        setWarranty_time(sc.nextInt());
        System.out.print("Nhap dien ap: ");
        setDienAp(sc.nextInt());
        System.out.print("Nhap cong suat: ");
        setCongSuat(sc.nextInt());
    }

    @Override
    public String toString() {
        return "HangDienMay [MaHang=" + MaHang + ", TenHang=" + TenHang + ", NSX=" + NSX + ", Gia=" + Gia + ", Warranty_time=" + Warranty_time + ", DienAp=" + DienAp + ", CongSuat=" + CongSuat + "]" + "\n";
    }


    public void output(){
        System.out.printf(this.toString());
    }
}
