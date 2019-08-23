package examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();//Se ordem nao importa, HashSet eh + indicado p ser + rapido
			
		set.add("2 - PS4");
		set.add("3 - Xbox");
		set.add("1 - Notebook");
		
		Set<String> tree = new TreeSet<>();//Se ordem importa, mesmo que lento, o TreeSet eh + indicado
		
		tree.add("2 - PS4");
		tree.add("3 - Xbox");
		tree.add("1 - Notebook");
		
		Set<String> linked = new LinkedHashSet<>();//Mantem a ordem em que os 	elementos foram inseridos

		linked.add("2 - PS4");
		linked.add("3 - Xbox");
		linked.add("1 - Notebook");
		
		//linked.remove("3 - Xbox");
		//linked.removeIf(x -> x.charAt(0) == '2');
		//linked.removeIf(x -> x.length() >= 8);
		
		System.out.println(set.contains("3 - Xbox"));
		System.out.println(set.contains("0 - Switch"));
		
		System.out.println();
		System.out.println("Hash rapido, mas nao garante a ordenacao: ");
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Tree lento, mas ordena: ");
		for (String s : tree) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Velocidade intermediaria, ordena p ordem de insercao: ");
		for (String s : linked) {
			System.out.println(s);
		}		
	}

}
