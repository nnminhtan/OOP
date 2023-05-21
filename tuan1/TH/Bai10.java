package OOP.tuan1.TH;

import java.util.Scanner;

/**
 *
 * Nguyen Ngoc Minh Tan
 * 2180609124
 */

public class Bai10 {
    private int tuso;
	private int mauso;
	public int gettuSo() {
		return tuso;
	}
	public int getmauSo() {
		return mauso;
	}
	public void settuSo(int  tuso) {
		this.tuso= tuso;
	}
	public void setmauSo(int  mauso) {
		this.mauso= mauso;
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap tu so: ");
		tuso=sc.nextInt();
		do {
			System.out.print("Nhap mau so: ");
			mauso=sc.nextInt();
		}while(mauso==0);
		
	}
	public void output() {
		System.out.println(tuso + "/" + mauso);
	}
	int TimUCLN(int a, int b) {
		if(a==b) {
			return a;
		}
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}
	public void rutgon() {
		int UCLN=TimUCLN(tuso, mauso);
		tuso=tuso/UCLN;
		mauso=mauso/UCLN;
	}
	public Bai10 Cong(Bai10 ps) {
		Bai10 result=new Bai10();
		result.tuso=ps.tuso*mauso+ps.mauso*tuso;
		result.mauso=ps.mauso*mauso;
		result.rutgon();
		return result;
	}
	
	public static void main(String[] args) {
		Bai10 ps=new Bai10();
		ps.input();
		ps.rutgon();
        ps.output();
		Bai10 ps2=new Bai10();
		ps2.input();
        ps2.rutgon();
        ps2.output();
		Bai10 ps3=ps.Cong(ps2);
		ps3.output();
	}
}
