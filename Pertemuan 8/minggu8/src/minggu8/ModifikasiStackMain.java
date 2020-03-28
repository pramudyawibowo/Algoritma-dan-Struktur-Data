/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package minggu8;

import java.util.Scanner;

public class ModifikasiStackMain {

    static Scanner sc = new Scanner(System.in);
    static Stack tumpukan = new Stack();
    static int panjang;

    public static void main(String[] args) {

        System.out.print("Masukkan panjang stack\t: ");
        panjang = sc.nextInt();
        tumpukan = new Stack(panjang);
        menu();

    }

    public static void menu() {
        System.out.println("\n===Pilih menu!===");
        System.out.println("1. Masukkan data");
        System.out.println("2. Keluarkan data");
        System.out.println("3. Elemen teratas");
        System.out.println("4. Cetak data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan\t: ");
        int pil = sc.nextInt();
        switch (pil) {
            case 1:
                if (!(tumpukan.IsFull())) {
                    System.out.print("\nMasukkan data\t: ");
                    int data = sc.nextInt();
                    tumpukan.push(data);
                } else {
                    System.out.println("\nStack penuh!");
                }
                break;
            case 2:
                if (!(tumpukan.IsEmpty())) {
                    tumpukan.pop();
                } else {
                    System.out.println("\nStack kosong!");
                }
                break;
            case 3:
                if (!(tumpukan.IsEmpty())) {
                    tumpukan.peek();
                } else {
                    System.out.println("\nStack kosong");
                }
                break;
            case 4:
                if (!(tumpukan.IsEmpty())) {
                    tumpukan.print();
                } else {
                    System.out.println("\nStack kosong");
                }
                break;
            case 5:
                System.out.println("\nAnda keluar program!");
                System.out.println("==================");
                System.exit(0);
                break;
            default:
                System.out.println("\nPilihan salah");
        }
        System.out.println("\n==================");
        menu();
    }
}
