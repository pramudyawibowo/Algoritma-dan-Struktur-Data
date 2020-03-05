package minggu4;

import static minggu4.ModifMinMax.hitungMinMax;
import java.util.Scanner;

public class ModifMainMinMax {

    public static void main(String[] args) {
        MinMax[] ppArray = new MinMax[5]; // O(1)
        ppArray[0] = new MinMax(); // O(1)

        Scanner sc = new Scanner(System.in); // O(1)

        for (int i = 0; i < 5; i++) // O(n)
        {
            ppArray[i] = new MinMax(); // O(1)
            System.out.println("Nilai array indeks ke-" + i); // O(1)
            System.out.print("Masukkan nilai: "); // O(1)
            ppArray[i].nilaiArray = sc.nextInt(); // O(1)
        }

        int min = ppArray[0].nilaiArray; // O(1)
        int max = ppArray[0].nilaiArray; // O(1)

        int arr[] = new int[5]; // O(1)
        for (int i = 0; i < 5; i++) { // O(n)
            arr[i] = ppArray[i].nilaiArray; // O(1)
        }

        ModifMaxmin hasilBF = new ModifMaxmin();

        hitungMinMax(arr, min, max, hasilBF);

        System.out.println("Brute Force"); // O(1)
        System.out.println("Nilai Minimal : " + hasilBF.minimum); // O(1)
        System.out.println("Nilai Maksimal : " + hasilBF.maximum); // O(1)
    }
}
