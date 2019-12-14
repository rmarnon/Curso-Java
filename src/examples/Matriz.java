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
		int soma = 0;
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {//Preenche: L0C0, L0C1, L0C2, Pula L1C0,L1C1, L1C2...
				mat [l][c] = sc.nextInt();
				soma += mat[l][c];
				if (mat[l][c] < 0) {//Se elementos forem negativos serao contados no "count".
					count++;
				}
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");//Diagonal = L0C0, L1C1, L2C2...
		}
		
		System.out.println();
		System.out.printf("soma total de valore: %2d%n", soma);
		System.out.println("Total de numeros negativos: " + count);
		
		System.out.println("Alterando quantidade de colunas: (L0-5, L1-3, L2-6)");
		
		//Add linhsa e colunas pre definidas
		mat[0] = new int[5];
		mat[1] = new int[3];
		mat[2] = new int[6];
		
		System.out.println("Atribui valor 8 as colunas da linha 02:");
		
		//Atribui as colunas da linha 02 o valor 8 em comum a todas
		for (int column = 0; column < mat[2].length; column++)     
			mat[2][column] = 8; 
		
		for(int l = 0; l < mat.length; l++) {
			for(int c = 0; c < mat[l].length; c++) {
				System.out.printf("%d  ", mat[l][c]); 
			}
			System.out.println();
		}
		
		sc.close();
	}

}
