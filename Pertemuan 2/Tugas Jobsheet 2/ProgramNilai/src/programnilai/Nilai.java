package programnilai;
public class Nilai {
    public int nilai1, nilai2;
    public Nilai(int n1, int n2){
        nilai1 = n1;
        nilai2 = n2;
    }
    public int nilaiTerbaik(){
        if(nilai1 > nilai2){
            return nilai1;
        } else {
            return nilai2;
        }
    }
}
