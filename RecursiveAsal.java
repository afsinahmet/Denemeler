
import java.util.Scanner;

public class RecursiveAsal {
    static boolean isPrime(int number,int i) {
        if (number==i){
            System.out.println(number+ " sayısı ASALDIR.");
            return true;

        }else if (number % i == 0) {
            System.out.println(number + "  asal sayı değildir.");
            return false;

        }
        return isPrime(number, i + 1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Sayı Giriniz:");
            number = input.nextInt();
            isPrime(number,2);
        } while (number>0);
    }

}
