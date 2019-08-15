package examples;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero de linhas: ");
		int linhas = sc.nextInt();
		System.out.print("Entre com o numero de colunas: ");
		int colunas =sc.nextInt();
		
		int[][] mat = new int[linhas][colunas];
		
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {//Preenche: L0C0, L0C1, L0C2, Pula L1C0,L1C1, L1C2...
				mat [i][j] = sc.nextInt();
				if (mat[i][j] < 0) {//Se elementos forem negativos serao contados no "count".
					count++;
				}
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");//Diagonal = L0C0, L1C1, L2C2...
		}
		
		System.out.println();
		System.out.println("Total de numeros negativos: " + count);
		
		sc.close();
	}

}
