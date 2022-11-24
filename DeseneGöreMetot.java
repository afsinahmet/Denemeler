import java.util.Scanner;

public class DeseneGöreMetot {

    static void positive(int n, int temp, boolean test) {

        if (n > 0 && test) {
            System.out.print(n + " ");
            n = n - 5;
            if (n <= 0) test = false;
            positive(n, temp, test);

        } else if (temp >= n && !test) {
            System.out.print(n + " ");
            n = n + 5;
            positive(n,temp,test);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        int temp = n;
        boolean test = true;
        positive(n, temp, test);

    }


}
