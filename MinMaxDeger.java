import java.util.Scanner;

public class MinMaxDeger {

    public static void main(String[] args) {
        int number, n, maxNumber = 0, minNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + ".Sayıyı giriniz: ");
            n = input.nextInt();

            if (i == 1) {
                maxNumber = n;
                minNumber = n;
            }
            if (n > maxNumber) {
                maxNumber = n;
            } else if (n < minNumber) {
                minNumber = n;
            }
        }
            System.out.println("En büyük sayı: " + maxNumber);
            System.out.print("En küçük sayı: " + minNumber);




    }
}
