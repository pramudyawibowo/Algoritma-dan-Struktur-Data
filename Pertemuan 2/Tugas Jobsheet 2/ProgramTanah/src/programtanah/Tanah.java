package programtanah;
public class Tanah {
    public int panjang, lebar;
    public Tanah(){
        
    }
    public Tanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    public int hitungLuas(){
        return panjang * lebar;
    }
}
