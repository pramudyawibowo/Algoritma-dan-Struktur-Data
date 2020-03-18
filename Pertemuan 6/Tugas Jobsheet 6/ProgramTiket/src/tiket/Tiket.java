package tiket;
public class Tiket {
    String maskapai;
    float harga;
    int transitCount, flightTime;
    Tiket(String m, float h, int tC, int fT){
        maskapai = m;
        harga = h;
        transitCount = tC;
        flightTime = fT;
    }
    void tampil(){
        System.out.println("Maskapai\t\t: " + maskapai);
        System.out.printf("Harga\t\t\t: Rp%,.1f\n", harga);
        System.out.println("Jumlah Transit\t\t: " + transitCount);
        System.out.println("Durasi Penerbangan\t: " + flightTime);
    }
}
