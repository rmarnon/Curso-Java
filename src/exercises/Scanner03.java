package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String nome = sc.nextLine();
		System.out.println("How many bedrooms are there in your house? ");
		int badroom = sc.nextInt();
		System.out.println("Enter product price: ");
		double product = sc.nextDouble();
		System.out.println("Enter your last name, age and height (Same line)");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(badroom);
		System.out.println(product);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}

}
