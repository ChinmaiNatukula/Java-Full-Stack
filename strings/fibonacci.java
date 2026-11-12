package strings;

public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        


    }

    
}
