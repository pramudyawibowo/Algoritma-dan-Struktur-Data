/*
 * Nama  : Pramudya Wibowo
 * noBrg   : 1941720054
 * Kelas : TI 1F
 */
package tugas2;

public class DaftarPerlengkapan {

    Perlengkapan head;
    int size;

    public DaftarPerlengkapan() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int noBrg, String namaBrg, int berat, int jumlah) {
        head = new Perlengkapan(noBrg, namaBrg, berat, jumlah, head);
        size++;
    }

    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tas Masih Kosong!");
        }
        System.out.println("========Barang Keluar========");
        System.out.println("No. Barang\t: " + head.noBrg);
        System.out.println("Nama Barang\t: " + head.namaBrg);
        System.out.println("Berat\t\t: " + head.berat);
        System.out.println("Jumlah\t\t: " + head.jumlah);
        System.out.println("=============================");
    }

    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Tas Masih Kosong!");
        }
        Perlengkapan tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        System.out.println("========Barang Keluar========");
        System.out.println("No. Barang\t: " + tmp.noBrg);
        System.out.println("Nama Barang\t: " + tmp.namaBrg);
        System.out.println("Berat\t\t: " + tmp.berat);
        System.out.println("Jumlah\t\t: " + tmp.jumlah);
        System.out.println("=============================");
    }

    public void removeFirst() throws Exception {
        System.out.println("========Barang Keluar========");
        System.out.println("No. Barang\t: " + head.noBrg);
        System.out.println("Nama Barang\t: " + head.namaBrg);
        System.out.println("Berat\t\t: " + head.berat);
        System.out.println("Jumlah\t\t: " + head.jumlah);
        System.out.println("=============================");
        head = head.next;
        size--;
    }

    public void clear() {
        System.out.println("Semua Barang Dikeluarkan!");
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Perlengkapan tmp = head;
            System.out.println("Tumpukan dari teratas ke terbawah : ");
            System.out.println("=============================");
            while (tmp != null) {
                System.out.println("No. Barang\t: " + tmp.noBrg);
                System.out.println("Nama Barang\t: " + tmp.namaBrg);
                System.out.println("Berat\t\t: " + tmp.berat);
                System.out.println("Jumlah\t\t: " + tmp.jumlah);
                System.out.println("=============================");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List KOSONG!");
        }
    }

    public void cari(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai tumpukan diluar batas");
        } else {
            Perlengkapan tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Barang pada tumpukan ke-" + index + " adalah : ");
            System.out.println("=============================");
            System.out.println("No. Barang\t: " + tmp.noBrg);
            System.out.println("Nama Barang\t: " + tmp.namaBrg);
            System.out.println("Berat\t\t: " + tmp.berat);
            System.out.println("Jumlah\t\t: " + tmp.jumlah);
            System.out.println("=============================");
        }
    }

    public void cariKey(int cari) throws Exception {
        Perlengkapan tmp = head;
        int index = 0;
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Tas Masih Kosong!");
        } else {
            while (tmp.next != null) {
                tmp = tmp.next;
                if ((int) head.noBrg == cari) {
                    ditemukan = true;
                    break;
                } else if ((int) tmp.noBrg == cari) {
                    ditemukan = true;
                    index++;
                    break;
                }
                index++;
            }
        }
        if (ditemukan) {
            System.out.println("Nomor barang " + cari + " ditemukan pada tumpukan ke-" + index);
        } else {
            throw new Exception("Nomor barang tidak ditemukan!");
        }
    }

    public void hitungBerat() {
        if (!isEmpty()) {
            Perlengkapan tmp = head;
            int total = 0;
            System.out.println("Barang : ");
            System.out.println("=============================");
            while (tmp != null) {
                total += tmp.beratBrg;
                System.out.println("Nama Barang\t: " + tmp.namaBrg);
                System.out.println("Berat\t\t: " + tmp.berat);
                System.out.println("Jumlah\t\t: " + tmp.jumlah);
                System.out.println("Total Berat\t: " + tmp.beratBrg);
                System.out.println("=============================");
                tmp = tmp.next;
            }
            System.out.println("Total Berat keseluruhan " + total + " gram");
        } else {
            System.out.println("Tas Masih Kosong!");
        }
    }
}
