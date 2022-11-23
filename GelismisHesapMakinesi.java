import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i + ".sayı: ");
            i++;
            number = input.nextInt();
            result += number;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = input.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = input.nextInt();
        int result = 1, number;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı: ");
            number = input.nextInt();
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı: ");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.print("Böleni 0 giremezsiniz");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;

        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;

        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Hangi sayıya göre mod alınacak: ");
        int b = input.nextInt();
        while (b == 0) {
            System.out.print("Bölünecek sayı 0 olamaz.");
            b = input.nextInt();
        }
        int result = 0;

        result = a % b;
        System.out.println("Sonuç: " + result);
    }

    static void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        int b = input.nextInt();
        int area = a * b;
        int env = 2 * (a + b);
        System.out.println("Alan: " + area + " " + "Çevre: " + env);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);

        do {
            System.out.print("Hangi işlemi yapmak istiyorsunuz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calculate();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }

        } while (select != 0);
    }

}
