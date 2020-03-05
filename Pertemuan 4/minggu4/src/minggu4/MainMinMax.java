package minggu4;

import java.util.Scanner;
import static minggu4.MinMax.max_min;

public class MainMinMax {

    static MinMax[] ppArray = new MinMax[5]; //O(1)
    static int min, max;
    static Maxmin hasil = new Maxmin(); //O(1)

    public static void main(String[] args) {
        ppArray[0] = new MinMax(); //O(1)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) { //O(n)
            ppArray[i] = new MinMax(); //O(1)
            System.out.println("Nilai array indeks ke-" + (i + 1)); //O(1)
            System.out.print("Masukkan nilai: "); //O(1)
            ppArray[i].nilaiArray = sc.nextInt(); //O(1)
        }
        min = ppArray[0].nilaiArray; //O(1)
        max = ppArray[0].nilaiArray; //O(1)
        MinMaxBF();
        System.out.println("Brute Force"); //O(1)
        System.out.println("Nilai Minimal : " + min); //O(1)
        System.out.println("Nilai Maksimal : " + max); //O(1)
        MinMaxDC();
        System.out.println("Divide Conquer"); //O(1)
        System.out.println("Nilai Minimal: " + hasil.minimum + "\nNilai Maksimal: " + hasil.maximum); //O(1)
        System.out.println("\n"); //O(1)
    }

    static void MinMaxBF() {
        for (int i = 0; i < 5; i++) { //O(n)
            if (ppArray[i].nilaiArray < min) { //O(1)
                min = ppArray[i].nilaiArray; //O(1)
            } else {
                max = ppArray[i].nilaiArray; //O(1)
            }
        }
    }

    static void MinMaxDC() {
        int arr[] = new int[5]; //O(1)
        for (int i = 0; i < 5; i++) { //O(n)
            arr[i] = ppArray[i].nilaiArray; //O(1)
        }
        max_min(arr, 0, 4, hasil); //O(1)
    }
}
