package comando_for;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many integer numbers do you want to sum? ");
		int quantidade = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Value #" + i + ": ");
			int valor = sc.nextInt();
			sum += valor;
		}
		
		System.out.println("The sum is: " + sum);

		sc.close();

	}

}
