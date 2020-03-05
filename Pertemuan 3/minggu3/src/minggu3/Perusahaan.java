package minggu3;

import java.util.Scanner;

public class Perusahaan {

    static Sum sm;

    static void Keuntungan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        ModifikasiSum[] mdSum = new ModifikasiSum[elm];
        System.out.println("=======================================");
        for (int i = 0; i < elm; i++) {
            mdSum[i] = new ModifikasiSum(elm);
            System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
    }

    static void TampilKeuntungan() {
        System.out.println("=======================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n", sm.totalBF(sm.keuntungan));
        System.out.println("=======================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n", sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}
