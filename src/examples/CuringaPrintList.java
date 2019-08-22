package examples;

import java.util.Arrays;
import java.util.List;

public class CuringaPrintList {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5,10,15);	
		List<String> myStrs = Arrays.asList("Rodrigo", "Carla", "Hulk");
		
		printList(myInts);
		printList(myStrs);
		
	}
	
	//List<?> Lista tipo curinga, * Qualquer outro tipo daria erro!!!
	public static void printList(List<?> list) {//Metodo que recebe uma lista de qualquer tipo e imprime
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
