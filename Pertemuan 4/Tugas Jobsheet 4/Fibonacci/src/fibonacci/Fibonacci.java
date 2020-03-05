package fibonacci;
public class Fibonacci {
    public int nilai;
    
    int fibonacciDC(int n) {
        if (n==0 || n==1) { // O(1)
            return (n); // O(1)
        }
        else {
            return (fibonacciDC(n-1) + fibonacciDC(n-2)); // O(K^n)
        }
    }
    // Notasi Big O
    // O(1+1+K^n)
    // O(2+K^n)
    // O(K^n)
}
