package tugastiga;
public class Array {
    public static void main(String[] args) {
        char arr[] = {'M','I','S','S','I','S','S','I','P','I'};
        int m = 0, i = 0, s = 0, p = 0;
        for(int a = 0; a < arr.length; a++){
            if(arr[a] == 'M'){
                m++;
            } else if(arr[a] == 'I'){
                i++;
            } else if(arr[a] == 'S'){
                s++;
            } else {
                p++;
            }
        }
        System.out.println("Jumlah M : " + m);
        System.out.println("Jumlah I : " + i);
        System.out.println("Jumlah S : " + s);
        System.out.println("Jumlah P : " + p);
    }
}
