package tugasdua;
public class Bank {
    public static void main(String[] args) {
        int bulan = 0;
        double uang = 1000000, bunga = 0.02;
        System.out.printf("Uang anda sebesar : Rp%,.2f\n", uang);
        for(bulan = 0; uang < 1500000; bulan++){
            uang += uang * bunga;
        }
        System.out.printf("Dalam waktu\t: %d bulan\nUang Anda\t: Rp%,.2f\n", bulan, uang);
    }
}