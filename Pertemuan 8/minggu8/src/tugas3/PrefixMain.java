/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package tugas3;

import java.util.Scanner;

public class PrefixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.println("Masukkan ekspresi matematika: ");
        Q = sc.nextLine();
        for(int i = (Q.length()-1); i >= 0; i--){
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";
        
        int total = eksp.length();
        
        Prefix pref = new Prefix(total);
        P = pref.konversi(eksp);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }
}
