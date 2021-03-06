package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuringaDelimitadores {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> myDoubles = Arrays.asList(3.14, 5.84);
		List<Object> myObjs = new ArrayList<>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
	}
	
	//Lista de origem "source" eh de qualquer tipo numerico, por isso ela extends Number "COVARIANCIA"->
	//Subtipos, entao pode acessar os elementos
	//Lista de destino pode ser mais generica que Number "CONTRAVARIANCIA" -> supertipos, pode Add
	//Eh uma lista de qualquer tipo que pode ser um supertipo de Number
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {//Recebe uma lista de qualquer tipo
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
