
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);

    double para,Kdvli,Kdv=0.18;
    System.out.print("Para tutarının giriniz: ");
    para= girdi.nextDouble();

    double KdvTutar= para*Kdv;
    Kdvli=para+KdvTutar;

   System.out.println("Kdv'siz tutar : " + para);
   System.out.println("Kdv'li tutar : " + Kdvli);
   System.out.println("Kdv tutarı : " + KdvTutar);



    }
}