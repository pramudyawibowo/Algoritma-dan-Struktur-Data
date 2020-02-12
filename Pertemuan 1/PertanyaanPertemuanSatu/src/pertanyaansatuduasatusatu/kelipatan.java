package pertanyaansatuduasatusatu;
import java.util.Scanner;
public class kelipatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.print("y\t: ");
        y = sc.nextInt();
        
        if (y % 2 == 0 && y % 6 != 0 && y % 15 != 0){
            System.out.println("Bilangan kelipatan 2");
        } else if (y % 6 == 0 && y % 15 != 0){
            System.out.println("Bilangan kelipatan 6");
        } else if (y % 15 == 0){
            System.out.println("Bilangan kelipatan 15");
        } else {
            System.out.println("Bilangan bukan kelipatan 2, 6, atupun 15");
        }
    }
}
