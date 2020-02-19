package programtanah;

import java.util.Scanner;

public class ProgramTanah_modifikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Tanah\t: ");
        int jt = sc.nextInt();
        System.out.println("");
        Tanah[] tnh = new Tanah[jt];
        for(int a = 0; a < tnh.length; a++){
            System.out.println("Tanah\t: " + (a+1));
            System.out.print("Panjang\t: ");
            int p = sc.nextInt();
            System.out.print("Lebar\t: ");
            int l = sc.nextInt();
            tnh[a] = new Tanah(p, l);
        }
        System.out.println("");
        for(int b = 0; b < tnh.length; b++){
            System.out.println("Luas tanah " + (b+1) + "\t: " + tnh[b].hitungLuas());
        }
        int terbesar = tnh[0].hitungLuas(), array = 1;
        for(int c = 1; c < tnh.length; c++){
            if (tnh[c].hitungLuas() > terbesar){
                terbesar = tnh[c].hitungLuas();
                array = c+1;
            }
        }
        System.out.println("\nTanah terluas\t: Tanah " + array);
    }
    
}
