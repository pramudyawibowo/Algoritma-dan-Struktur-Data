package pertanyaansatuduasatudua;
import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tugas, uts, uas;
        
        System.out.print("Masukkan nilai tugas\t: ");
        tugas = sc.nextInt();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tidak boleh kurang dari 0 atau lebih dari 100");
            System.exit(0);
        }
        System.out.print("Masukkan nilai UTS\t: ");
        uts = sc.nextInt();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai tidak boleh kurang dari 0 atau lebih dari 100");
            System.exit(0);
        }
        System.out.print("Masukkan nilai UAS\t: ");
        uas = sc.nextInt();
        if (uas < 0 || uas > 100) {
            System.out.println("Nilai tidak boleh kurang dari 0 atau lebih dari 100");
            System.exit(0);
        }
        
        nilai = (tugas * 0.2) + (uts * 0.35) + (uas * 0.45);
        System.out.println("\nNilai akhir\t: " + nilai);
    }
}
