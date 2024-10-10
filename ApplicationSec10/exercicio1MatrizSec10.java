package ApplicationSec10;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1MatrizSec10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/* System.out.println("Leia o valor de N : "); */
		int n = sc.nextInt();
		/* System.out.println("Leia o valor de M : "); */
		int m = sc.nextInt();
		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Leia o nro.a ser localizado : ");
		int x = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == x) {
					if (isValidCell(mat, i, j)) {
						System.out.println("Posição do elemento selecionado : " + i + "," + j);
					}
					if (isValidCell(mat, i, j - 1)) {
						System.out.println("Elemento à esquerda do selecionado : " + mat[i][j - 1]);
					}
					if (isValidCell(mat, i, j + 1)) {
						System.out.println("Elemento à direita do selecionado : " + mat[i][j + 1]);
					}
					if (isValidCell(mat, i + 1, j)) {
						System.out.println("Elemento abaixo do selecionado : " + mat[i + 1][j]);
					}
				}
				sc.close();
			}
		}
	}

	public static boolean isValidCell(int[][] matrix, int row, int col) {
		return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
	}
}
