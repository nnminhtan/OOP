package OOP.tuan1;

import java.util.Scanner;

public class hangss extends hanghoa{
    protected String ingredients_list;
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai nguyen lieu: ");
        ingredients_list=sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.print(" Nguyen Lieu: " + ingredients_list);
    }
    public double Tinh_gia_ban(){
        super.Tinh_gia_ban();
        Gia= Gia + (Gia*5/100);
        System.out.print(" Gia: " + Gia);
        return Gia;
    }

}
