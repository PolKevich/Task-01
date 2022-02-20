package by.training.task01.six;

public class Six {

    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int c = 9;

        int max = a;
        int min = b;

        int d = Math.max(b, c);
        max = Math.max(max, d);

        int e = Math.min(a, c);
        min = Math.min(min, e);

        int Sum = max + min;

        System.out.println(Sum);


    }
}
