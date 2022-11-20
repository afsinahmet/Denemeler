import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int number, total = 0;
        boolean condition = true;
        while (condition) {

            do {
                System.out.print("Sayıyı Giriniz: ");
                number = inp.nextInt();
                if (number <= 0) {
                    System.out.println("Pozitif bir sayı giriniz.");

                }
            } while (number <= 0);

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;

                }
            }
            if (number == total) {
                System.out.println(number + " Mükemmel sayıdır.");
                total=0;

            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
                total=0;
            }
        }

    }

}
