package OOP.tuan1;

import java.util.Scanner;

public class hangthucpham extends hanghoa{
    protected String MFG, EXP;
    protected int EXPD;

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay sx: ");
        MFG=sc.nextLine();
        System.out.print("Nhap so ngay het han: ");
        EXPD=sc.nextInt();
        EXP = MFG + EXPD;
        sc.close();
    }

    public void output(){
        super.output();
        System.out.print(" "+ MFG + " " + EXP);
    }
    public double Tinh_gia_ban(){
        super.Tinh_gia_ban();
        return Gia;
    }
}
