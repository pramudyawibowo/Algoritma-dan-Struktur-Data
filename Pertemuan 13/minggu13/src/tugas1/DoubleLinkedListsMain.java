/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package tugas1;

import java.util.Scanner;

public class DoubleLinkedListsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();
        int pilih = 0, data, indeks;
        do {
            try {
                System.out.println("DOUBLE LINK LIST DENGAN MENU");
                System.out.println("==============================");
                System.out.println("Memilih menu");
                System.out.println("1. Tambah awal");
                System.out.println("2. Tambah akhir");
                System.out.println("3. Tambah data indeks tertentu");
                System.out.println("4. Hapus awal");
                System.out.println("5. Hapus akhir");
                System.out.println("6. Hapus indeks tertentu");
                System.out.println("7. Cetak data");
                System.out.println("8. Cari");
                System.out.println("9. Keluar");
                System.out.println("==============================");
                System.out.print(">> ");
                pilih = sc.nextInt();
                System.out.println("==============================");
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addLast(data);
                        break;
                    case 3:
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        System.out.print("Masukkan posisi indeks data : ");
                        indeks = sc.nextInt();
                        dll.add(data, indeks);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan posisi indeks data : ");
                        indeks = sc.nextInt();
                        dll.remove(indeks);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukkan data yang ingin dicari : ");
                        data = sc.nextInt();
                        dll.cari(data);
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default :
                        System.out.println("Pilihan salah!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("==============================");
        } while (pilih > 0 && pilih < 9);
    }
}
