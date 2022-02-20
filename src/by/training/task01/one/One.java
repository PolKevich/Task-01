package by.training.task01.one;

public class One {

    public static void main(String[] args) {
        int q = 1213;
        int one;
        int two;
        int three;
        int four;

        one = q / 1000;
        System.out.println(one);

        two = q / 100 % 10;
        System.out.println(two);

        three = q / 10 % 10;
        System.out.println(three);

        four = q % 10;
        System.out.println(four);

        if (one + two == three + four) {
            System.out.println(one + two == three + four);
        } else System.out.println(false);

    }
}
