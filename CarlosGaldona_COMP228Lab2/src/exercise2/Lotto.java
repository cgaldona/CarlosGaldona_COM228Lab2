package exercise2;

import java.security.SecureRandom;

public class Lotto {
    private int[] numbers = new int[3];
    private SecureRandom randomGenerator = new SecureRandom();

    public Lotto() {
        this.populateNumbers();
    }

    private void populateNumbers() {
        for(int i = 0; i < this.numbers.length; ++i) {
            this.numbers[i] = this.randomGenerator.nextInt(9) + 1;
        }

    }

    public int[] getNumbers() {
        return this.numbers;
    }

    public int getSum() {
        int sum = 0;
        int[] var5;
        int var4 = (var5 = this.numbers).length;

        for(int var3 = 0; var3 < var4; ++var3) {
            int number = var5[var3];
            sum += number;
        }

        return sum;
    }
}
