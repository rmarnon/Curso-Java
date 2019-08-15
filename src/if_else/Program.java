package if_else;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();
		
		if((n % 2) == 0) {
			System.out.println("Even!"); //Par
		}else {
			System.out.println("Odd!"); // Impar
		}
		
		//--------------------------------------------------------------------------------------//
		
		System.out.println("What time is it?");
		
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good Morning!");
		}
		else if (time < 18) {
			System.out.println("Good Afternoon!");
		}
		else {
			System.out.println("Good Evening!");
		}
		
		//--------------------------------------------------------------------------------------//
		
		System.out.println("Insert three numbers: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a >= b) && (a >= c)) {
			System.out.println("Heigher = " + a);
		}
		else if((b >= a) && (b >= c)) {
			System.out.println("Heigher = " + b);
		}
		else {
			System.out.println("Heigher = " + c);
		}
		
		sc.close();
	}

}
