package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void main(String[] args) {
        printDays(2022, 13);
        printDays(1900, 2);
        printDays(2020, 2);
        printDays(2022, 7);
    }
    public static void printDays(int year, int month) {
        boolean isLeap = false;
        switch (year % 400) {
            case 0:
                isLeap = true;
                break;
            default:
                switch ((year % 100)) {
                    case 0:
                        isLeap = false;
                        break;
                    default:
                        switch (year % 4) {
                            case 0:
                                isLeap = true;
                                break;
                            default:
                                isLeap = false;
                                break;
                        }
                        break;
                }
                break;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if (isLeap == false) {
                    System.out.println(28);
                }
                else {
                    System.out.println(29);
                }

                break;
            default:
                System.out.println("invalid date");
                break;
        }

    }
}
