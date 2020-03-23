package TestSearching;
import java.util.Scanner;
public class ModifikasiSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data\t: ");
        int jumlahData = sc.nextInt();
        int data[];
        data = new int[jumlahData];
        System.out.println("\nMasukkan data (Angka terkecil ke terbesar)");
        for(int i = 0; i < jumlahData; i++){
            System.out.print("Data indeks " + i + "\t: ");
            data[i] = sc.nextInt();
        }
        Searching pencarian = new Searching(data, jumlahData);
        
        System.out.println("\nIsi Array : ");
        pencarian.TampilData();
        
        System.out.print("\nMasukkan data yang ingin dicari\t: ");
        int cari = sc.nextInt();
        int posisi;
        
        System.out.println("\n==============================");
        System.out.println("Menggunakan Sequential Search");
        posisi = pencarian.FindSeqSearch(cari);
        if(posisi != -1){
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
        
        System.out.println("\n==============================");
        System.out.println("menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.Tampilpoisisi(cari, posisi);
    }
}