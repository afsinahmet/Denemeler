import java.util.Scanner;

public class recursiveÜsAlma {
    static double expo(int base, int exp) {
        double result = 1;
        if (exp == 0) {
            return 1;
        } else if (exp>0) {
            result = expo(base, exp - 1) * base;
        }else {
            result=(1.0/base)* expo(base,exp+1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, exp;
        System.out.print("Taban değerini giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exp = scan.nextInt();
        System.out.print("Sonuç: " + expo(base, exp));

    }
}
