package fibonacci;

import java.util.Scanner;

public class MainFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // O(1)

        Fibonacci fb = new Fibonacci(); // O(1)
        System.out.println("Program Deret Fibonacci Brute Force dan Divide Conquer"); // O(1)
        System.out.println("========================================================"); // O(1)
        System.out.print("Masukkan jumlah deret fibonacci : "); // O(1)
        fb.nilai = sc.nextInt(); // O(1)
        System.out.println("====================================================="); // O(1)
        System.out.println("Hasil Fibonacci dengan Divide and Conquer"); // O(1)
        for (int i = 0; i < fb.nilai; i++) { // O(n)
            System.out.print(fb.fibonacciDC(i) + " "); // O(K^n)
        }
        System.out.println(); // O(1)
        // Notasi Big O Algoritma Divide Conquer
        // O(1+1+1+1+1+1+1+1+n*K^n+1)
        // O(8+n*K^n+1)
        // O(9+n*K^n)
        // O(n*K^n)
        // O(K^n)
    }
}
