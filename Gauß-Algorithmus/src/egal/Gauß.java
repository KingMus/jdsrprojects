package egal;

public class Gauﬂ
{
	public static void main(String[] args)
	{

		double[][] matrix =
		{
				{ 2, -1, 1 },
				{ 0, -1, 3 },
				{ 0, 0, 1 } };
		double[] b =
		{ -8, -10, -3 };
		schreibeMatrix(matrix);
		schreibeVektor(b);
		schreibeVektor(loeseausdreiecksgestalt(matrix, b));
	}

	public static void schreibeMatrix(double[][] matrix)
	{

		int i, j;
		System.out.println("Die Matrix:");

		for (i = 0; i < matrix.length; i++)
		{
			System.out.print("|");
			for (j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j] + "|");
			}
			System.out.println(" ");
		}
	}

	public static void schreibeVektor(double[] vektor)
	{
		int i;
		System.out.println(" ");
		for (i = 0; i < vektor.length; i++)
		{
			System.out.print(vektor[i] + " ");
		}
	}

	public static double[] loeseausdreiecksgestalt(double[][] matrix, double[] b)
	{
		double i, j, n;
		double[] hilf =
		{ 0, 0, 0 };

		n = (b[2]) / matrix[2][2];
		j = (b[1] - n * matrix[1][2]) / (matrix[1][1]);
		i = (b[0] - n * matrix[0][2] - j * (matrix[0][1])) / matrix[0][0];

		hilf[0] = i;
		hilf[1] = j;
		hilf[2] = n;

		return hilf;
	}
}
