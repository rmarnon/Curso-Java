package exercises;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the Dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("VaHow many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Amount to be paid = R$%.2f%n", result);
		
		sc.close();
	}

}
