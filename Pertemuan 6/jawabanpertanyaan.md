# Jawaban Pertaanyaan Praktikum 1 - 3

1. Hasil input array praktikum 1 :  
<img src="laporanPraktikum/inputArray.png">  

2. Perlu dibuat objek sebanyak k2 kali karena kedua objek ini berbeda fungsi dan harus ada, baris yang pertama mendeklarasikan array objek yang bernama ppArray dari class minMax sepanjang 5 indeks. Dan yang kedua adalah membuat array objek ppArray dengan indeks 0 agar indeks array ini dapat diisi
3. Hasil modifikasi :  
<img src="laporanPraktikum/modifikasino3.png">

4. Maksud dari angka 4 dari kode tersebut adalah inputan untuk salah satu variabel dari parameter fungsi max_min dimana angka 4 berfungsi untuk menambahkan indeks akhir dari array ppArray, yaitu 0,1,2,3,4
5. Nilai indeks awal, indeks akhir dan indeks tengah diperlukan, karena pada algoritma divide and conquer dilakukan pemecahan masalah dengan pembagian antara nilai kanan dan kiri, nilai kiri menggunakan indeks awal (indeks ke-0), dan nilai kanan menggunakan indeks akhir (indeks ke-(n-1)), serta indeks tengah yaitu terletak diantara indeks awal dan akhir
6. Class Maxmin harus terpisah karena pada class minMax fungsi max_min akan dibuat array objek dan dekalarasi dari class tidak boleh dilakukan di class yang berbeda.
7. Tidak bisa dilakukan, karena pada main classnya, untuk memasukkan data dibuat array terlebih dahulu, lalu array ini digunakan untuk parameter dari setiap array objek yang diinputkan ke dalam array arr
8. Tidak bisa dilakukan.
9. Tidak bisa, karena fungsi void memang tidak memerlukan nilai kembalian.
10. Algoritma divide and conquer lebih baik, karena algoritma ini memerlukan memori yang kecil, algoritma ini memecah permasalahan menjadi permasalahan yang lebih kecil lalu diproses, setelah itu dari hasil keseluruhan proses dikumpulkan menjadi satu, berbeda dengan algoritma brute force, algoritma ini mengulang-ulang seluruh aktivitas dengan tahap yang sama dan dengan menambahkan secara langsung hasil dari proses sehingga perlu waktu yang lebih lama serta resources yang cukup besar.
11. Pada kode program tersebut menggunakan operator ternary, yaitu menggunakan pengecekan kondisi dan mendapatkan jawaban true\false secara sederhana, tanda ":" digunakan sebagai pemisah antara true dan false, sebelah kiri tanda ":" merupakan pernyataan yang akan dijalankan ketika kondisi bernilai true, dan sebelah kanan ketika kondisi bernilai false.
12. Penggunaan tanda "?" yaitu sebagai pemisah antara kondisi yang akan diperiksa dan kumpulan pernyataan yang akan dijalankan bergantung pada kondisi yang diinputkan.

# Jawaban Pertanyaan Praktikum 4
1. Notasinya adalah O(n.n.1) = O(n^2)
2. Berdasarkan notasi nomor 1, n = 100, sehingga O(n^2) = 100^2 = 10000 instruksi
3. Pada kode A notasinya adalah O(n.n.1) = O(n^2). Pada kode B notasinya adalah O(n.∞.1) = O(n.∞). Ini karena pada kode A inner loopnya, perubahan nilai menggunakan j++, yang mana program akan berulang dan berhenti ketika j telah mencapai batas, sedangkan pada kode B menggunakan i++ yang dimana tidak berhubungan dengan j, maka terjadi infinity loop, karena j nya akan selalu 0, serta kondisinya akan selalu terpenuhi