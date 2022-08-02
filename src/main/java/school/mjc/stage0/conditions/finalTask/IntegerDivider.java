package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void main(String[] args) {
        printCompletelyDivided(25, 0);
    }
    public static void printCompletelyDivided(int dividend, int divider) {
        int result;

        if (divider != 0) {
            result = dividend / divider;
            if (divider * result == dividend) {
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
