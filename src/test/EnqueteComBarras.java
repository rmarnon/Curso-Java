package test;

public class EnqueteComBarras {

	public static void main(String[] args) {
		
		int[] notasDadas = {3, 5, 5, 8, 4, 3, 4, 0, 1, 3, 2, 1, 3, 5, 4, 4, 4, 3, 4, 1, 4, 2, 4, 1, 5};//Notas de 0 a 5
		int[] contador = new int[6];
		
		for(int resposta = 0; resposta < notasDadas.length; resposta++) {
			
			try {
				contador[notasDadas[resposta]]++;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf("   Resposta[%d] = %d%n%n", resposta, notasDadas[resposta]);
			}
		}
		 System.out.printf("%s%12s%n", "Nota", "Frequencia");
		 
		 for (int nota = 0; nota < contador.length; nota++) {
			 System.out.printf("%4d%12d ", nota, contador[nota]);	
			 
			 for (int stars = 0; stars < contador[nota]; stars++) {
				 System.out.print("*"); 
			 }
			 System.out.println();
		 }
	}
}
