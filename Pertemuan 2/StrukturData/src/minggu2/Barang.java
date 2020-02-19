package minggu2;

public class Barang {

    public Barang() {
    }

    public String namaBarang, jenisBarang;
    public int stok, hargaSatuan;

    public Barang(String nm, String jn, int hs, int st) {
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    public void tampilBarang() {
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    public void tambahStok(int n) {
        stok = stok + n;
    }

    public void kurangStok(int n) {
        if (stok > 0) {
            stok = stok - n;
        }
    }

    public int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
