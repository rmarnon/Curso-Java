package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTypes {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 7, 10);
		
		Stream<Integer> st1 = list.stream(); //Cria Stream a partir de uma lista
		System.out.println(Arrays.toString(st1.toArray()));
		//toArray converte uma Stream p/ um vetor
		
		Stream<Integer> st2  = list.stream().map(x -> x * 10);//map aplica uma funcao a cada elemento
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);//Funcao de iteracao inicia c/ 0, 2/2 -> infinito
		System.out.println(Arrays.toString(st3.limit(10).toArray()));//limite de quantidade de elementos
		
		Stream<String> st4 = Stream.of("Maria", "Bob", "Ana");//Stream.of permite inserir direto (...)
		System.out.println(Arrays.toString(st4.toArray()));
		
		Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st5.limit(20).toArray()));

	}

}
