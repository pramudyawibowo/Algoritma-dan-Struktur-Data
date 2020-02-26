package minggu3;

import java.util.Scanner;

public class ModifikasiPangkat {

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }

    public static void main(String[] args) {
        ModifikasiPangkat mdfks = new ModifikasiPangkat();
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Konstruktor[] png = new Konstruktor[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int a = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int n = sc.nextInt();
            png[i] = new Konstruktor(a, n);
        }
        System.out.println("=============================================");
        System.out.println("1. Hasil Pangkat Brute Force");
        System.out.println("2. Hasil Pangkat Divide and Conquer");
        System.out.print("Pilih menu (angka)\t: ");
        int pilihan = sc.nextInt();
        System.out.println("=============================================");
        switch (pilihan) {
            case 1:
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + mdfks.pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + mdfks.pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan yang anda masukkan tidak ada!");
                System.exit(0);
        }
        System.out.println("=============================================");
    }
}
