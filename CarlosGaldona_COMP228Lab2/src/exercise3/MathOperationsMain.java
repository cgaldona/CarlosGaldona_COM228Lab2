package exercise3;

public class MathOperationsMain {

    public static void main(String[] args) {

        int sum1 = MathOperations.sum(3, 4);
        int sum2 = MathOperations.sum(1, 2, 3);
        double sum3 = MathOperations.sum(2.5, 3.5);

        System.out.println("Sum of 3 and 4: " + sum1);
        System.out.println("Sum of 1, 2, and 3: " + sum2);
        System.out.println("Sum of 2.5 and 3.5: " + sum3);

    }

}
