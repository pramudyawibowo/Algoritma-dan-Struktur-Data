# Jawaban Pertanyaan Praktikum 1 & 2

# Praktikum 1
1. Fungsi kode program tersebut adalah sebagai konstruktor, yaitu untuk memasukkan data dari parameter yang diinputkan ke variabel yang telah dideklarasikan pada class Searching, pada perulangan for digunakan untuk memasukkan data berupa array.
2. Fungsi break pada kode program tersebut adalah untuk menghentikan perulangan yang sedang berlangsung ketika kondisi yang ditentukan telah terpenuhi, sehingga program akan melanjutkan pada tahap selanjutnya yaitu setelah perulangannya.
3. Program masih dapat berjalan, dan hasil yang dikeluarkan adalah benar, karena indeks angka 30 pada awalnya ditaruh pada array indeks ke 1, sedangkan setelah diubah, maka angka 30 nya ada pada array indeks ke 2, dan yang dikeluarkan program adalah data ditemukan pada indeks ke 2

# Praktikum 2
1. Proses divide dilakukan pada baris berikut
<img src = divideconquer.png>
Pada baris ini dilakukan pembagian data ke dalam 3 bagian, yaitu data kiri, tengah dan kanan. Pencocokan dilakukan tergantung pada kondisi antara data yang dicari dengan data yang diperiksa apakah sama dengan, kurang dari ataupun lebih besar.

2. Proses conquer dilakukan pada baris berikut
<img src = divideconquer.png>
Pada baris ini juga dilakukan pengembalian hasil dari pencocokan data, apabila data telah ditemukan, maka indeks yang didapat akan dikembalikan pada pemanggilan fungsi, dan data yang telah dipecah-pecah digabungkan kembali menjadi data yang utuh.

3. Hasilnya adalah data tidak ditemukan, ini tidak sesuai, seharusnya data 30 ditemukan pada indeks ke 7, cara agar sesuai adalah mengubah kode program pada method FindBinarySearch() dengan mengubah operator logika lebih dari (>) menjadi kurang dari (<), ini dikarenakan, data yang akan dilakukan pencarian sudah diurutkan dari yang terbesar ke terkecil.
<img src = modifikasibinary.png>

4. Data 30 tidak ditemukan, karena data tidak diurutkan terlebih dahuku dari data terkecil ke terbesar, jika tidak diurutkan maka program akan mengabaikan data yang seharusnya diperiksa.
5. Modifikasi ada pada project minggu7 package TestSearching, class ModifikasiSearching.java