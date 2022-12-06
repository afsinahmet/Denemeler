import java.util.Arrays;
import java.util.Scanner;

public class EnYakınSayı {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = input.nextInt();
        int min = list[0];
        int max = list[list.length - 1];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > min && list[i] < number) {
                min = list[i];
            }
            if (list[i] < max && list[i] > number) {
                max = list[i];
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}
