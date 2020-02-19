package programdiskon;

public class Diskon {

    public String nama;
    public int hargaSatuan, jumlah;
    public double diskon;

    public Diskon() {

    }

    public Diskon(String nm, int hs, int jml) {
        nama = nm;
        hargaSatuan = hs;
        jumlah = jml;
    }

    public int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    public int hitungDiskon() {
        if (hitungHargaTotal() > 100000) {
            System.out.println("Anda mendapat diskon 10%");
            diskon = 0.1 * hitungHargaTotal();
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            System.out.println("Anda mendapat diskon 5%");
            diskon = 0.05 * hitungHargaTotal();
        } else {
            System.out.println("Anda tidak mendapat diskon");
            diskon = 0 * hitungHargaTotal();
        }
        return (int) diskon;
    }

    public int hitungHargaBayar() {
        return hitungHargaTotal() - (int) diskon;
    }
    
    public void tampilData() {
        double total = hitungHargaTotal(), bayar = hitungHargaBayar();
        System.out.println("Barang\t: " + nama);
        System.out.println("Jumlah\t: " + jumlah);
        System.out.printf("Total\t: Rp%,.1f\n", total);
        System.out.printf("Diskon\t: Rp%,.1f\n", diskon);
        System.out.printf("Bayar\t: Rp%,.1f\n", bayar);
    }
}
