package OOP.tuan1;

import java.util.Scanner;
public class hangthucpham extends hanghoa{
    protected int d,m,y,EXPD,temp;
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap ngay sx: ");
            d=sc.nextInt();
            m=sc.nextInt();
            y=sc.nextInt();
        }while((y<0) || (m<=1 && m >=12) || (d<=1 && d>=31));
        System.out.print("Nhap so ngay SD: ");
        EXPD=sc.nextInt();
}
public void output(){
    super.output();
    System.out.print(" MFG: "+ d + "/" + m+ "/" +y + " So Ngay Het Han: " + EXPD+ " ");
}

public void tinhEXP(){
    switch (m) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            {
                d=d+EXPD;
                while(d > 31){
                    d= d - 31;
                    m++;
                    if(m>12){
                        m=1;
                        y++;
                    }
                }
                break;
            } 
        case 4: case 6: case 9: case 11: 
        {
            d=d+EXPD;
            while(d > 30){
                d= d - 30;
                m++;
                if(m>12){
                    m=1;
                    y++;
                }
            }
            break;
        }
        case 2: 
        {
            if(((y % 4 == 0 && y % 100 != 0) || y % 400 == 0))
            {
                d=d+EXPD;
                while(d > 29){
                    d= d - 29;
                    m++;
                    if(m>12){
                        m=1;
                        y++;
                    }
                }
                break;
            }else{
                d=d+EXPD;
                while(d > 29){
                    d= d - 29;
                    m++;
                    if(m>12){
                        m=1;
                        y++;
                    }
                }
                break;
            }
        }
    }
    System.out.print("EXP: " + d +"/"+ m + "/" + y);
    }
}

