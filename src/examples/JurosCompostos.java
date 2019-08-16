package examples;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;
import model.services.UsaInterestService;

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
		
		InterestService bis = new BrazilInterestService(interestRate * 2);
		InterestService uis = new UsaInterestService(interestRate);
		double brazilPayment = bis.payment(amount, months);
		double usaPayment = uis.payment(amount, months);
		
		System.out.println("Payment after " + months + " months: ");
		System.out.println("Brazil -> " + String.format("%.2f", brazilPayment));
		System.out.println("Usa -> " + String.format("%.2f", usaPayment));
		
		sc.close();
	}

}
