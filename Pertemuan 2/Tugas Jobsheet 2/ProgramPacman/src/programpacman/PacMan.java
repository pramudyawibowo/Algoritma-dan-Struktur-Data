package programpacman;

import java.util.Scanner;

public class PacMan {

    public int x = 0, y = 0, width = 5, height = 5;

    public void Gerak() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka gerak : ");
        int n = sc.nextInt();
        sc.nextLine();
        switch (n) {
            case 8:
                moveUp();
                break;
            case 2:
                moveDown();
                break;
            case 4:
                moveLeft();
                break;
            case 6:
                moveRight();
                break;
            default:
                System.out.print("Kembali ke program (y/t)? ");
                String pil = sc.nextLine();
                if (pil.equalsIgnoreCase("y")) {
                    Gerak();
                } else {
                    System.exit(0);
                }
        }
        printPosition();
    }

    public void moveLeft() {
        x--;
        if (x < 0) {
            System.out.println("Anda kalah!");
            System.exit(0);
        }
    }

    public void moveRight() {
        x++;
        if (x >= width) {
            System.out.println("Anda kalah!");
            System.exit(0);
        }
    }

    public void moveUp() {
        y--;
        if (y < 0) {
            System.out.println("Anda kalah!");
            System.exit(0);
        }
    }

    public void moveDown() {
        y++;
        if (y >= height) {
            System.out.println("Anda kalah!");
            System.exit(0);
        }
    }

    public void printPosition() {
        System.out.println("Atas : 8, Bawah : 2, Kiri : 4, Kanan : 6 (Numpad keys)");
        System.out.print("|");
        for (int h = 0; h < width; h++) {
            System.out.print("-");
        }
        System.out.print("|");
        System.out.println("");
        for (int b = 0; b < y; b++) {
            System.out.print("|");
            if (b != y) {
                for (int h = 0; h < width; h++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }
        System.out.print("|");
        for (int a = 0; a < x; a++) {
            System.out.print(" ");
        }
        System.out.print("<");
        for (int a1 = (x + 1); a1 < width; a1++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int v = (y + 1); v < height; v++) {
            System.out.print("|");
            for (int h = 0; h < width; h++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("|");
        for (int h = 0; h < width; h++) {
            System.out.print("-");
        }
        System.out.println("|");
        Gerak();

    }
}
