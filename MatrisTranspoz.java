public interface MatrisTranspoz {

    static void print(int[][] matris) {
        for (int[] arr : matris) {
            for (int i : arr) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] matris = {{2, 3, 4}, {5, 6, 4}};
        int[][] transpoz = new int[matris[0].length][matris.length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        System.out.println("Matris: ");
        print(matris);
        System.out.println("Transpoz: ");
        print(transpoz);
    }
}
