import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int ebob = 1, ekok = 0;
        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        int i = 1;
        while (i <= a || i <= b) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }
        int k = 1;
        while (k <= a * b) {
            if (k % a == 0 && k % b == 0) {
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println("Ebob: " + ebob);
        System.out.print("Ekok: " + ekok);
    }
}
