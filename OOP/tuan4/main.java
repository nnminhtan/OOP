package OOP.tuan4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        DSHH ds = new DSHH();
        int chon;
        Scanner sc = new Scanner(System.in);
        do{
            ds.Daline();
            ds.Menu();
            System.out.print("Chon 1 chuong trinh: ");
            chon = sc.nextInt();
            switch(chon){
                case 1:{
                    // ds.AddaHangHoa(); //done
                    ds.Daline();
                    ds.AddaHangHoa();
                    break;
                }
                case 2:{
                    //output //done
                    ds.Daline();
                    ds.OutputHangHoa();
                    break;
                }
                case 3:{
                    //timkiem //done
                    ds.Daline();
                    ds.TimKiemByMaHang();
                    break;
                }
                case 4:{
                    // del //done
                    ds.Daline();
                    ds.OutputHangHoa();
                    System.out.print("Chon ma hang ma ban muon xoa: ");
                    String x = sc.next();
                    // ds.Delete();
                    ds.Delete(x);
                    ds.OutputHangHoa();
                    break;
                }
                case 5:{
                    // update //done
                    ds.Daline();
                    System.out.print("Chon ma hang ma ban muon cap nhat: ");
                    String x = sc.next();
                    ds.Update(x);
                }
                case 6:{
                    //sapxep //done
                    ds.Daline();
                    ds.Sapxep();
                    ds.OutputHangHoa();
                    break;
                }

                default: chon = 0;{
                    ds.Daline();
                    System.out.println("Exiting now!");
                    break;
                }
            }
        }while(chon!=0);
    }    
}
