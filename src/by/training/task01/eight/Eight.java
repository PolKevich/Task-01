package by.training.task01.eight;

import java.util.Random;

public class Eight {

    public static void main(String[] args) {

        int k = (int) (1 + Math.random() * 10);
        System.out.println("k = " + k);

        int n = 5;
        int sum = 0;

        int[] arg = new int[n];
        Random rand = new Random();

        for (int i = 0; i < arg.length; i++) {
            arg[i] = rand.nextInt(100);
        }

        for (int i = 0; i < arg.length; i++) {
            System.out.print("arg[" + i + "]=" + arg[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < arg.length; i++) {

            if (arg[i] % k == 0) {

                sum += arg[i];

                System.out.print(arg[i] + " ");
            }

        }

        System.out.println();

        System.out.println("Сумма чисел кратных числу к = " + sum);

    }
}
