package klasemen;
public class MainKlasemen {
    public static void main(String[] args) {
        DaftarLiga data = new DaftarLiga();
        Klasemen[] L = new Klasemen[20];

        L[0] = new Klasemen("Manchester United", 28, 12, 42);
        L[1] = new Klasemen("Tottenham Hotspur", 29, 7, 41);
        L[2] = new Klasemen("Arsenal\t\t", 28, 4, 40);
        L[3] = new Klasemen("Burnley\t\t", 29, -6, 39);
        L[4] = new Klasemen("Crystal Palace\t", 29, -6, 39);
        L[5] = new Klasemen("Everton\t\t", 29, -6, 37);
        L[6] = new Klasemen("Liverpool\t", 29, 45, 82);
        L[7] = new Klasemen("Manchester City\t", 27, 39, 57);
        L[8] = new Klasemen("Leicester\t", 28, 26, 50);
        L[9] = new Klasemen("Newcastle United", 29, -16, 35);
        L[10] = new Klasemen("Southampton\t", 29, -17, 34);
        L[11] = new Klasemen("Brighton & Hove Albion", 29, -8, 29);
        L[12] = new Klasemen("Chelsea\t\t", 29, 9, 48);
        L[13] = new Klasemen("Wolverhampton Wanderers", 29, 7, 43);
        L[14] = new Klasemen("Sheffield United", 28, 5, 43);
        L[15] = new Klasemen("West Ham United\t", 29, -15, 27);
        L[16] = new Klasemen("Watford\t\t", 29, -17, 27);
        L[17] = new Klasemen("AFC Bournemouth\t", 29, -18, 27);
        L[18] = new Klasemen("Aston Villa\t", 27, -18, 25);
        L[19] = new Klasemen("Norwich City\t", 29, -27, 21);
        
        for (int i = 0; i < 20; i++) {
            data.tambah(L[i]);
        }
        
        System.out.println("Daftar Liga Inggris Sebelum Sorting : ");
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Asc : ");
        data.insertionSortAsc();
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Desc : ");
        data.insertionSortDesc();
        data.tampil();
    }
}
