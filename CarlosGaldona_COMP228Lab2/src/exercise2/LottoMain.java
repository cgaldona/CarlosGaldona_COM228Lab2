package exercise2;

import java.awt.Component;
import javax.swing.JOptionPane;

public class LottoMain {
    public LottoMain() {
    }

    public static void main(String[] args) {
        boolean userWon = false;
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27:"));

        for(int i = 0; i < 5; ++i) {
            Lotto lotto = new Lotto();
            int[] numbers = lotto.getNumbers();
            int sum = lotto.getSum();
            JOptionPane.showMessageDialog((Component)null, "Lotto numbers: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
            JOptionPane.showMessageDialog((Component)null, "Sum of lotto numbers: " + sum);
            if (sum == userNumber) {
                JOptionPane.showMessageDialog((Component)null, "Congratulations! You win!");
                userWon = true;
                break;
            }
        }

        if (!userWon) {
            JOptionPane.showMessageDialog((Component)null, "Sorry, you did not win. The computer wins.");
        }
    }
}