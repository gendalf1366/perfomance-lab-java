package task2;

public class Task2 {
    static boolean isInside(int circle_x, int circle_y, int rad, int x, int y) {

        if ((x - circle_x) * (x - circle_x) + (y - circle_y) * (y - circle_y) <= rad * rad)
            return true;
        else
            return false;
    }

    public static void main(String arg[]) {

        int x = 1, y = 1;
        int circle_x = 0, circle_y = 1, rad = 2;

        if (isInside(circle_x, circle_y, rad, x, y))
            System.out.print(1);
        else
            System.out.print(2);

    }
}
