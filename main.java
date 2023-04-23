package OOP.tuan1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // hanghoa hh = new hanghoa();
        // hh.input();
        // hh.output();
        // hh.Tinh_gia_ban();
        // hangdienmay hdm = new hangdienmay();
        // hdm.input();
        // hdm.output();
        // hdm.Tinh_gia_ban();
        // hangss hss = new hangss();
        // hss.input();
        // hss.output();
        // hss.Tinh_gia_ban();
        hangthucpham htp = new hangthucpham();
        htp.input();
        htp.output();
        htp.Tinh_gia_ban();
        sc.close();
    }
}
