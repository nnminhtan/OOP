package onclass;

import java.util.ArrayList;
import java.util.Scanner;

public class DSNhanLuc {
    private ArrayList<Nguoi> ds = new ArrayList<Nguoi>();

    public void Menu(){
        System.out.println("1. Them mot nguoi");
        System.out.println("2. Xuat mot nguoi");
        System.out.println("0. Exit");
    }

    public void MenuAdd(){
        System.out.println("Chon chuc vu cua nguoi ban muon them");
        System.out.println("1. Hoc vien");
        System.out.println("2. Giao vien");
        System.out.println("3. Nhan vien");
        System.out.println("4. Nhan vien CLC");
        System.out.println("5. Nhan vien quan ly");
    }

    public void MenuOutput(){
        System.out.println("Chon chuc vu cua nguoi ban muon xuat DS");
        System.out.println("1. Hoc vien");
        System.out.println("2. Giao vien");
        System.out.println("3. Nhan vien");
        System.out.println("4. Nhan vien CLC");
        System.out.println("5. Nhan vien quan ly");
        System.out.println("6. All");
    }


    public void AddIntoDS(){
        Scanner sc = new Scanner(System.in);
        MenuAdd();
        byte chon;
        chon = sc.nextByte();
        if(chon == 1){
            System.out.println("-----Them 1 Hoc vien-----");
            Nguoi HV = new HocVien();
            HV.input();
            ds.add(HV);
        }else if(chon == 2){
            System.out.println("-----Them 1 Giao vien-----");
            Nguoi GV = new GiaoVien();
            GV.input();
            ds.add(GV);
        }else if(chon == 3){
            System.out.println("-----Them 1 Nhan vien-----");
            Nguoi NV = new NhanVien();
            NV.input();
            ds.add(NV);
        }else if(chon == 4){
            System.out.println("-----Them 1 Nhan vien CLC-----");
            Nguoi CLC = new NhanVienCLC();
            CLC.input();
            ds.add(CLC);
        }else if(chon == 5){
            System.out.println("-----Them 1 Nhan vien quan ly-----");
            Nguoi QL = new NVQuanLy();
            QL.input();
            ds.add(QL);
        }else{
            System.out.println("Nhap sai kieu du lieu(Nhap so)!");
        }
        System.out.println();
    }

    public void OutputDS(){
        Scanner sc = new Scanner(System.in);
        MenuOutput();
        byte chon;
        chon = sc.nextByte();
        if(chon == 1){
            System.out.println("-----Xuat 1 Hoc vien-----");
            for (int i = 0; i < ds.size(); i++){
                if(ds.get(i) instanceof HocVien){
                    ds.get(i).output();
                    System.out.println();
                }
            }
        }else if(chon == 2){
            System.out.println("-----Xuat 1 Giao vien-----");
            for (int i = 0; i < ds.size(); i++){
                if(ds.get(i) instanceof GiaoVien){
                    ds.get(i).output();
                    System.out.println();
                }
            }
        }else if(chon == 3){
            System.out.println("-----Xuat 1 Nhan vien-----");
            for (int i = 0; i < ds.size(); i++){
                if(ds.get(i) instanceof NhanVien){
                    ds.get(i).output();
                    System.out.println();
                }
            }
        }else if(chon == 4){
            System.out.println("-----Xuat 1 Nhan vien CLC-----");
            for (int i = 0; i < ds.size(); i++){
                if(ds.get(i) instanceof NhanVienCLC){
                    ds.get(i).output();
                    System.out.println();
                }
            }
        }else if(chon == 5){
            System.out.println("-----Xuat 1 Nhan vien quan ly-----");
            for (int i = 0; i < ds.size(); i++){
                if(ds.get(i) instanceof NVQuanLy){
                    ds.get(i).output();
                    System.out.println();
                }
            }
        }else if(chon == 6){
            for (int i = 0; i < ds.size(); i++){
                    ds.get(i).output();
                    System.out.println();
            }
        }else{
            System.out.println("Nhap sai kieu du lieu(Nhap so)!");
        }
        System.out.println();
    }

}
