package aufgabe4;

import javax.swing.JOptionPane;

public class aufgabe4 {

	public static void main(String[] args) {

		int y = 5;
		int x = 3;

		x = Integer.parseInt(JOptionPane.showInputDialog("Zeilenanzahl"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Spaltenanzahl"));

		double[][] value = new double[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				value[i][j] = (int) (Math.random() * 10) + 1;
				System.out.println(value[i][j]);
			}
		}

		zeilenSumme(value);

	}

	@SuppressWarnings("null")

	public static double[] zeilenSumme(double value[][]) {

		double[] ergebnis = new double[value.length];
		double summe = 0;

		for (int i = 0; i < ergebnis.length; i++) {

			for (int j = 0; j < ergebnis.length; j++) {
				summe = value[i][j] + summe;
			}
			ergebnis[i] = summe;
		}

		System.out.println("----------------");

		System.out.println(summe);
		return ergebnis;
	}

}
