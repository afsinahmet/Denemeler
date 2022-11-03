
import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz, ders = 0,toplam=0;
        double average ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu: ");
        mat = inp.nextInt();
        if (0 <= mat && mat <= 100) {
            ders++;
            toplam += mat;
        }

        System.out.print("Fizik notunuz : ");
        fiz = inp.nextInt();
        if (0 <= fiz && fiz <= 100) {
            ders++;
            toplam += fiz;
        }

        System.out.print("Türkçe notunuz : ");
        turk = inp.nextInt();
        if (0 <= turk && turk <= 100) {
            ders++;
            toplam += turk;
        }

        System.out.print("Kimya notunuz : ");
        kim = inp.nextInt();
        if (0 <= kim && kim <= 100) {
            ders++;
            toplam += kim;
        }

        System.out.print("Müzik notunuz : ");
        muz = inp.nextInt();
        if (0 <= muz && muz <=100){
            ders++;
            toplam+=muz;
        }
        
        average=toplam/ders;

        if (average >= 55) {
            System.out.println("Tebrikler , Sınıfı Geçtiniz");
        } else {
            System.out.println("Sınıfta Kaldınız");
        }

        System.out.println("Ortalamanız : " + average);

    }
}
