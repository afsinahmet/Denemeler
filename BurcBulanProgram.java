
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean isError = false;

        String ay, burc = "";
        int gun;
        System.out.print("Doğduğunuz ayı giriniz : ");
        ay = inp.nextLine();
        System.out.print("Doğduğunuz günü giriniz : ");
        gun = inp.nextInt();
        System.out.println("Doğum tarihiniz :" + gun + " " + ay);
        if (gun < 1 || gun > 31) {
            isError = true;
        } else {
            if (ay.equals("ocak")) {
                if (gun < 22) {
                    burc = "oğlak";
                } else {
                    burc = "kova";
                }
            } else if (ay.equals("şubat")) {
                if (gun < 20) {
                    burc = "kova";
                } else {
                    burc = "balık";
                }
            } else if (ay.equals("mart")) {
                if (gun < 21) {
                    burc = "balık";
                } else {
                    burc = "koç";
                }
            } else if (ay.equals("nisan")) {
                if (gun < 21) {
                    burc = "koç";
                } else {
                    burc = "boğa";
                }
            } else if (ay.equals("mayıs")) {
                if (gun < 22) {
                    burc = "boğa";
                } else {
                    burc = "ikizler";
                }
            } else if (ay.equals("haziran")) {
                if (gun < 23) {
                    burc = "ikizler";
                } else {
                    burc = "yengeç";
                }
            } else if (ay.equals("temmuz")) {
                if (gun < 23) {
                    burc = "yengeç";
                } else {
                    burc = "aslan";
                }
            } else if (ay.equals("ağustos")) {
                if (gun < 23) {
                    burc = "aslan";
                } else {
                    burc = "başak";
                }
            } else if (ay.equals("eylül")) {
                if (gun < 23) {
                    burc = "başak";
                } else {
                    burc = "terazi";
                }
            } else if (ay.equals("ekim")) {
                if (gun < 23) {
                    burc = "terazi";
                } else {
                    burc = "akrep";
                }
            } else if (ay.equals("kasım")) {
                if (gun < 22) {
                    burc = "akrep";
                } else {
                    burc = "yay";
                }
            } else if (ay.equals("aralık")) {
                if (gun < 22) {
                    burc = "yay";
                } else {
                    burc = "oğlak";
                }
            } else {
                isError = true;
            }
        }
        if (isError == true) {
            System.out.print("Hatalı giriş yaptınız");
        } else {
            System.out.print("Burcunuz:" + burc);
        }


    }
}
