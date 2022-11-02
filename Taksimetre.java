
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){


        Scanner inp=new Scanner(System.in);
        int acılısTutar=10, minTutar=20;
        double kmUcret=2.20,toplam;
        System.out.print("Kaç Km gittiğini giriniz : ");
        int kacKm= inp.nextInt();

        toplam=acılısTutar+kacKm*kmUcret;
        toplam=(toplam<20)?20 : toplam;

        System.out.print("Toplam ödenecek ücret : " + toplam);


    }
}