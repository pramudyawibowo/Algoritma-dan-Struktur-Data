/*
 * Nama  : Pramudya Wibowo
 * NIM   : 1941720054
 * Kelas : TI 1F
 */
package cobahitung;

public class Hasil {

    int n, top;
    String stack[];

    public Hasil(int total) {
        n = total;
        top = -1;
        stack = new String[n];
    }

    public void push(String c) {
        top++;
        stack[top] = c;
    }

    public String pop() {
        String item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(String c) {
        if (c.matches("[0123456789. ]")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(String c) {
        if (c.equals("*") || c.equals("^") || c.equals("/") || c.equals("*") || c.equals("%") || c.equals("-") || c.equals("+")) {
            return true;
        } else {
            return false;
        }
    }

    public int konversi(String Q) {
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(Character.toString(c))) {
                push(Character.toString(c));
            } 
            if (IsOperator(Character.toString(c))) {
                int x = Integer.parseInt(String.valueOf(pop()));
                int y = Integer.parseInt(String.valueOf(pop()));
                int hasil;
                switch (c) {
                    case '^':
                        hasil = y^x;
                        push(Integer.toString(hasil));
                        break;
                    case '%':
                        hasil = y%x;
                        push(Integer.toString(hasil));
                        break;
                    case '/':
                        hasil = y/x;
                        push(Integer.toString(hasil));
                        break;
                    case '*':
                        hasil = y*x;
                        push(Integer.toString(hasil));
                        break;
                    case '-':
                        hasil = y-x;
                        push(Integer.toString(hasil));
                        break;
                    case '+':
                        hasil = y+x;
                        push(Integer.toString(hasil));
                        break;
                    default:
                        continue;
                }
            }
        }
        return Integer.parseInt(String.valueOf(pop()));
    }
}
