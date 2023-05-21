package OOP.tuan1.TH;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Nguyen Ngoc Minh Tan
 * 2180609124
 */

public class Bai9 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m: ");
        m=sc.nextInt();
        System.out.print("Enter n: ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        Random rd=new Random();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=rd.nextInt(21)+0;
            }
        }
            
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");                  
        }  
        
        	for(int i=0;i<m;i++){
        		int  sum=0;
                for(int j=0;j<n;j++){
                    sum+=a[i][j];
                }  
                System.out.println("Tong hang thu "+i+" = " +sum);
            }  
    }
}
