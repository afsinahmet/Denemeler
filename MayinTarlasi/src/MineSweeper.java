import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mineNumber;
    String[][] area;
    String[][] mineArea;

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.area = new String[this.row][this.col];
        this.mineArea = new String[this.row][this.col];
        this.mineNumber = (this.row * this.col) / 4;

    }

    void prepareGame() {


        for (int i = 0; i < this.mineNumber; i++) {
            Random r = new Random();
            int a = r.nextInt(this.row);
            int b = r.nextInt(this.col);

            if (this.mineArea[a][b] == null) {
                this.mineArea[a][b] = "*";
            } else {
                i--;
            }

        }

        for (int i = 0; i < this.mineArea.length; i++) {
            for (int j = 0; j < this.mineArea[i].length; j++) {
                if (this.mineArea[i][j] ==null ){
                    this.mineArea[i][j] = "-";

                }

            }
        }

        printArray(this.mineArea);

        for (int i = 0; i < this.area.length; i++) {
            for (int j = 0; j < this.area[i].length; j++) {
                this.area[i][j] = "-";
            }
        }


    }

    void run() {
        prepareGame();

        Scanner input = new Scanner(System.in);
        int totalMove = (this.row * this.col) - this.mineNumber;
        System.out.println("Mayın tarlası oyununa hoşgeldiniz");

        while (totalMove > 0) {
            System.out.println("===================");
            printArray(area);
            System.out.print("Satır giriniz: ");
            int r = input.nextInt();
            System.out.print("Sütun giriniz: ");
            int c = input.nextInt();

            if ((r < 0 || r >= this.row) || (c < 0 || c >= this.col)) {
                System.out.println("Hatalı giriş yaptınız,tekrar giriniz. ");
                continue;
            }
            if (mineArea[r][c].equals("*")) {
                System.out.println("Oyunu kaybettiniz!!");
                printArray(mineArea);
                break;
            } else {

                int count = 0;
                int lowR = (r - 1), heighR = (r + 1);
                int lowC = (c - 1), heighC = (c + 1);

                if (lowR < 0) {
                    lowR = 0;
                }
                if (lowC < 0) {
                    lowC = 0;
                }
                if (heighR >= this.row) {
                    heighR = row - 1;
                }
                if (heighC >= this.col) {
                    heighC = col - 1;

                }

                for (int i = lowR; i <= heighR; i++) {
                    for (int j = lowC; j <= heighC; j++) {
                        if (this.mineArea[i][j].equals("*")) {
                            count++;
                        }
                    }
                }
                String counter = Integer.toString(count);
                this.area[r][c] = counter;
                totalMove--;


            }
            if (totalMove == 0) {
                System.out.println("Oyunu kazandınız!!");
                printArray(area);
            }
        }
    }


    void printArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
