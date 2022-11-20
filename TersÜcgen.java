import java.util.Scanner;

public class TersÜcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int step, temp;
        System.out.print("Basamak sayısını giriniz: ");
        step = inp.nextInt();
        temp = step;

        for (int i = 1; i <= step; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * temp - 1); k++) {
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }
    }

}

