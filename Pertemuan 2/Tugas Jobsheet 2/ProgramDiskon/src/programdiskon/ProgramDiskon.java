package programdiskon;

import java.util.Scanner;

public class ProgramDiskon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga;
        String barang;
        System.out.println("======================");
        System.out.println("=====Pilih Barang=====");
        System.out.println("1. Headset\tRp25.000");
        System.out.println("2. Powerbank\tRp120.000");
        System.out.println("3. Charger\tRp40.000");
        System.out.print("Masukkan pilihan\t: ");
        int brg = sc.nextInt();
        switch (brg) {
            case 1:
                barang = "Headset";
                harga = 25000;
                break;
            case 2:
                barang = "Powerbank";
                harga = 120000;
                break;
            case 3:
                barang = "Charger";
                harga = 40000;
                break;
            default:
                System.out.println("Pilihan anda salah!");
                barang = "";
                harga = 0;
                System.exit(0);
        }
        System.out.print("Jumlah pembelian\t: ");
        int jumlah = sc.nextInt();
        Diskon dskn = new Diskon(barang, harga, jumlah);
        dskn.hitungHargaTotal();
        dskn.hitungDiskon();
        System.out.println("======================\n");
        System.out.println("======Pembelian======");
        dskn.tampilData();
        System.out.println("======================");
    }
}
