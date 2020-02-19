package programpersewaan;
public class Persewaan {
    public String idmember, nama, game;
    public int harga, hari;
    public Persewaan(){
        
    }
    public Persewaan(String id, String nm, String gm, int hrg, int hr){
        idmember = id;
        nama = nm;
        game = gm;
        hari = hr;
        harga = hrg * hari;
    }
    public void tampilData(){
        System.out.println("\n===Data Persewaan===");
        System.out.println("Id member anda\t\t: " + idmember);
        System.out.println("Nama anda\t\t: " + nama);
        System.out.println("Game anda \t\t: " + game);
        System.out.println("Lama hari\t\t: " + hari);
        System.out.println("Harga total\t\t: " + harga);
        System.out.println("=====================");
    }
}
