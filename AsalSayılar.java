import java.util.Scanner;
public class AsalSayılar {
    public static void main(String[] args) {
        boolean isPrime ;


        for (int i = 2; i <= 100; i++) {
            isPrime = true;
            for (int k = 2; k <i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                }
            }
            while (isPrime) {
                System.out.print(i + " ");
                break;
            }

        }
    
    }
}
