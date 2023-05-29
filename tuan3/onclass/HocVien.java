package onclass;

import java.util.Scanner;

public class HocVien extends Nguoi {
    protected float Diem1, Diem2, Diem3;
//constructor
    public HocVien(){

    }
    public HocVien(float diem1, float diem2, float diem3) {
        Diem1 = diem1;
        Diem2 = diem2;
        Diem3 = diem3;
    }

    public HocVien(String ten, int namSinh, float diem1, float diem2, float diem3) {
        super(ten, namSinh);
        Diem1 = diem1;
        Diem2 = diem2;
        Diem3 = diem3;
    }
//getset
    public float getDiem1() {
        return Diem1;
    }

    public void setDiem1(float diem1) {
        Diem1 = diem1;
    }

    public float getDiem2() {
        return Diem2;
    }

    public void setDiem2(float diem2) {
        Diem2 = diem2;
    }

    public float getDiem3() {
        return Diem3;
    }

    public void setDiem3(float diem3) {
        Diem3 = diem3;
    }
    
    
    @Override
    public String toString() {
        return "HocVien [Diem1=" + Diem1 + ", Diem2=" + Diem2 + ", Diem3=" + Diem3 + ", Ten=" + Ten + ", NamSinh=" + NamSinh + "]";
    }
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem 1: ");
        setDiem1(sc.nextFloat());
        System.out.print("Nhap Diem 2: ");
        setDiem2(sc.nextFloat());
        System.out.print("Nhap Diem 3: ");
        setDiem3(sc.nextFloat());
    }
    
    public void output(){
        System.out.print(" " + this.toString());
    }
}
