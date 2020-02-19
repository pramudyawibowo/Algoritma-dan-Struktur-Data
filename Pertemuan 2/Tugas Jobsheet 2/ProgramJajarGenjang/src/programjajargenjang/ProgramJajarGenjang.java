package programjajargenjang;
import java.util.Scanner;
public class ProgramJajarGenjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JajarGenjang[] jgArray = new JajarGenjang[5];
        JajarGenjang jg = new JajarGenjang();
        for(int a = 0; a < 5; a++){
            jgArray[a] = new JajarGenjang();
            System.out.println("-------------------------------");
            System.out.println("Jajar Genjang ke - " + a);
            System.out.print("Tinggi jajar genjang\t\t: ");
            jgArray[a].tinggi = sc.nextInt();
            System.out.print("Panjang jajar genjang\t\t: ");
            jgArray[a].panjang = sc.nextInt();
            System.out.print("Sisi miring jajar genjang\t: ");
            jgArray[a].sisimiring = sc.nextInt();
            System.out.println("-------------------------------");
        }
        for(int a = 0; a < 5; a++){
            System.out.println("-------------------------------");
            System.out.println("Jajar genjang ke - " + a);
            System.out.println("Luas\t: " + jg.hitungLuas(jgArray[a].panjang, jgArray[a].tinggi));
            System.out.println("Keliling\t: " + jg.hitungKeliling(jgArray[a].panjang, jgArray[a].sisimiring));
        }
    }
    
}
