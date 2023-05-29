package onclass;

import java.util.Scanner;

public class Nguoi {
    protected String Ten;
    protected int NamSinh;
//constructor
    public Nguoi(){

    }

    public Nguoi(String ten, int namSinh) {
        Ten = ten;
        NamSinh = namSinh;
    }
//getset 
    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }
    public int getNamSinh() {
        return NamSinh;
    }
    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }
    
    @Override
    public String toString() {
        return "Nguoi [Ten=" + Ten + ", NamSinh=" + NamSinh + "]";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        setTen(sc.nextLine());
        System.out.print("Nhap nam sinh: ");
        setNamSinh(sc.nextInt());
    }

    public void output(){
        System.out.print(this.toString());
    }
    
}
