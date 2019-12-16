package test;

import java.security.SecureRandom;

public class Dados {

	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		int uns = 0, dois = 0, tres = 0, quatros = 0, cincos = 0, seis = 0;
		
		 int[] frequency = new int[7];
		
		for(int i = 1; i <= 10000000; i++) {
			
			frequency[1 + random.nextInt(6)]++;
			
			//-----------------------------------OU---------------------------------------
		
			/*int dado = 1 + random.nextInt(6); //Limita o random a seis lados do dado.
			
			switch (dado) {
			case 1:
				uns++;
				break;
			case 2:
				dois++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				quatros++;
				break;
			case 5:
				cincos++;
				break;
			case 6:
				seis++;
				break;
			}*/
		}		
		
		 //System.out.println("Face\tFrequency"); 
		 //System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", uns,dois, tres, quatros, cincos, seis);
		for (int face = 1; face < frequency.length; face++)
			System.out.printf("%4d%10d%n", face, frequency[face]); 
	}
}
