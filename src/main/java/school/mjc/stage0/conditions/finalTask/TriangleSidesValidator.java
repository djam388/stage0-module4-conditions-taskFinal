package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void main(String[] args) {
        validate(6, 9, 10);

    }
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide) {
            if (secondSide + thirdSide > firstSide) {
                if (thirdSide + firstSide > secondSide) {
                    System.out.println("this is a valid triangle");
                }
                else {
                    System.out.println("it's not a triangle");
                }
            }
            else {
                System.out.println("it's not a triangle");
            }
        }
        else {
            System.out.println("it's not a triangle");
        }
    }
}
