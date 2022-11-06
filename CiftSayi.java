
import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x, count = 0, total = 0;
        double average;

        System.out.print("Sayı Giriniz: ");
        x = inp.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }
        average = total / (count - 1);
        if (total != 0) {
            System.out.print("Ortalama : " + average);
        } else {
            System.out.print(x + "sayısına kadar 3'e ve 4'e bölünebilen sayı yoktur.");
        }


    }
}
