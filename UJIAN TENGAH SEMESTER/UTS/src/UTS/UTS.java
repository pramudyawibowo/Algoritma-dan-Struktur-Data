/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package UTS;

public class UTS {

    DataKeluarga listKlrg[];
    int idx;

    UTS() {

    }

    void UTS(int array) {
        listKlrg = new DataKeluarga[array];
    }

    void tambah(DataKeluarga t) {
        if (idx < listKlrg.length) {
            listKlrg[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!");
        }
    }

    void tampil() {
        for (DataKeluarga t : listKlrg) {
            System.out.println("=====================");
            t.tampil();
            System.out.println("=====================");
        }
    }

    void selectionSortAsc() {
        for (int i = 0; i < listKlrg.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listKlrg.length; j++) {
                if (listKlrg[j].umur < listKlrg[idxMin].umur) {
                    idxMin = j;
                }
            }
            DataKeluarga tmp = listKlrg[idxMin];
            listKlrg[idxMin] = listKlrg[i];
            listKlrg[i] = tmp;
        }
    }
    
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listKlrg[mid].umur) {
                return (mid);
            } else if (listKlrg[mid].umur > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public void Tampilpoisisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Ada anggota keluarga yang berumur " + x + " tahun");
        } else {
            System.out.println("Tidak ada anggota keluarga yang berumur " + x + " tahun");
        }
    }
    
    public void TampilCari(int x){
        System.out.println("=====================");
        listKlrg[x].tampil();
        System.out.println("=====================");
    }
}
