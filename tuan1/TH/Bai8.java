package OOP.tuan1.TH;

import java.util.Scanner;

/**
 *
 * Nguyen Ngoc Minh Tan
 * 2180609124
 */

public class Bai8 {
    public static void main(String[] args) {
		int a[];
		Scanner sc= new Scanner(System.in);
	    a = new int[10];
	    for(int i=0; i<10; i++){
	        System.out.print("a["+i+"] = ");
	        a[i] = sc.nextInt();
	        }
	        System.out.println("Mang vua nhap: ");
	        for(int i=0; i<10; i++){
	           System.out.print("\t");
	           System.out.print(a[i]);
	       	}	        
		    System.out.println("\nMang sap xep tang dan: ");
		for(int i=0; i<9; i++){
			for(int j=i+1; j<10; j++) {
				if(a[i] > a[j]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
	    }			
		for(int i=0; i<10; i++) {
			System.out.print(a[i]+"\t");
		}
	}		
}
