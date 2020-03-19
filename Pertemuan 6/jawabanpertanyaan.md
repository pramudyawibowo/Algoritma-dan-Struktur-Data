# Jawaban Pertaanyaan Praktikum

1. Proses Bubble Sort berada pada method bubbleSort() di class DaftarMahasiswaBerprestasi
2. Proses Selection Sort berada pada method selectionSort() di class DaftarMahasiswaBerprestasi
3. Proses swap adalah proses penukaran dua nilai elemen array dari suatu indeks ke indeks yang lain pada satu array. Potongan program swap:  
<img src = swap.png>

4. Baris Program Method bubbleSort():  
<img src = bubbleSort.png>
Proses ini merupakan proses utama algoritma bubble sort yaitu dengan membandingkan suatu indeks dengan indeks sebelumnya. Jika kondisi yang diberikan memenuhi, maka akan dilakukan proses swap atau penukaran. Misalnya ingin mengurutkan secara descending maka kondisi yang diberikan adalah jika listMhs[j].ipk > listMhs[j-1].ipk maka akan terjadi swap yaitu penukaran nilai elemen listMhs[j].ipk dengan nilai elemen listMhs[j-1].ipk

5. Perulangan pada method BubbleSort() :
<img src = "perulangan bubbleSort.png">  
A. Perulangan i (outer) digunakan untuk memulai perulangan j (inner), Sedangkan Perulangan j (inner) untuk melakukan penukaran indeks.   
B. Perulangan i adalah i < listMhs.length-1 memenuhi 2 proses perulangan namun dari index 0.  
C. Perulangan j adalah j < listMhs.length-i untuk memenuhi 2 proses perulangan namun mulai dari index 1.  
D. Perulangan i akan berlangsung sebanyak 49 kali. Banyak tahap bubbleSort ada 1225

6. Kode Program pada method selectionSort() :
<img src = selectionSort.png>
Maksud proses tersebut untuk mencari nilai terkecil lalu dilakukan penukaran tempat. Selection sort merupakan metode pengurutan dengan mencari nilai data terkecil dimulai dari data indeks 0 hingga indeks N-1. Jika terdapat N data dan data terkoleksi dari urutan 0 sampai dengan N-1. Selama proses, perbandingan dan pengubahan, hanya dilakukan pada indeks pembandingnya saja, pertukaran data secara fisik terjadi pada akhir proses.

7. Modifikasi ada pada project minggu6, package minggu 6, class DaftarMahasiswaBerprestasi.java method insertionSortDesc()
<img src = modifikasi.png>  