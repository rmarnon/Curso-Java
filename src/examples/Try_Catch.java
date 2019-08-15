package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
		}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid position!");
				e.printStackTrace();
				sc.next();
			}
			catch (InputMismatchException e) {
				System.out.println("Input error!");
			}
			finally {
				System.out.println("Finally printed sucess!");
			}
			
		System.out.println("Fim da execucao!");
		
		sc.close();
	}

}
