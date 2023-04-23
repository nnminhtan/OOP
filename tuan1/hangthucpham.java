package OOP.tuan1;

import java.time.OffsetDateTime;
import java.util.Scanner;
// public class hangthucpham extends hanghoa{
//     protected int d,m,y,EXPD;
//     public void input(){
//         super.input();
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("Nhap ngay sx: ");
//             d=sc.nextInt();
//             m=sc.nextInt();
//             y=sc.nextInt();
//         }while((y<0) || (m<=1 && m >=12) || (d<=1 && d>=31));
//         System.out.print("Nhap so ngay het han: ");
//         EXPD=sc.nextInt();
//     }
//     static int OffsetDays(int d, int m, int y){
//         int offset = d;
//         switch (m-1) {
//             case 1: case 3: case 5: case 7: case 8: case 10:
//                 offset +=31;
//             case 4: case 6: case 9: case 11: 
//                 offset +=30;
//             case 2: 
//                 offset+=28;
//         }      
//         if(((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && m>2)
//         offset+=1;         
//         return offset;
//     }
//     static void ReOffsetDays(int offset, int y){
        
//     }
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
        System.out.print("Nhap so ngay het han: ");
        EXPD=sc.nextInt();
        temp = 0;
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
        
    }
static void tinhngay(int d, int m, int y, int EXPD){
    
}

    public void output(){
        super.output();
        System.out.print(" "+ d + "/" + m+ "/" +y + " " + EXPD);
    }
}
