package examples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetConjuntos {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 10));
		
		//Union
		Set<Integer> c = new TreeSet<>(a);//Construtor especial que passa outra colecao como argumento
		c.addAll(b);//Uniao de "c", (Que eh copia de a) com "b"
		System.out.println(c);
		
		//Intersection
		Set<Integer> d = new TreeSet<>(a);//d recebe copia de a
		d.retainAll(b);//Interseccao de "d" e "b" (Em comum)
		System.out.println(d);
		
		//Difference
		Set<Integer> e = new TreeSet<>(a);//e recebe copia de a
		e.removeAll(b);//Remove do conjunto "e", todo mundo que tem em "b" (e - b)
		System.out.println(e);

	}

}
