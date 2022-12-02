public class Main {
    public static void main(String[] args) {
        double[] list = {9, 78, 45, 24, 56, 34, 1, 5};
        double harmonikSeri = 0.0;
        double harmonikOrt;

        for (int i = 0; i < list.length; i++) {
            if (list[i] <= 0) {
                System.out.print("Değerlerin tamamı sıfırdan büyük olmalı.");
                break;
            }
            harmonikSeri += (1 / list[i]);
        }
        harmonikOrt = (list.length) / (harmonikSeri);
        System.out.print("Harmonik Ortalama: "+ harmonikOrt);

    }

}