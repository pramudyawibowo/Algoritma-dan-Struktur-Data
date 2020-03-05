package divideandconquer;

public class DivideAndConquer {

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    static void towerOfHanoi(int numDisc, char source, char destination, char spare) {
        if (numDisc == 1) {
            System.out.println("Pindah 1 gelang dari tower " + source + " ke tower " + destination);
            return;
        }
        towerOfHanoi(numDisc - 1, source, spare, destination);
        System.out.println("Pindah gelang " + numDisc + " dari tower " + source + " ke tower " + destination);
        towerOfHanoi(numDisc - 1, spare, destination, source);
    }
}
