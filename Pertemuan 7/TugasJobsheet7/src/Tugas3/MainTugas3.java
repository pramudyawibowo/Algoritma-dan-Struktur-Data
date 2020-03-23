package Tugas3;

public class MainTugas3 {

    public static void main(String[] args) {
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90}, pos = -1;
        System.out.println("Sorting dengan merge sort");
        Tugas3 mSort = new Tugas3();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);

        int cari = data[data.length - 1];

        System.out.println("Data terbesar adalah " + cari);

        System.out.println("==============================");
        System.out.println("menggunakan binary search");
        Tugas3 pencarian = new Tugas3(data, 10);
        for (int i = 0; i < data.length; i++) {
            int posisi = pencarian.FindBinarySearch(cari, i, data.length - 1);
            if (pos == posisi) {
                continue;
            }
            pos = posisi;
            pencarian.Tampilpoisisi(cari, posisi);
        }

    }
}
