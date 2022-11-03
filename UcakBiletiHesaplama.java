
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double perKm = 0.10, toplam, ind1 = 0.5, ind2 = 0.9, ind3 = 0.7;
        boolean isError = false;

        System.out.print("Mesafeyi Km cinsinden giriniz: ");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.print("Yolculuk tipini seçiniz (1-Tek yön, 2-Gidiş dönüş)");
        yolculukTipi = inp.nextInt();

        toplam = mesafe * perKm;
        if ((mesafe > 0 && yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas > 0 && yas < 12) {
                toplam = toplam * ind1;
            } else if (yas > 12 && yas < 24) {
                toplam = toplam * ind2;
            } else if (yas > 65) {
                toplam = toplam * ind3;
            }
            if (yolculukTipi == 2) {
                toplam = toplam * 0.8 * 2;
            }
        } else {
            isError = true;
        }
        if (isError == true) {
    System.out.print("Hatalı veri girdiniz");

        }else {
            System.out.print("Toplam tutar: " + toplam);
        }

    }


}



