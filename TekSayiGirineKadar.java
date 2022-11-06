import java.util.Scanner;

public class TekSayiGirineKadar {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        
        int x, total = 0;

        do {
            System.out.print("Sayı giriniz: ");
            x = inp.nextInt();
            if (x % 4 == 0) {
                total += x;

            }
        } while (x % 2 == 0);

        System.out.print("Toplam : " + total);

    }
}
