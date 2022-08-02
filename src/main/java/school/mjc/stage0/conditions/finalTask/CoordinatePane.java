package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public static void main(String[] args) {
        printQuadrant(5, 1);

    }
    public static void printQuadrant(int x, int y) {
        if (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("first");
            }
            else if (x < 0 && y > 0) {
                System.out.println("second");
            }
            else if (x < 0 && y < 0) {
                System.out.println("third");
            }
            else {
                System.out.println("fourth");
            }
        }
        else {
            System.out.println("zero");
        }
    }
}
