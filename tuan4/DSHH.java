package OOP.tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DSHH extends HangHoa{
    private ArrayList<HangHoa> ds = new ArrayList<HangHoa>();

    public void Menu(){
        System.out.println("1. Them mot mat hang");
        System.out.println("2. Xuat danh sach mat hang theo loai");
        System.out.println("3. Tim kiem thong tin mat hang theo ten hoac ma mat hang");
        System.out.println("4. Xoa mot mat hang trong danh sach");
        System.out.println("5. Cap nhat thong tin trong danh sach");
        System.out.println("6. Sap xep thong tin tang dan theo gia tien");
        System.out.println("0. Thoat khoi chuong trinh");
    }
    public void Daline(){
        for(int i = 0; i < 100; i++)
            System.out.print("-");
        System.out.println();
    }
//manual
    public void AddaHangHoa(){
        Scanner sc = new Scanner(System.in);
        Menu();
        int chon;
        do {
            System.out.println("Chon mat hang muon them (1. CN, 2.GD, 3. HTP): ");
            chon = sc.nextInt();
            if (chon < 1 || chon > 3) {
                //Nhap khac 1||2||3
                System.out.print("Nhap sai cu phap\n");
                System.out.print("Nhap lai(1. CN, 2.GD, 3. HTP)(Nums only): ");
            }
        } while (chon < 1 || chon > 3);
        //Check chon 1||2||3
            switch (chon){
                case 1: {
                    //add CN
                    HangHoa cn = new CongNghiep();
                    cn.input();
                    ds.add(cn);
                    break;
                }
                case 2: {
                    HangHoa gd = new GiaDung();
                    gd.input();
                    ds.add(gd);
                    break;
                }
                case 3: {
                    //add HTP
                    HangHoa htp = new HangTP();
                    htp.input();
                    ds.add(htp);
                    break;
                }
            }
    }

    public void OutputHangHoa(){
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("Chon mat hang muon xuat (1. CN, 2. GD, 3. HTP, 4. All): ");
            chon = sc.nextInt();
            if (chon < 1 || chon > 4) {
                //Nhap khac 1||2||3
                System.out.print("Nhap sai cu phap\n");
                System.out.print("Nhap lai(1. CN, 2. GD, 3. HTP, 4. All)(Nums only): ");
            }
        } while (chon < 1 || chon > 4);
        //Check chon 1||2||3
            switch (chon){
                case 1: {
                    //output for HDM
                    for(HangHoa hh : ds)
                        if(hh instanceof CongNghiep){
                            hh.output();           
                        }
                    break;
                }
                case 2: {
                    //output for HDM
                    for(HangHoa hh : ds)
                        if(hh instanceof GiaDung){
                            hh.output();           
                        }
                    break;
                }
                case 3: {
                    //output for HTP
                    for(HangHoa hh : ds)
                        if(hh instanceof HangTP){
                            hh.output();          
                        }
                    break;
                }
                case 4: {
                    //output for all
                    for(HangHoa hh : ds){
                        hh.output();          
                    }
                    break;
                }
            }
    }
    public class SapxepHHComparator implements Comparator<HangHoa> {
        @Override
        public int compare(HangHoa hh1, HangHoa hh2) {
            return (int) (hh1.getDonGia() - hh2.getDonGia());
        }
    }
    public void Sapxep(){
        Collections.sort(ds, new SapxepHHComparator());
        // for(HangHoa hh : HH){
        //     hh.output();
        // }
    }

    public void TimKiemByMaHang(){
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.print("Nhap ma hang ma ban muon tim: ");
        x = sc.next();
        for(HangHoa hhf : ds){
            if(hhf.getMaHang() != null)
                if(hhf.getMaHang().contains(x) == true){
                    System.out.println("Tim thay ma hang trung voi tu khoa vua nhap: " + x);
                        hhf.output();
                }
        }
    }

    public void Delete(String x) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaHang().equals(x)) {
                ds.remove(i);
                break;
            }
        }
    }

    public void Update(String x){
        for (int i = 0; i < ds.size(); i++) {
            HangHoa hh = ds.get(i);
                if(hh.getMaHang().equals(x) && hh instanceof CongNghiep){
                    CongNghiep cn = new CongNghiep();
                    cn.input();
                    ds.set(i, cn);
                    break; // Exit the loop after updating the product
                }
                if(hh.getMaHang().equals(x) && hh instanceof GiaDung){
                    GiaDung gd = new GiaDung();
                    gd.input();
                    ds.set(i, gd);
                    break; // Exit the loop after updating the product
                }
                if(hh.getMaHang().equals(x) && hh instanceof HangTP){
                    HangTP htp = new HangTP();
                    htp.input();
                    ds.set(i, htp);
                    break; // Exit the loop after updating the product
                }
        }
    }
}
