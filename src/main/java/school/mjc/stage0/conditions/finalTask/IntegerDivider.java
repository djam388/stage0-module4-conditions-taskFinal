package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void main(String[] args) {
        printCompletelyDivided(5, 0);
    }
    public static void printCompletelyDivided(int dividend, int divider) {
        double result;
        result = (double) dividend / (double) divider;
        if (divider != 0) {
            if ((double) divider * result == (double) dividend) {
                System.out.println("can be divided completely");
            }
            else {
                System.out.println("cannot be divided completely");
            }
        }
        else {
            System.out.println("division by zero");
        }

    }
}
