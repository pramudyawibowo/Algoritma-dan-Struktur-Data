/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package kuisduapramudyawibowo;

public class LinkedLists {

    Th2018 head18;
    Th2019 head19;
    Th2020 head20;
    int size;

    public LinkedLists() {
        head18 = null;
        head19 = null;
        head20 = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head18 == null && head19 == null && head20 == null;
    }

    public void addFirst(int item1, int item2, int item3) {
        head18 = new Th2018(item1, head18);
        head19 = new Th2019(item2, head19);
        head20 = new Th2020(item3, head20);
        size++;
    }

    public void addLast(int item1, int item2, int item3) {
        if (isEmpty()) {
            addFirst(item1, item2, item3);
        } else {
            Th2018 tmp1 = head18;
            Th2019 tmp2 = head19;
            Th2020 tmp3 = head20;
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            tmp1.next = new Th2018(item1, null);
            tmp2.next = new Th2019(item2, null);
            tmp3.next = new Th2020(item3, null);
            size++;
        }
    }

    public void clear() {
        head18 = null;
        head19 = null;
        head20 = null;
        size = 0;
    }

    public void print() throws Exception {
        if (!isEmpty()) {
            Th2018 tmp1 = head18;
            Th2019 tmp2 = head19;
            Th2020 tmp3 = head20;
            int bulan = 1;
            System.out.println("Bulan ke- 2018\t2019\t2020");
            while (tmp1 != null) {
                System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                bulan++;
            }
            System.out.println();
        } else {
            throw new Exception("Data Kosong!");
        }
    }
}
