
import java.util.Scanner;
public class ManavKasaProgramı {

    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        double armut=2.14, elma=3.67,  domates=1.11, muz=0.95, patlıcan=5,toplam;
        int a,e,d,m,p;
        System.out.print("Armut kaç kilo: ");
        a= input.nextInt();;
        System.out.print("Elma kaç kilo: ");
        e=input.nextInt();
        System.out.print("Domates kaç kilo: ");
        d=input.nextInt();
        System.out.print("Muz kaç kilo: ");
        m=input.nextInt();
        System.out.print("Patlıcan kaç kilo: ");
        p=input.nextInt();

        toplam=(a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlıcan);

        System.out.print("Toplam Tutar: " + toplam);



    }
}
