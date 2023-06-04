package OOP.tuan4;

import java.util.Scanner;

public class HangDM extends HangHoa{
    protected int ThoiGianBH, DienAp, CongSuat;
    protected QuocGia QG = new QuocGia();

    //tostring 
    @Override
    public String toString() {
        return "HangDM [MaHang=" + MaHang + ", TenHang=" + TenHang + ", DonGia=" + DonGia + ", ThoiGianBH=" + ThoiGianBH + ", DienAp=" + DienAp + ", CongSuat=" + CongSuat + 
                ", QG=" + QG + "]";
    }

//getset
    public int getThoiGianBH() {
        return ThoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        ThoiGianBH = thoiGianBH;
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

    public QuocGia getQG() {
        return QG;
    }

    public void setQG(QuocGia qG) {
        QG = qG;
    }

//input
    public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("TG bao hanh: ");
		setThoiGianBH(sc.nextInt());
		System.out.print("Dien ap: ");
		setDienAp(sc.nextInt());
		System.out.print("Cong suat: ");
		setCongSuat(sc.nextInt());
		QG.input();
	}

//output
	public void output() {
		System.out.println(this.toString());
	}
	
}
