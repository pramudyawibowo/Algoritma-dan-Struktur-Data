package programnilai;

import java.util.Scanner;

public class ProgramNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa\t: ");
        int jm = sc.nextInt();
        System.out.println("");
        Nilai[] nilai = new Nilai[jm];
        for(int a = 0; a < nilai.length; a++){
            System.out.println("Mahasiswa\t: " + (a+1));
            System.out.print("Nilai 1\t: ");
            int n1 = sc.nextInt();
            System.out.print("Nilai 2\t: ");
            int n2 = sc.nextInt();
            nilai[a] = new Nilai(n1, n2);
        }
        System.out.println("");
        for(int b = 0; b < nilai.length; b++){
            System.out.println("Nilai terbaik mhs " + (b+1) + "\t: " + nilai[b].nilaiTerbaik());
        }
    }
    
}
