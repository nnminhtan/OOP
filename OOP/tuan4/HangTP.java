package OOP.tuan4;

import java.util.Scanner;

public class HangTP extends HangHoa{
    private String Ngaysx, Ngayhh;

    public String getNgaysx() {
        return Ngaysx;
    }

    public void setNgaysx(String ngaysx) {
        Ngaysx = ngaysx;
    }

    public String getNgayhh() {
        return Ngayhh;
    }

    public void setNgayhh(String ngayhh) {
        Ngayhh = ngayhh;
    }

    @Override
    public String toString() {
        return "HangTP [MaHang=" + MaHang + ", TenHang=" + TenHang + ", DonGia=" + DonGia + ", Ngaysx=" + Ngaysx + ", Ngayhh=" + Ngayhh + "]";
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay sx: ");
        setNgaysx(sc.next());
        System.out.print("Nhap ngay hh: ");
        setNgayhh(sc.next());
    }
//output
    public void output(){
        System.out.println(this.toString());
    }
}
