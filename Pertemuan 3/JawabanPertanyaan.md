# Jawaban 2.3.3

1. Base line pada program tersebut adalah terletak pada baris if n == 1, yaitu ketika variabel n bernilai 1 maka perulangan rekursif akan dihentikan dan fungsi akan mengembalikan nilai 1
2. Sudah lengkap, yaitu  
a. Divide terjadi pada baris int fakto = n * faktorialDC(n-1) ini dikarenakan nilai n akan dipecah terlebih dahulu dengan nilai n-1 yang dimasukkan ke dalam fungsi rekursif faktorialDC(), proses ini dilakukan berulang-ulang hingga program mendapatkan nilai n = 1  
b. Conquer terjadi pada baris yang sama dengan divide, namun ini adalah tahap setelah divide, dimana nilai yang didapat dari fungsi rekursif factorialDC() dikalikan dengan n  
c. Combine terjadi pada baris return dalam fungsi faktorialDC(int n), yaitu seluruh data yang dihasilkan dari tahap conquer akan dikembalikan ke pemanggilan fungsi faktorialDC() pada fungsi main.
3. Bisa, jawaban ada pada source code, saya ganti for menggunakan perulangan while
4. Jawaban ada pada source code
5. Ada, saya mencoba dengan menginputkan 20 inputan faktorial mulai dari angka 5 hingga angka 24, perbedaan waktunya cukup signifikan, hasilnya :   
Brute Force : 0.0077794 detik
Divide and Conquer : 0.0069536 detik

# Jawaban 2.4.3

1. Perbedaan dari kedua method ini adalah  
PangkatBF() : method ini menggunakan algoritma brute force dan merupakan fungsi iteratif, menggunakan perulangan FOR untuk menghitung hasil pangkat.  
PangkatDC(): method ini menggunakan algoritma divide and conquer dan merupaka fungsi rekursif, menghitung hasil pangkat dengan cara memanggil fungsi itu sendiri sampai memenuhi base line.
2.  Maksud dari potongan kode tersebut adalah ketika nilai n dimodulus dengan 2 dan hasilnya adalah 1 (n%2=1) maka bilangan n adalah bilangan ganjil dan dilakukan pernyataan pertama yaitu pengembalian nilai dari fungsi rekursif (pangkatDC(a,n/2) * pangkatDC(a, n/2) * a) digunakan untuk memangkatkan bilangan pada parameter, dan hasilnya dikalikan dengan a atau nilai awal agar hasilnya sesuai dengan hasil sebenarnya (ganjil). sedangkan ketika nilai n dimodulus dengan 2 dan hasilnya adalah bukan 1 (n%2!=1) maka bilangan n adalah bilangan genap dan dilakukan pernyataan kedua yaitu pengembalian nilai dari fungsi rekursif (pangkatDC(a,n/2) * pangkatDC(a, n/2)) dan tanpa dikalikan dengan a
3. tahap combine sudah termasuk, yaitu ketika nilai dari hasil fungsi rekursif tersebut dikembalikan atau pada baris return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a); dan return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
4. Jawaban pada source code Project minggu3 package minggu3 class ModifikasiPangkat.java dan Konstruktor.java
5. Jawaban pada source code Project minggu3 package minggu3 class ModifikasiPangkat.java dan Konstruktor.java

# Jawaban 2.5.3

1. Perhitungan keuntungan masing-masing fungsi  
Method TotalBF() : menggunakan perulangan dengan cara menginputkan hasil penjumlahan dari variabel total dan keuntungan yang diinputkan ke variabel total itu sendiri secara terus menerus tergantung batasan (jumlah bulan) yang diinputkan. Contohnya jika kita memasukkan jumlah bulan sebanyak 3 dan juga menginputkan keuntungan setiap bulannya sebanyak 3 kali maka method ini akan menambahkan ketiga keuntungan setiap bulannya satu persatu ke dalam variabel total  
Method TotalDC() : Sebagai contoh kita menginputkan jumlah bulan sebanyak 5 dan keuntungan setiap bulannya adalah bulan 1 = 3, bulan 2 = 5, bulan 3 = 7, bulan 4 = 9, dan bulan 5 = 11, maka program akan menjalankan tahap berikut :  
a. Program akan membagi data ke 2 sisi yaitu lsum = 1,3 dan rsum = 9,11 dan nilai mid = 7  
b. Lsum melakukan penjumlahan dengan sisinya sendiri yaitu 3 + 5 = 8  
c. Rsum melakukan penjumlahan dengan sisinya sendiri yaitu 9 + 11 = 20  
d. Semua nilai tersebut dijumlahkan pada tahap pengembalian nilai yaitu return lsum+rsum+arr[mid], atau berarti 8 + 20 + 7 = 35
2. Mengubah format System.out.println menjadi System.out.printf, dengan beberapa fungsi yang sesuai yaitu menggunakan fungsi desimal 2 angka di belakang koma (%.2f), sebagai contoh System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n", sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
3. Terdapat return value karena digunakan untuk tahap combine dari algoritma Divide and Conquer, dimana data hasil tahap divide dan tahap conquer digabungkan menjadi satu sehingga mendapat hasil akhir yang diinginkan.
4. Variabel mid dibutuhkan karena untuk memudahkan memahami ketika jumlah datanya ganjil lebih mudah membaginya (divide) ke dua sisi dan ada bagian tengahnya yaitu pada variabel mid
5. 