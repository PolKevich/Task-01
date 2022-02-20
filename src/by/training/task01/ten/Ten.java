package by.training.task01.ten;

public class Ten {

    public static void main(String[] args) {

        int n = 6;

        int[][] mas = new int[n][n];

        for (int i = 0; i < mas.length; i++) {
            int q = 1;
            int w = n;

            if (i % 2 == 0) {

                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = q;
                    q++;
                }
            } else {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = w;
                    w--;
                }

            }

        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
