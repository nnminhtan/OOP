package OOP.tuan4;

import java.util.Scanner;

public class QuocGia {
    public String NSX;
    public float Tax;
    
//getset
    public String getNSX() {
        return NSX;
    }
    public void setNSX(String nSX) {
        NSX = nSX;
    }
    public float getTax() {
        return Tax;
    }
    public void setTax(float tax) {
        Tax = tax;
    }

//tostring
    @Override
    public String toString() {
        return "QuocGia [NSX=" + NSX + ", Tax=" + Tax + "]";
    }

//input
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap NSX: ");
        setNSX(sc.next());
        System.out.print("Nhap Tax: ");
        setTax(sc.nextFloat());
    }

//output
    public void output(){
        System.out.println(this.toString());
    }

}
