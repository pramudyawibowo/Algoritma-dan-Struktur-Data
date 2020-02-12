package pertanyaansatutigasatusatu;
import java.util.Scanner;
public class Pengurangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        System.out.print("A\t: ");
        A = sc.nextInt();
        for(int a = 1; a <= 5; a++){
            A -= 3;
        }
        System.out.println("Hasil\t: " + A);
        if (A % 2 == 0){
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
}
