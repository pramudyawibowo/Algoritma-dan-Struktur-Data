/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package UAS;

public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int kode, String judul, String penerbit, int stok, int rusak) {
        if (isEmpty()) {
            head = new Node(null, kode, judul, penerbit, stok, rusak, null);
        } else {
            Node newNode = new Node(null, kode, judul, penerbit, stok, rusak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int kode, String judul, String penerbit, int stok, int rusak) {
        if (isEmpty()) {
            addFirst(kode, judul, penerbit, stok, rusak);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, kode, judul, penerbit, stok, rusak, null);
            current.next = newNode;
            size++;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Index\tKode\tJudul\t\tPenerbit\tStok\tRusak");
            int index = 0;
            while (tmp != null) {
                System.out.println(index + "\t" + tmp.kode + "\t" + tmp.judul + "\t" + tmp.penerbit + "\t" + tmp.stok + "\t" + tmp.rusak);
                tmp = tmp.next;
                index++;
            }
        } else {
            System.out.println("Linked Lists Kosong!");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar buku kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar buku kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void update(int index, int rusak) {
        if (isEmpty()) {
            System.out.println("Daftar buku kosong, tidak dapat mengubah");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                if(i == index){
                    current.rusak = rusak;
                }
                current = current.next;
                i++;
            }
        }
    }

    public void cari(int cari) throws Exception {
        Node current = head;
        int index = 0;
        if (isEmpty()) {
            System.out.println("LinkedLists kosong");
        } else {
            while (current.next != null && (int) current.kode == cari) {
                current = current.next;
                index++;
            }
            if ((int) current.kode == cari) {
                System.out.println("Data : " + cari + " ditemukan pada indeks ke-" + index);
            } else {
                throw new Exception("Data tidak ditemukan!");
            }
        }
    }
    
    public void cari2(String cari) throws Exception {
        Node current = head;
        int index = 0;
        if (isEmpty()) {
            System.out.println("LinkedLists kosong");
        } else {
            while (current.next != null && current.judul.equals(cari)) {
                current = current.next;
                index++;
            }
            if (current.judul.equals(cari)) {
                System.out.println("Data : " + cari + " ditemukan pada indeks ke-" + index);
            } else {
                throw new Exception("Data tidak ditemukan!");
            }
        }
    }
}
