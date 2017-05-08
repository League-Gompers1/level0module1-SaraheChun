package variables_and_conditionals;

import java.util.Random;
import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {

		Random ran = new Random();
		int random;
		random = ran.nextInt(100);
		System.out.println(random);

		for (int i = 0; i < 100; i++) {
			String ans = JOptionPane.showInputDialog("Guess 1-100");
			int guess = Integer.parseInt(ans);
			if (guess > random) {
				JOptionPane.showMessageDialog(null,"too high");
			} else if (guess < random) {
				JOptionPane.showMessageDialog(null,"too low");
			} else {
				JOptionPane.showMessageDialog(null,"you guessed right");
				i = 100;
			}

		}
	}
}