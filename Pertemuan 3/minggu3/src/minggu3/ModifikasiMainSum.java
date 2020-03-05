package minggu3;

import java.util.Scanner;

public class ModifikasiMainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("Program Menghitung Keuntungan Total");
        System.out.print("Masukkan jumlah perusahaan\t: ");
        int prshn = sc.nextInt();
        Perusahaan[] perusahaan = new Perusahaan[prshn];
        for (int i = 0; i < prshn; i++) {
            perusahaan[i] = new Perusahaan();
            System.out.println("\nPerusahaan ke-" + (i + 1));
            perusahaan[i].Keuntungan();
        }
        for (int i = 0; i < prshn; i++) {
            System.out.println("\nPerusahaan ke-" + (i + 1));
            perusahaan[i].TampilKeuntungan();
        }
    }
}
