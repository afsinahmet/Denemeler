import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, select, sonuc;
        System.out.print("Birinci sayıyı giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = inp.nextInt();

        switch (select) {
            case (1):
                sonuc = a + b;
                System.out.print("Sonuç :" + sonuc);
                break;
            case (2):
                sonuc = a - b;
                System.out.print("Sonuc : " + sonuc);
                break;
            case (3):
                sonuc = a * b;
                System.out.print("Sonuc : " + sonuc);
                break;
            case (4):
                if (b != 0) {
                    sonuc = a / b;
                    System.out.print("Sonuc : " + sonuc);
                } else {
                    System.out.print("Bir sayı sıfıra bölünemez.");
                }
                break;
            default:
                System.out.print("Hatalı seçim yaptınız!");
        }


    }

}
