
import java.util.Scanner;
public class VücutKitleEndeksi {

    public static void main(String[] args){
         //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        // Formül
        //Kilo (kg) / Boy(m) * Boy(m)

Scanner inp= new Scanner(System.in);

double boy,kilo,endeks;

System.out.print("Boyunuzu (metre cinsinde )giriniz :  ");
boy=inp.nextDouble();
System.out.print("Kilonuzu giriniz : ");
kilo=inp.nextDouble();

endeks=kilo/(boy*boy);

System.out.print("Vücut Kitle Endeksiniz : " + endeks);

    }
}
