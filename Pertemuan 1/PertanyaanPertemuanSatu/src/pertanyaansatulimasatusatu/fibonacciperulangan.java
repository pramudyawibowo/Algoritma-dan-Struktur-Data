package pertanyaansatulimasatusatu;
import java.util.Scanner;
public class fibonacciperulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deret;
        System.out.print("Masukkan banyak deret fibonacci : ");
        deret = sc.nextInt();
        System.out.println("===Perulangan FOR===");
        perulangan(deret);
        System.out.println("\n====================");
        System.out.println("======Rekursif======");
        for (int a = 0; a < deret; a++) {
            System.out.print(rekursif(a) + " ");
        }
        rekursif(deret);
        System.out.println("\n====================");
    }

    static void perulangan(int n) {
        int a = 1, b = 0, c = 1;
        for (int x = 0; x < n; x++) {
            System.out.print(b + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    static int rekursif(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (rekursif(n - 1) + rekursif(n - 2));
        }
    }
}
