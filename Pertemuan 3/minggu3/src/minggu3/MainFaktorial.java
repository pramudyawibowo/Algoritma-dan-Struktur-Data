package minggu3;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //O(1)
        System.out.println("==================================================="); //O(1)
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : "); //O(1)
        int elemen = sc.nextInt(); //O(1)
        Faktorial[] fk = new Faktorial[elemen]; //O(1)
        for(int i = 0; i < elemen; i++){ //O(n)
            fk[i] = new Faktorial(); //O(1)
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : "); //O(1)
            fk[i].nilai = sc.nextInt(); //O(1)
        }
        System.out.println("==================================================="); //O(1)
        System.out.println("Hasil faktorial dengan Brute Force"); //O(1)
        long bf = System.nanoTime(); //O(1)
        for (int i = 0; i < elemen; i++) { //O(n!)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai)); //O(1)
        }
        long bfEND = System.nanoTime(); //O(1)
        double waktuBF = (bfEND - bf) / 1e+9; //O(1)
        System.out.println("Waktu Brute Force : " + waktuBF + " detik"); //O(1)
        //Notasi Big O Brute Force
        //O(1+1+1+1+1+n*1*1*1+1+1+1+n!*1+1+1+1)
        //O(5+n+3+n!+3)
        //O(11+n+n!)
        //O(n+n!)
        //O(n!)
        System.out.println("==================================================="); //O(1)
        System.out.println("Hasil faktorial dengan Divide and Conquer"); //O(1)
        long dc = System.nanoTime(); //O(1)
        for (int i = 0; i < elemen; i++) { //O(n)
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai)); //O(K^n)
        }
        long dcEND = System.nanoTime(); //O(1)
        double waktuDC = Math.abs(((dcEND - dc) / 1e+9) - waktuBF); //O(1)
        System.out.println("Waktu Divide and Conquer : " + waktuDC + " detik"); //O(1)
        System.out.println("==================================================="); //O(1)
        //Notasi Big O Divide and Conquer
        //O(1+1+1+1+1+n*1*1*1+1+1+1+K^n*1+1+1+1)
        //O(5+n+3+K^n+3)
        //O(11+n+K^n)
        //O(n+K^n)
        //O(K^n)
    }
}
