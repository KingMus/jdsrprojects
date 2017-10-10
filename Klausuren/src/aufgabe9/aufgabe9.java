package aufgabe9;

import javax.swing.JOptionPane;

public class aufgabe9 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("n bitte"));

		forSchleife(n);
		whileSchleife(n);
		doWhileSchleife(n);

	}

	public static void forSchleife(int n) {

		for (int i = 3; i < 2 * n; i++) {

			System.out.println(3.14 / (2 * i - 1));

		}

	}

	public static void whileSchleife(int n) {

		int i = 3;

		while (i < 2 * n) {
			System.out.println(3.14 / (2 * i - 1));
			i++;
		}

	}

	public static void doWhileSchleife(int n) {

		int i = 3;

		do {
			System.out.println(3.14 / (2 * i - 1));
			i++;
		} while ((i < 2 * n));

	}

}
