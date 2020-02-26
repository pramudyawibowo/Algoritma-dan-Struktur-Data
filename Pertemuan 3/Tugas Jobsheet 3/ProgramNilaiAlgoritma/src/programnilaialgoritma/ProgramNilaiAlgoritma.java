package programnilaialgoritma;
import java.util.Scanner;
public class ProgramNilaiAlgoritma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rata2 = 0;
        System.out.println("==========================");
        System.out.print("Masukkan banyak mahasiswa\t: ");
        int mhs = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.println("==========================");
        NilaiAlgoritma[] nilai = new NilaiAlgoritma[mhs];
        for(int i = 0; i < nilai.length; i++){
            System.out.println("Mahasiswa " + (i+1));
            System.out.print("Masukkan nama\t: ");
            String nm = sc.nextLine();
            System.out.print("Masukkan nilai tugas\t: ");
            int nt = sc.nextInt();
            //sc.nextLine();
            System.out.print("Masukkan nilai kuis\t: ");
            int nk = sc.nextInt();
            //sc.nextLine();
            System.out.print("Masukkan nilai UTS\t: ");
            int nuts = sc.nextInt();
            System.out.print("Masukkan nilai UAS\t: ");
            int nuas = sc.nextInt();
            sc.nextLine();
            System.out.println("==========================");
            nilai[i] = new NilaiAlgoritma(nm, nt, nk, nuts, nuas);
        }
        System.out.println("Nilai Total Mahasiswa");
        for(int i = 0; i < nilai.length; i++){
            System.out.println("Nama\t\t: " + nilai[i].namaMhs);
            System.out.println("Nilai Total\t: " + nilai[i].hitungTotalNilai());
            System.out.println("-------------------------");
            rata2 += nilai[i].hitungTotalNilai();
        }
        System.out.println("Rata-rata nilai seluruh Mahasiswa\t: " + (rata2/nilai.length));
    }
    
}
