package pertanyaansatuempatsatusatu;
import java.util.Scanner;
public class ArraySatuDimensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gnjl = 0, gnp = 0;
        int[] arr = new int[15];
        for (int n = 0; n < arr.length; n++){
            System.out.print("Masukkan array ke-" + (n+1) + " : ");
            arr[n] = sc.nextInt();
        }
        for(int a = 0; a < arr.length; a++){
            if(arr[a] % 2 == 1){
                gnjl++;
            } else {
                gnp++;
            }
        }
        int genap[] = new int[gnp];
        int ganjil[] = new int[gnjl];
        gnp = 0;
        gnjl = 0;
        for(int a = 0; a < arr.length; a++){
            if(arr[a] % 2 == 0){
                genap[gnp] = arr[a];
                gnp++;
            } else {
                ganjil[gnjl] = arr[a];
                gnjl++;
            }
        }
        System.out.println("Genap");
        for(int b = 0; b < genap.length; b++){
            System.out.print(genap[b] + " ");
        }
        System.out.println("");
        System.out.println("Ganjil");
        for(int c = 0; c < ganjil.length; c++){
            System.out.print(ganjil[c] + " ");
        }
        System.out.println("");
    }
}
