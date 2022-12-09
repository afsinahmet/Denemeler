import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Dizinin boyutu: ");
        n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        System.out.print("Sıralama: ");
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}
