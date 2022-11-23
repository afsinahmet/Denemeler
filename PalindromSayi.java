import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalidrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println(number + " Palindrom Sayı");
            return true;
        } else {
            System.out.println(number+" Palindrom sayı değil");
            return false;
        }

    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = inp.nextInt();
       isPalidrom(number);

    }
}
