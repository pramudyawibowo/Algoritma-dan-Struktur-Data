/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package cobahitung;

import java.util.Scanner;

public class HasilMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Postfix: ");
        String Q = sc.nextLine();
        Q = Q.trim();
        
        int total = Q.length();
        
        Hasil pref = new Hasil(total);
        int P = pref.konversi(Q);
        System.out.println("Prefix: " + P);
    }
}
