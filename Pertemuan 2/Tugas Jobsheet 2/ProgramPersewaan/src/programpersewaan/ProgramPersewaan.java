package programpersewaan;
import java.util.Scanner;
public class ProgramPersewaan {
    public static void main(String[] args) {
        int harga;
        String nmgame;
        Scanner sc = new Scanner(System.in);
        //Persewaan prs = new Persewaan();
        System.out.println("===Persewaan Game===");
        System.out.print("Masukkan id anda\t\t: ");
        String id = sc.nextLine();
        System.out.print("Masukkan nama anda\t: ");
        String nama = sc.nextLine();
        System.out.println("====================");
        System.out.println("=====Pilih Game=====");
        System.out.println("1. Call of Duty\tRp5.000");
        System.out.println("2. God of War\tRp8.000");
        System.out.print("Pilihan anda\t\t: ");
        int game = sc.nextInt();
        sc.nextLine();
        switch(game){
            case 1 :
                nmgame = "Call of Duty";
                harga = 5000;
                break;
            case 2:
                nmgame = "God of War";
                harga = 8000;
                break;
            default:
                nmgame = "";
                harga = 0;
                System.out.println("Pilihan anda salah");
                System.exit(0);
        }
        System.out.println("====================");
        System.out.print("Masukkan jumlah hari\t: ");
        int hari = sc.nextInt();
        Persewaan prs1 = new Persewaan(id, nama, nmgame, harga, hari);
        prs1.tampilData();
    }
    
}
