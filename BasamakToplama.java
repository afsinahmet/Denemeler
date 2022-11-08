import java.util.Scanner;

public class BasamakToplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        int value = 0;

        while (number != 0) {

            value += (number % 10);
            number /= 10;
        }
        System.out.print("Sayının basamakları toplamı :" + value);
    }

}
