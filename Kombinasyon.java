import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, com;
        int facn = 1, facr = 1, facnr = 1;

        System.out.print("n sayısını giriniz : ");
        n = inp.nextInt();
        System.out.print("r sayısını giriniz : ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            facn *= i;
        }

        for (int j = 1; j <= r; j++) {
            facr *= j;
        }
        for (int k = 1; k <= (n - r); k++) {
            facnr *= k;
        }
        com = facn / (facr * facnr);
        System.out.print("Kombinasyon : " + com);
    }
}
