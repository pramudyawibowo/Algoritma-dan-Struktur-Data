/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package tugas3;

import java.util.Scanner;

public class MainDaftarMahasiswa {

    public static void main(String[] args) {
        DaftarMahasiswa data = new DaftarMahasiswa();
        Scanner sc = new Scanner(System.in);
        String nama;
        int nilai;
        for(int i = 0; i < 5; i++){
            System.out.print("Masukkan nama Mahasiswa\t\t: ");
            nama = sc.nextLine();
            System.out.print("Masukkan nilai Mahasiswa\t: ");
            nilai = sc.nextInt();
            sc.nextLine();
            data.addLast(nama, nilai);
            System.out.println("");
        }
        data.print();
        data.SelectionSort();
        data.print();
    }
}
