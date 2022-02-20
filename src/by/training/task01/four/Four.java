package by.training.task01.four;

public class Four {

    public static void main(String[] args) {

//координаты закрашенной области
        int x1 = 2;
        int y1 = 3;
        int x2 = -2;
        int y2 = -3;

//точка с координатами
        int x3 = -1;
        int y3 = 2;

        if (x2 < x3 && x3 < x1 && y2 < y3 && y3 < y1) {
            System.out.println(x2 < x3 && x3 < x1 && y2 < y3 && y3 < y1);
        } else {
            System.out.println(false);
        }
    }

}
