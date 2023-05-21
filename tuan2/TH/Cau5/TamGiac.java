package OOP.tuan2.TH.Cau5;

import java.util.Scanner;
import java.lang.Math;

public class TamGiac {
    private int Canh1, Canh2, Canh3;
    public TamGiac(){
        Canh1 = Canh2 = Canh3 = 0;
    }

    public TamGiac(int canh1, int canh2, int canh3) {
        this.Canh1 = canh1;
        this.Canh2 = canh2;
        this.Canh3 = canh3;
    }

    public TamGiac(TamGiac obj){
        this.Canh1 = obj.Canh1;
        this.Canh2 = obj.Canh2;
        this.Canh3 = obj.Canh3;    
    }

    public int getCanh1() {
        return Canh1;
    }

    public void setCanh1(int canh1) {
        Canh1 = canh1;
    }

    public int getCanh2() {
        return Canh2;
    }

    public void setCanh2(int canh2) {
        Canh2 = canh2;
    }

    public int getCanh3() {
        return Canh3;
    }

    public void setCanh3(int canh3) {
        Canh3 = canh3;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai canh 1 2 3: ");
        setCanh1(sc.nextInt());
        setCanh2(sc.nextInt());
        setCanh3(sc.nextInt());
        KtTamGiac(getCanh1(), getCanh2(), getCanh3());
    }

    public void output(){
        System.out.printf("Do dai canh 1, 2, 3 lan luot la: %d, %d, %d", getCanh1(), getCanh2(), getCanh3());
    }
    
    public void KtTamGiac(int a, int b, int c){
        a = getCanh1();
        b = getCanh2();
        c = getCanh3();

        if(a < b+c && b < a+c && c < a+b){
            if( a*a == b*b+c*c || b*b == a*a+c*c || c*c == a*a+b*b)
                System.out.print("Day la tam giac vuong");
            else if(a == b && b == c)
                System.out.print("Day la tam giac deu");
            else if(a == b || a == c || b == c)
                System.out.print("Day la tam giac can");
            else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b) 
                System.out.print("Day la tam giac tu");
            else
                System.out.print("Day la tam giac nhon");
            }
        else{ 
            System.out.print("3 canh ko phai la 1 tam giac!\n");
            input();
       }
       System.out.println();
    }

    public int tinhPerimeter(){
        return (getCanh1() + getCanh2() + getCanh3());
    }

    public double tinhArea(){
        int p = tinhPerimeter(); 
        return (Math.sqrt(p * (p-getCanh1()) * (p-getCanh2() * (p-getCanh3()))));
    }
}
