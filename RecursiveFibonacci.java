import java.util.Scanner;

public class RecursiveFibonacci {
    static int fibonacci(int number) {
        int total = 0;
        if (number == 1 || number == 2) {
            return 1;

        }
        total = fibonacci(number - 1) + fibonacci(number - 2);

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci basamak sayısını giriniz: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

}
