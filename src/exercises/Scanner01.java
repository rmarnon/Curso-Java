package exercises;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String x, y, z;
		
		String frase = sc.nextLine();		
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(frase);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(x + " " +  y + " " + z); //Mesma linha com concatenacao.
		
		sc.close();
	}

}
