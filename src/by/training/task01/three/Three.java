package by.training.task01.three;

import static java.lang.Math.sqrt;

public class Three {

    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double s;
        double p;

        s = (a * b) / 2;
        System.out.println(s);

        double c = sqrt( (a * a) + (b * b) ); // гипотенуза

        p = a + b + c;
        System.out.println(p);
    }
}
