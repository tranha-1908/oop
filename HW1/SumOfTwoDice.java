public class SumOfTwoDice {
    public static void main(String[] args) {
        int SIDES = 6;
        int a = 1 + (int)(Math.random() * SIDES);
        int b = 1 + (int)(Math.random() * SIDES);
        int sum = a + b;
        System.out.printf("The sum of %d and %d is: %d ", a, b, sum);
    }
}
