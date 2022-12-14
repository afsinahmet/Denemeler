import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        int right = 5;
        int indis = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        System.out.println(number);
        while (right > 0) {
            System.out.print("Tahmininizi giriniz: ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right--;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + right);
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }

                continue;
            }


            if (selected == number) {
                System.out.println("Tebrikler,tahmininiz doğru! Girdiğiniz sayı: " + number);
                isWin = true;
                break;

            } else {
                System.out.println("Hatalı bir sayı girdiniz.");
                if (selected > number) {
                    System.out.println("Daha küçük bir sayı giriniz.");
                } else {
                    System.out.println("Daha büyük bir sayı giriniz.");
                }
                wrong[indis++] = selected;
                System.out.println("Kalan hakkınız: " + --right);

            }

        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Girdiğiniz tahminler: " + Arrays.toString(wrong));
        }

    }
}
