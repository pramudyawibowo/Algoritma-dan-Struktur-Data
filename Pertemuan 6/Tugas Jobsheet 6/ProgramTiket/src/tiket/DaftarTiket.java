package tiket;
public class DaftarTiket {
    Tiket listTkt[];
    int idx;
    DaftarTiket(){
        
    }
    void DaftarTiket(int array){
        listTkt = new Tiket[array];
    }
    void tambah(Tiket t){
        if(idx < listTkt.length){
            listTkt[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!");
        }
    }
    void tampil(){
        for(Tiket t : listTkt){
            System.out.println("=====================");
            t.tampil();
            System.out.println("=====================");
        }
    }
    void bubbleSortAsc(){
        for(int i = 0; i < listTkt.length-1; i++){
            for(int j = 1; j < listTkt.length-i; j++){
                if(listTkt[j].harga < listTkt[j-1].harga){
                    Tiket tmp = listTkt[j];
                    listTkt[j] = listTkt[j-1];
                    listTkt[j-1] = tmp;
                }
            }
        }
    }
    void bubbleSortDesc(){
        for(int i = 0; i < listTkt.length-1; i++){
            for(int j = 1; j < listTkt.length-i; j++){
                if(listTkt[j].harga > listTkt[j-1].harga){
                    Tiket tmp = listTkt[j];
                    listTkt[j] = listTkt[j-1];
                    listTkt[j-1] = tmp;
                }
            }
        }
    }
   
    void selectionSortAsc(){
        for(int i = 0; i < listTkt.length-1; i ++){
            int idxMin = i;
            for(int j = i + 1; j < listTkt.length; j++){
                if(listTkt[j].harga < listTkt[idxMin].harga){
                    idxMin = j;
                }
            }
            Tiket tmp = listTkt[idxMin];
            listTkt[idxMin] = listTkt[i];
            listTkt[i] = tmp;
        }
    }
    void selectionSortDesc(){
        for(int i = 0; i < listTkt.length-1; i ++){
            int idxMin = i;
            for(int j = i + 1; j < listTkt.length; j++){
                if(listTkt[j].harga > listTkt[idxMin].harga){
                    idxMin = j;
                }
            }
            Tiket tmp = listTkt[idxMin];
            listTkt[idxMin] = listTkt[i];
            listTkt[i] = tmp;
        }
    }
}
