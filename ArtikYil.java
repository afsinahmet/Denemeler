import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        boolean leap=false;

        System.out.print("Yıl Giriniz: ");
        year=input.nextInt();

        if (year%4==0 && year%100==0){
            if ((year%400==0)){
                leap=true;
            }

        }else if (year%4==0){
            leap=true;
        }

        if ((leap==true)){
            System.out.print(year+" bir artık yıldır!");
        }else {
            System.out.print(year+" bir artık yıl değildir!");
        }

    }


}
