package by.training.task01.seven;

public class Seven {

    public static void main(String[] args) {
        double a = 5;
        double b = 9;
        double h = 1;

        double f;
        double x;

        x = a;

            System.out.println("-------------------------------------------");
            System.out.println("Результат вычисления значений функции  F(x)");
            System.out.println("-------------------------------------------");
            System.out.println("аргумент" + "|" + "функция");

            while (x <= b) {
                f = Math.pow((Math.sin(x)), 2) - Math.cos(2 * x);
                System.out.println("x=" + x + " " + " " + " " + "|" + " " + " " + " " + "F(x)=" + f);
                x = x + h;
            }
            System.out.println("-------------------------------------------");
        }
    }

