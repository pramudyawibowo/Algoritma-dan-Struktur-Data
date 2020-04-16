/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */

 /* Studi Kasus : Memasukkan barang ke dalam tas carrier, karena seharusnya studi
 * kasus ini menggunakan Stack, kita anggap saja tasnya memiliki kapasitas
 * tidak terbatas. Barang yang dimasukkan pertama adalah yang keluar terakhir,
 * dan barang yang dimasukkan terakhir akan keluar pertama 
 * indeks tumpukan dimulai dari 0 (teratas)
 */
package tugas2;

import java.util.Scanner;

public class MainDaftarPerlengkapan {

    public static void main(String[] args) {
        DaftarPerlengkapan data = new DaftarPerlengkapan();
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih1, id, berat, jumlah, index;
        String nama;
        do {
            try {
                System.out.println("Tas kapasitas tidak terbatas");
                System.out.println("1. Tambah Barang Terbaru");
                System.out.println("2. Lihat Barang Teratas");
                System.out.println("3. Lihat Barang Terbawah");
                System.out.println("4. Lihat Semua Barang");
                System.out.println("5. Keluarkan Barang Teratas");
                System.out.println("6. Cari Barang");
                System.out.println("7. Keluarkan Semua Barang");
                System.out.println("8. Hitung Berat Seluruh Barang");
                System.out.println("9. Keluar Program");
                System.out.print("Pilih menu\t: ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("\nTambah Barang");
                        System.out.print("ID Barang\t: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Barang\t: ");
                        nama = sc.nextLine();
                        System.out.print("Berat (gram)\t: ");
                        berat = sc.nextInt();
                        System.out.print("Jumlah\t\t: ");
                        jumlah = sc.nextInt();
                        data.addFirst(id, nama, berat, jumlah);
                        data.print();
                        break;
                    case 2:
                        data.getFirst();
                        break;
                    case 3:
                        data.getLast();
                        break;
                    case 4:
                        data.print();
                        break;
                    case 5:
                        data.removeFirst();
                        break;
                    case 6:
                        System.out.println("\nSubmenu Cari");
                        System.out.println("1. Cari (Tumpukan)");
                        System.out.println("2. Cari (No Barang)");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("\nCari (Tumpukan)");
                                System.out.print("Masukkan tumpukan ke : ");
                                index = sc.nextInt();
                                data.cari(index);
                                break;
                            case 2:
                                System.out.println("\nCari (No Barang)");
                                System.out.print("Masukkan No Barang: ");
                                id = sc.nextInt();
                                data.cariKey(id);
                                break;
                        }
                        break;
                    case 7:
                        data.clear();
                        break;
                    case 8:
                        data.hitungBerat();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        } while (pilih != 9);
    }
}
