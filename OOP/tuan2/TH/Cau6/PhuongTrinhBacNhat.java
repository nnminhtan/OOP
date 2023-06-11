package OOP.tuan2.TH.Cau6;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    private int a, b;

    public PhuongTrinhBacNhat(){
        a = b = 0;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public PhuongTrinhBacNhat(PhuongTrinhBacNhat obj){
        this.a = obj.a;
        this.b = obj.b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 bien a, b: ");
        setA(sc.nextInt());
        setB(sc.nextInt());
    }
    
    public void output(){
        System.out.printf("2 bien a, b: %d, %d\n", getA(), getB());
        giaiPT(getA(), getB());
    }

    public void giaiPT(int a, int b){
        a = getA();
        b = getB();

        if(a == 0){
            if(b == 0)
                System.out.print("Phuong trinh vo so nghiem.");
            else System.out.print("Phuong trinh vo nghiem.");
        }else{
            double x = (double) -b/a;
            System.out.print("Phuong trinh co nghiem x = " + x);
        }
    }
}
