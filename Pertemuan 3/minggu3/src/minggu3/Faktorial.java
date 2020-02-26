package minggu3;

import java.util.Scanner;

public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
//        for (int i = 1; i <= n; i++) {
//            fakto = fakto * i;
//        }
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("===================================================");
//        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
//        int elemen = sc.nextInt();
//        Faktorial[] fk = new Faktorial[elemen];
//        for(int i = 0; i < elemen; i++){
//            fk[i] = new Faktorial();
//            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
//            fk[i].nilai = sc.nextInt();
//        }
        int elemen = 20;
        Faktorial[] fk = new Faktorial[elemen];
        int inputan = 5;
        for (int i = 0; i < 20; i++) {
            fk[i] = new Faktorial();
            fk[i].nilai = inputan;
            inputan++;
        }
        System.out.println("===================================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        long bf = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long bfEND = System.nanoTime();
        double waktuBF = (bfEND - bf) / 1e+9;
        System.out.println("Waktu Brute Force : " + waktuBF + " detik");
        System.out.println("===================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        long dc = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        long dcEND = System.nanoTime();
        double waktuDC = Math.abs(((dcEND - dc) / 1e+9) - waktuBF);
        System.out.println("Waktu Divide and Conquer : " + waktuDC + " detik");
        System.out.println("===================================================");
    }

}
