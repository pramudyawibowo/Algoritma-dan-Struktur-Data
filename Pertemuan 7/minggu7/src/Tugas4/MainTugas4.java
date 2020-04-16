package Tugas4;

import java.util.Scanner;

public class MainTugas4 {

    static Scanner sc = new Scanner(System.in);
    static String data[][];

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah penduduk : ");
        int jumlahpend = sc.nextInt();
        sc.nextLine();
        data = new String[jumlahpend][4];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Data penduduk ke-" + (i + 1));
            System.out.print("Masukkan NIK\t: ");
            data[i][0] = sc.nextLine();
            System.out.print("Masukkan Nama\t: ");
            data[i][1] = sc.nextLine();
            System.out.print("Masukkan Alamat\t: ");
            data[i][2] = sc.nextLine();
            JenisKelamin(i);
            System.out.println();
        }
        Tugas4 tgs4 = new Tugas4(data, jumlahpend, 4);
        tgs4.TampilData();
        System.out.print("Masukkan NIK yang ingin dicari\t: ");
        String cari = sc.nextLine();
        tgs4.FindSeqSearch(cari);
        if (Tugas4.brs != -1) {
            System.out.println("Data " + cari + " Ditemukan!");
            tgs4.TampilPencarian();
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }

    static void JenisKelamin(int i) {
        System.out.println("Masukkan Jenis Kelamin");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Pilihan\t\t: ");
        int jenis = sc.nextInt();
        sc.nextLine();
        switch (jenis) {
            case 1:
                data[i][3] = "Laki-laki";
                break;
            case 2:
                data[i][3] = "Perempuan";
                break;
            default:
                System.out.println("Data salah!");
                JenisKelamin(i);
        }
    }
}
