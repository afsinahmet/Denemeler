import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int total = 0, first = 0, second = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Seri kaç basamaklı olacak: ");
        int n = input.nextInt();

        System.out.print(n+" Elemanlı Fibonacci Serisi : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first+" ");
            total = first + second;
            first = second;
            second = total;



        }
    }
}
