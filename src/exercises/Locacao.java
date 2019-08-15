package exercises;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Locacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] hospede = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
				
		for (int i = 1; i <= rooms; i++) {
			System.out.println();
			System.out.printf("Rent #%d: %n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			hospede[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < hospede.length; i++) {
			if (hospede[i] != null) {
				System.out.println(i + ": " + hospede[i]);
			}
		}
		
		sc.close();
	}

}
