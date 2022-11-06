import java.util.Scanner;
public class DördünveBesinKuvvetleri {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x;
        System.out.print("Sayı giriniz: ");
        x = inp.nextInt();
        System.out.println("4'ün kuvvetleri : ");
        for (int i = 1; i < x; i *= 4) {
            System.out.println(i);
        }
        System.out.println("********************");
        System.out.println("5'in kuvvetleri: ");
        for (int j = 1; j < x; j *= 5) {
            System.out.println(j );

        }

    }

}


