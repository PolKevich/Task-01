package by.training.task01.nine;

import java.util.Random;

public class Nine {

    public static void main(String[] args) {

        int elem1 = (int) (Math.random() * 10 + 5);
        System.out.println("Количество элементов первого массива равно: " + elem1);

        int elem2 = (int) (Math.random() * 10 + 5);
        System.out.println("Количество элементов второго массива равно: " + elem2);
        System.out.println();

        int elem3 = elem1 + elem2;

        int[] mas1 = new int[elem1];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 100 + 1);
            System.out.print("mas1[" + i + "] = " + mas1[i] + "; ");
        }
        System.out.println();

        int[] mas2 = new int[elem2];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 100 + 1);
            System.out.print("mas2[" + i + "] = " + mas2[i] + "; ");
        }
        System.out.println();

        Random random = new Random();
        int k = random.nextInt(4);
        System.out.println("Число к равно: " + k);

        int[] mas3 = new int[elem3]; // Объединение mas1 и mas2;
        int q = 0;
        for (int i = 0; i < mas3.length; i++) {
            if (i > k && i <= k + 1) {
                for (int j = 0; j < mas2.length; j++) {
                    mas3[i] = mas2[j];
                    i++;
                }
            }
            mas3[i] = mas1[q];
            q++;
        }

        System.out.println();
        System.out.println("Объединенный массив, в котором второй массив между " + k + " и " + (k + 1) + " - м элементами первого массмва.");
        for (int i = 0; i < mas3.length; i++) {
            System.out.print("mas3[" + i + "] = " + mas3[i] + "; ");
        }

    }
}
