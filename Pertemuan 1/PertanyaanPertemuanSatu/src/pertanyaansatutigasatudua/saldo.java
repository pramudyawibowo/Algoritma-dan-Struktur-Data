package pertanyaansatutigasatudua;
import java.util.Scanner;
public class saldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo, bunga = 0.02;
        System.out.print("Masukkan saldo\t: ");
        saldo = sc.nextInt();
        for(int a = 0; a < 12; a++){
            saldo += saldo * bunga;
        }
        System.out.printf("Saldo dalam 12 bulan\t: %,.2f\n", saldo);
    }
}
