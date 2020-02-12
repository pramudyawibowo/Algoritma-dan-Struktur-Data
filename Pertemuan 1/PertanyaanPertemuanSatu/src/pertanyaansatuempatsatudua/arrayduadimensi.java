package pertanyaansatuempatsatudua;
import java.util.Scanner;
public class arrayduadimensi {
    public static void main(String[] args) {
        int Array[][] = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for(int a = 0; a < Array.length; a++){
            for(int b = 0; b < Array[0].length; b++){
                System.out.print("Masukkan array ke-[" + a + "][" + b +"]" + " : ");
                Array[a][b] = sc.nextInt();
            }
        }
        for(int a = 0; a < Array.length; a++){
            for(int b = 0; b < Array[0].length; b++){
                System.out.print(Array[a][b] + " ");
            }
            System.out.println(" ");
        }
    }
}
