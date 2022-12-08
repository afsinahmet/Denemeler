import java.util.Arrays;

public class TekrarEdenCiftSayilar {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 4, 2, 9, 4, 21, 1, 33, 9, 1, 10, 10, 2};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int j = 0; j < list.length; j++) {
            for (int i = j + 1; i < list.length; i++) {
                if (list[j] % 2 == 0) {
                    if (list[j] == list[i]) {
                        if (!isFind(duplicate, list[i])) {
                            duplicate[startIndex] = list[i];
                            startIndex++;
                        }

                    }
                }
            }
        }

        for (int number : duplicate) {
            if (number != 0) {
                System.out.println(number);
            }
        }
    }
}
