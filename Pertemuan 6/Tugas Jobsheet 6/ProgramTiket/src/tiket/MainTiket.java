package tiket;

import java.util.Scanner;

public class MainTiket {

    static int jumlahTiket;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarTiket data = new DaftarTiket();
        System.out.print("Masukkan jumlah tiket\t: ");
        jumlahTiket = sc.nextInt();
        data.DaftarTiket(jumlahTiket);
        sc.nextLine();
        System.out.println("");

        for (int i = 0; i < jumlahTiket; i++) {
            System.out.printf("=========Input Data Tiket %d==========\n", (i + 1));
            System.out.print("Maskapai\t\t: ");
            String maskapai = s1.nextLine();
            System.out.print("Harga\t\t\t: Rp");
            float harga = sc.nextInt();
            System.out.print("Jumlah Transit\t\t: ");
            int transit = sc.nextInt();
            System.out.print("Durasi Penerbangan\t: ");
            int durasi = sc.nextInt();
            System.out.println("=====================================");

            Tiket t = new Tiket(maskapai, harga, transit, durasi);
            data.tambah(t);
        }
        System.out.println("===Data tiket sebelum sorting===");
        data.tampil();
        System.out.println("===Urutkan Tiket===");
        System.out.println("1. Termurah - Termahal");
        System.out.println("2. Termahal - Termurah");
        System.out.print("Masukkan Pilihan Anda\t: ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("===Data tiket setelah Bubble Sort Ascending===");
                data.bubbleSortAsc();
                data.tampil();
                System.out.println("\n===Data tiket setelah Selection Sort Ascending===");
                data.selectionSortAsc();
                data.tampil();
                break;
            case 2:
                System.out.println("===Data tiket setelah Bubble Sort Descending===");
                data.bubbleSortDesc();
                data.tampil();
                System.out.println("\n===Data tiket setelah Selection Sort Decending===");
                data.selectionSortDesc();
                data.tampil();
                break;
            default:
                System.out.println("Pilihan anda salah!");
        }

    }
}
