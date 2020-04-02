/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package UTS;

import java.util.Scanner;

public class MainUTS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        UTS uts = new UTS();
        System.out.print("Masukkan jumlah Anggota Keluarga\t: ");
        int jumlahData = sc.nextInt();
        uts.UTS(jumlahData);
        sc.nextLine();
        System.out.println("");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("====Input Data Anggota Keluarga %d====\n", (i + 1));
            System.out.print("Nama\t: ");
            String nama = s1.nextLine();
            System.out.print("Posisi\t: ");
            String posisi = s1.nextLine();
            System.out.print("Umur\t: ");
            int umur = sc.nextInt();
            System.out.println("=====================================");

            DataKeluarga dk = new DataKeluarga(nama, posisi, umur);
            uts.tambah(dk);
        }
        System.out.println("Pengurutan Berdasarkan Umur termuda-tertua");
        uts.selectionSortAsc();
        uts.tampil();
        System.out.print("Cari anggota keluarga berdasarkan umur\t: ");
        int cari = sc.nextInt();
        int posisi = uts.FindBinarySearch(cari, 0, jumlahData);
        uts.Tampilpoisisi(cari, posisi);
        uts.TampilCari(posisi);
    }
}
