package by.training.task01.five;

public class Five {

    public static void main(String[] args) {
        double a = -2;
        double b = 3;
        double c = 6;

        if (a > 0) {
            System.out.println("a=" + Math.pow(a, 2));
        } else {
            System.out.println("a=" + -Math.pow(a, 4));
        }
        if (b > 0) {
            System.out.println("b=" + Math.pow(b, 2));
        } else {
            System.out.println("b=" + -Math.pow(b, 4));
        }
        if (c > 0) {
            System.out.println("c=" + Math.pow(c, 2));
        } else {
            System.out.println("c=" + -Math.pow(c, 4));
        }
    }
}
