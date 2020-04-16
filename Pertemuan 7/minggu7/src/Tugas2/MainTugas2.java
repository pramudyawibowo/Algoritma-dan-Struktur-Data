package Tugas2;
import java.util.Scanner;
public class MainTugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][] = {
            {45,78,7,200,80},
            {90,1,17,100,50},
            {21,2,40,18,65}
        };
        Tugas2 pencarian = new Tugas2(data, 3, 5);
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();
        
        System.out.println("Menggunakan Sequential Search");
        pencarian.FindSeqSearch(cari);
        if(Tugas2.brs != -1 && Tugas2.klm != -1){
            System.out.println("data : " + cari + " ditemukan pada indeks baris : " + Tugas2.brs + " dan kolom : " + Tugas2.klm);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }
}
