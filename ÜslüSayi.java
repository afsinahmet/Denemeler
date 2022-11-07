import java.util.Scanner;

public class ÜslüSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x, y, total = 1;
        System.out.print("Sayıyı giriniz : ");
        x = inp.nextInt();
        System.out.print("Üssün kaç olacağını giriniz : ");
        y = inp.nextInt();

        for (int i = 1; i <= y; i++) {

            total *= x;
        }
        System.out.print(x + " sayısının " + y + " kuvveti : " + total);
    }
}
