
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        double a,b,c,sonuc;
        System.out.print("Birinci kenar uzunluğunu giriniz : ");
        a=inp.nextDouble();
        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        b=inp.nextDouble();

        c=(a*a + b*b );
        sonuc=Math.sqrt(c);

        System.out.print("Hipotenüs Uzunluğu : " + sonuc);




    }
}