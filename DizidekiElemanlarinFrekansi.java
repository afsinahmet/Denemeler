
public class DizidekiElemanlarinFrekansi {
    static boolean isCheck(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] temp = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            int count = 1;

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
                if (j == list.length - 1 && isCheck(temp, list[i])) {
                    System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                    temp[startIndex++] = list[i];
                }


            }
        }
    }
}
