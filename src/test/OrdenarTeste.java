package test;

public class OrdenarTeste {

	public static void main(String[] args) {
		
		int[] lista = {51, 12, 84, 42, 25, 66, 0, 13, 9, 19, -1, 15, 3};
		
		int aux = 0;
		System.out.print("[");
		for(int i = 0; i < lista.length; i++) {
			for(int j = i + 1; j <= lista.length - 1; j++) {
				if(lista[j] < lista[i]) {
					aux = lista[j];
					lista[j] = lista[i];
					lista[i] = aux;
				}				
			}			
			System.out.print(lista[i] + " | ");	
		}
		System.out.print("]");
	}
}
