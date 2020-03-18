package klasemen;
public class DaftarLiga {
    Klasemen listLiga[] = new Klasemen[20];
    int idx;
    void tambah(Klasemen m){
        if(idx < listLiga.length){
            listLiga[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!");
        }
    }
    void tampil(){
        for(Klasemen m : listLiga){
            m.tampil();
            System.out.println("======================================================================================");
        }
    }
    void insertionSortAsc(){
        int i, j;
        for(i = 1; i < listLiga.length; i++){
            Klasemen temp = new Klasemen();
            temp = listLiga[i];
            j = i;
            while ((j > 0) && (listLiga[j-1].point > temp.point)){
                listLiga[j] = listLiga[j-1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
    void insertionSortDesc(){
        int i, j;
        for(i = 1; i < listLiga.length; i++){
            Klasemen temp = new Klasemen();
            temp = listLiga[i];
            j = i;
            while ((j > 0) && (listLiga[j-1].point < temp.point)){
                listLiga[j] = listLiga[j-1];
                j--;
            }
            listLiga[j] = temp;
        }
    }
}
