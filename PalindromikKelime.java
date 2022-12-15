import java.util.Scanner;

public class PalindromikKelime {
    static boolean isPalindrome(String str) {
        String reverse = "";
        int index = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindrome2(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sorgulanacak kelimeyi giriniz: ");
        String str = input.nextLine();
        System.out.println(isPalindrome(str));

    }
}
