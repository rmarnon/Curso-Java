package examples;

import java.util.Locale;
import java.util.Scanner;

import model.services.PrintService;

public class GenericsV1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> printService = new PrintService<>();//<> Indica instancia do tipo generics

		System.out.print("How many values: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			printService.addValue(value);
		}
		
		printService.print();//Imprime formatado [ , , ]
		System.out.println("First: " + printService.first());
		
		sc.close();
	}

}
