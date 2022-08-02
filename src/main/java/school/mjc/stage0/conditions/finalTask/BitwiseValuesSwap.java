package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void main(String[] args) {
        swap(1, 2);

    }
    public static void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(first);
        System.out.println(second);

    }
}
