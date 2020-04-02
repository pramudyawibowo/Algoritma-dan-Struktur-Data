package Tugas1;

public class MainTugas1 {

    public static void main(String[] args) {

        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan merge sort");
        Tugas1 mSort = new Tugas1();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);

        Tugas1 pencarian = new Tugas1(data, 8);
        int cari = 30;

        System.out.println("==============================");
        System.out.println("menggunakan binary search");
        int posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.Tampilpoisisi(cari, posisi);
    }
}
