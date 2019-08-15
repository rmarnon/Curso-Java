package examples;

import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);

		int n = sc.nextInt(); //Quantidade de pessoas
		double[] vector = new double[n]; //Respectivas alturas
		
		double sum = 0.0;
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextDouble();
			sum += vector[i];
		}
				
		double avg = sum / n;
		
		System.out.println("Average Height: " + String.format("%.2f", avg));
		
		sc.close();
	}

}
