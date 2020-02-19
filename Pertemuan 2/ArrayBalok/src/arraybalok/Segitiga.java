package arraybalok;

public class Segitiga {

    public int alas, tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double hasil = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return hasil + alas + tinggi;
    }
}
