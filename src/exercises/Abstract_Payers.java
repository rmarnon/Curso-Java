package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Company;
import entities.TaxPayer;

public class Abstract_Payers {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or campany (i/c): ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("Taxes Paid:");
		for (TaxPayer payer : list) {
			sum += payer.tax();
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
		}
			
		System.out.println();
		System.out.println("Total taxes: " + String.format("%.2f", sum));
		
		sc.close();
	}

}
