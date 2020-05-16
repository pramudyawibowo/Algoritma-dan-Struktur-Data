/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package UAS;

import java.util.Scanner;

public class MainDaftarBuku {

    public static void main(String[] args) {
        DoubleLinkedList data = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int pilih = 0, kode, stok, rusak, index, cari;
        String judul, penerbit;
        if (data.isEmpty()) {
            System.out.println("Data masih kosong!");
            System.out.print("Kode: ");
            kode = sc.nextInt();
            sc.nextLine();
            System.out.print("Judul: ");
            judul = sc.nextLine();
            System.out.print("Penerbit: ");
            penerbit = sc.nextLine();
            System.out.print("Jumlah Stok: ");
            stok = sc.nextInt();
            System.out.print("Jumlah Rusak: ");
            rusak = sc.nextInt();
            data.addLast(kode, judul, penerbit, stok, rusak);
        }
        do {
            try {
                System.out.println("Pilih Menu:");
                System.out.println("1. Buku Masuk");
                System.out.println("2. Buku Keluar");
                System.out.println("3. Buku Rusak");
                System.out.println("4. Tampilkan semua data");
                System.out.println("5. Cari Buku");
                System.out.println("6. Exit");
                System.out.print("Masukkan pilihan menu: ");
                pilih = sc.nextInt();
                sc.nextLine();
                System.out.println("==================================");
                switch (pilih) {
                    case 1:
                        System.out.print("Kode: ");
                        kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Judul: ");
                        judul = sc.nextLine();
                        System.out.print("Penerbit: ");
                        penerbit = sc.nextLine();
                        System.out.print("Jumlah Stok: ");
                        stok = sc.nextInt();
                        System.out.print("Jumlah Rusak: ");
                        rusak = sc.nextInt();
                        data.addLast(kode, judul, penerbit, stok, rusak);
                        break;
                    case 2:
                        System.out.print("Masukkan index buku keluar: ");
                        index = sc.nextInt();
                        data.remove(index);
                        break;
                    case 3:
                        System.out.print("Masukkan index buku rusak: ");
                        index = sc.nextInt();
                        System.out.print("Masukkan jumlah rusak: ");
                        int rusak2 = sc.nextInt();
                        data.update(index, rusak2);
                        break;
                    case 4:
                        data.print();
                        break;
                    case 5:
                        System.out.println("1. Berdasarkan kode");
                        System.out.println("2. Berdasarkan judul");
                        System.out.print("Masukkan pilihan: ");
                        int pilih2 = sc.nextInt();
                        switch (pilih2) {
                            case 1:
                                System.out.print("Masukkan kode buku dicari: ");
                                cari = sc.nextInt();
                                data.cari(cari);
                                break;
                            case 2:
                                System.out.print("Masukkan judul buku dicari: ");
                                sc.nextLine();
                                String cari2 = sc.nextLine();
                                data.cari2(cari2);
                                break;
                            default:
                                System.out.println("Tidak ada pilihan tersebut!");
                        }
                        break;
                    case 6:
                        System.out.println("Keluar Program!");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("==================================");
        } while (pilih != 6);
    }
}
