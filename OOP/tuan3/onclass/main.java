package onclass;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        DSNhanLuc ds = new DSNhanLuc();
		byte chon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			ds.Menu();
            chon = sc.nextByte();
			switch(chon) {
				case 1: {
                    ds.AddIntoDS();
                    break;
				}
				case 2:{
                    ds.OutputDS();
					break;
				}
				default: 
					chon = 0;
					break;
			}
		}while(chon!=0);
		
	}
}

