import java.util.Scanner;
import javax.swing.*;

public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        double total = 0, harmonik = 0;

        System.out.print("Sayıyı Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            harmonik = (1.0 / i);
            total = (total) + (harmonik);
        }

        System.out.print("Harmonik seri sonucunuz : " + total);
    }


}
