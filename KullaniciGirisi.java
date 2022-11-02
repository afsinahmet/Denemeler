import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPassword;
        String select;
        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        System.out.println(userName + " - " + password);

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız");

        } else {
            System.out.println("Hatalı bilgi girdiniz");
            System.out.print("Şifrenizi sıfırlamak ister misiniz?\nEvet\nHayır\n");
            select = input.nextLine();
            if (select.equals("Evet")) {
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.print("Yeni şifreniz eskisiyle aynı olamaz");
                } else if (!newPassword.equals("java123")) {
                    System.out.print("Şifreniz başarıyla oluşturuldu, yeni şifreniz: " + newPassword);
                }
            } else if (!select.equals("Evet")) {
                System.out.print("İyi günler");
            }


        }


    }
}
