package examples;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;

public class JurosCompostos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Amount: ");
		double amount  =sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		System.out.println("Interest rate: ");//Taxa de juros mensal
		double interestRate = sc.nextDouble();
		
		BrazilInterestService bis = new BrazilInterestService(interestRate);
		double payment = bis.payment(amount, months);
		
		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
