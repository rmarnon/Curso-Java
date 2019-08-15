package switch_case;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um data: ");
		int n = sc.nextInt();
		String day;
		
		switch (n) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "saturday";
			break;
		default:
			day = "Invalid date!";
		}
		System.out.println("Day = " + day);
		
		sc.close();
	}

}
