package bruteforce;

public class BruteForce {

    public static void main(String[] args) {
        char[] x = {'N', 'G', 'A'};
        char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
        match(y, x);
    }

    static void match(char Teks[], char Pola[]) {
        int j;
        int cek = 0;
        for (int i = 0; i < Teks.length - Pola.length; i++) {
            j = 0;
            while (j < Pola.length && Pola[j] == Teks[i + j]) {
                j++;
            }
            if (j >= Pola.length) {
                cek++;
            }
        }
        System.out.println((cek > 0)?"DATA COCOK":"DATA TIDAK COCOK");
    }
}
