
import java.util.Scanner;
public class AktiviteÖnerme {

    public static void main(String[] args){


        int temp;

        Scanner inp=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz : ");
        temp=inp.nextInt();

        if (temp<5){
            System.out.println("Kayak yapabilirsin ");
        }
        else if (temp<=25){

            if(temp<=15){
                System.out.println("Sinemaya gidebilirsin");
            }
            if (temp>=10){
                System.out.println("Pikniğe gidebilirsin.");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}
