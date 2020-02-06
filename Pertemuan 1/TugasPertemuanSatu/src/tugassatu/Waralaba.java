package tugassatu;

import java.util.Scanner;

public class Waralaba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, menu0, hargaTotal = 0;
        for (String belilagi = "y"; belilagi.equalsIgnoreCase("y");) {
            int harga, jumlah;
            System.out.println("Pilih menu :");
            System.out.println("1. Paket Chicken");
            System.out.println("2. Paket Oke");
            System.out.print("Masukkan pilihan : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Paket Chicken");
                    System.out.println("1. Chicken A (Rp12.000)");
                    System.out.println("2. Chicken B (Rp15.000)");
                    System.out.println("3. Chicken C (Rp20.000)");
                    System.out.print("Pilih paket : ");
                    menu0 = sc.nextInt();
                    sc.nextLine();
                    switch (menu0) {
                        case 1:
                            harga = 12000;
                            break;
                        case 2:
                            harga = 15000;
                            break;
                        case 3:
                            harga = 20000;
                            break;
                        default:
                            harga = 0;
                            System.out.println("Pilihan anda salah!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Paket Oke");
                    System.out.println("1. Oke A (Rp10.000)");
                    System.out.println("2. Oke B (Rp12.000)");
                    System.out.println("3. Oke C (Rp15.000)");
                    System.out.print("Pilih paket : ");
                    menu0 = sc.nextInt();
                    sc.nextLine();
                    switch (menu0) {
                        case 1:
                            harga = 10000;
                            break;
                        case 2:
                            harga = 12000;
                            break;
                        case 3:
                            harga = 15000;
                            break;
                        default:
                            harga = 0;
                            System.out.println("Pilihan anda salah!");
                            break;
                    }
                    break;
                default:
                    harga = 0;
                    System.out.println("Pilihan anda salah!");
                    break;
            }
            System.out.print("Masukkan jumlah : ");
            jumlah = sc.nextInt();
            sc.nextLine();
            hargaTotal += harga * jumlah;
            System.out.print("Anda ingin membeli produk lagi (y/t)? ");
            belilagi = sc.nextLine();
        }
        System.out.println("===TOTAL HARGA===");
        System.out.println("Total\t: Rp" + hargaTotal);
    }

}
