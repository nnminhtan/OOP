
package TH;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import OOP.tuan1.hangdienmay;


public class DSHangHoaArraylist extends HangHoa{
    private ArrayList<HangHoa> HH = new ArrayList<HangHoa>();

    public void Init() {
        HH.add(new HangDienMay("DM001", "Quat", "Millennium",12800.0, 8, 220, 32));
        HH.add(new HangDienMay("DM002", "May Lanh", "Trinity", 123200.0, 8, 220, 46));
        HH.add(new HangTP("TP001", "Beef", "Abydos", 230000.0, "2023-05-03", 60));
        HH.add(new HangDienMay("DM003", "Tivi", "Gehenna", 10000000, 12, 220, 32));
        HH.add(new HangTP("TP002", "Pork", "Millennium", 192000.0, "2023-05-01", 70));
        HH.add(new HangTP("TP003", "Wagyu", "Millennium", 300000.0, "2023-06-01", 10));
        HH.add(new HangDienMay("DM004", "May tinh", "Arius", 21500000, 6, 220, 40));
        HH.add(new HangDienMay("DM005", "Loa", "Millennium", 667000, 3, 12, 5));
        HH.add(new HangTP("TP004", "Cheese", "Gehenna", 200000.0, "2022-12-20", 365));
        HH.add(new HangHoa("HH001", "BetaX", "Millennium", 1000.0));
    }

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
//Adding by init func
    public void addHangHoa(HangHoa hh){
        HH.add(hh);
    }

// Manual adding
//     public void AddaHangHoa(){
//         Scanner sc = new Scanner(System.in);
//         Menu();
//         int chon;
//         do {
//             System.out.println("Chon mat hang muon them (1. HDM, 2. HTP): ");
//             chon = sc.nextInt();
//             if (chon < 1 || chon > 2) {
//                 //Nhap khac 1||2
//                 System.out.print("Nhap sai cu phap\n");
//                 System.out.print("Nhap lai(1. HDM, 2. HTP)(Nums only): ");
//             }
//         } while (chon < 1 || chon > 2);
//         //Check chon 1||2
//             switch (chon){
//                 case 1: {
//                     //add HDM
//                     HangHoa hdm = new HangDienMay();
//                     hdm.input();
//                     HH.add(hdm);
//                     break;
//                 }
//                 case 2: {
//                     //add HTP
//                     HangHoa htp = new HangHoa();
//                     htp.input();
//                     HH.add(htp);
//                     break;
//                 }
//             }
//     }

    public void OutputHangHoa(){
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("Chon mat hang muon xuat (1. HDM, 2. HTP, 3. All): ");
            chon = sc.nextInt();
            if (chon < 1 || chon > 3) {
                //Nhap khac 1||2||3
                System.out.print("Nhap sai cu phap\n");
                System.out.print("Nhap lai(1. HDM, 2. HTP, 3. All)(Nums only): ");
            }
        } while (chon < 1 || chon > 3);
        //Check chon 1||2||3
            switch (chon){
                case 1: {
                    //output for HDM
                    for(HangHoa hh : HH)
                        if(hh instanceof HangDienMay){
                            hh.output();
                            System.out.println();
                        }
                    break;
                }
                case 2: {
                    //output for HTP
                    for(HangHoa hh : HH)
                        if(hh instanceof HangTP){
                            hh.output();           
                            System.out.println();
                        }
                    break;
                }
                case 3: {
                    //output for all
                    for(HangHoa hh : HH){
                        hh.output();           
                        System.out.println();
                    }
                    break;
                }
            }
    }

    public class SapxepHHComparator implements Comparator<HangHoa> {
        @Override
        public int compare(HangHoa hh1, HangHoa hh2) {
            return (int) (hh1.getGia() - hh2.getGia());
        }
    }
    public void Sapxep(){
        Collections.sort(HH, new SapxepHHComparator());
        // for(HangHoa hh : HH){
        //     hh.output();
        // }
    }

    public void TimKiemByMaHang(){
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.print("Nhap ma hang ma ban muon tim: ");
        x = sc.next();
        for(HangHoa hhf : HH){
            if(hhf.getMaHang() != null)
                if(hhf.getMaHang().contains(x) == true){
                    System.out.println("Tim thay ma hang trung voi tu khoa vua nhap: " + x);
                        hhf.output();
                }
        }
    }

    public void Delete(String x) {
        for (int i = 0; i < HH.size(); i++) {
            if (HH.get(i).getMaHang().equals(x)) {
                HH.remove(i);
                break;
            }
        }
    }

    public void Update(String x){
        for (int i = 0; i < HH.size(); i++) {
            HangHoa hh = HH.get(i);
                if(hh.getMaHang().equals(x) && hh instanceof HangDienMay){
                    HangDienMay hdm = new HangDienMay();
                    hdm.input();
                    HH.set(i, hdm);
                    break; // Exit the loop after updating the product
                }
                if(hh.getMaHang().equals(x) && hh instanceof HangTP){
                    HangTP htp = new HangTP();
                    htp.input();
                    HH.set(i, htp);
                    break; // Exit the loop after updating the product
                }
            }
    }
}


