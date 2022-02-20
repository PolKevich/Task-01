package by.training.task01.two;

import static java.lang.Math.sqrt;

public class Two {

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;
        double rez;

        rez = b / (2 * a) + sqrt(Two.pow(b, 2) + (4 * a * c)) / (2 * a) - Two.pow(a, 3) * c + 1 / Two.pow(b, 2);
        System.out.println(rez);

    }

    public static double pow(double value, double powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
