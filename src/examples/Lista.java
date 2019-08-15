package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		
		lista.add("29");
		lista.add("04");
		lista.add("82");
		lista.add("Marnon");
		lista.add(3, "Rodrigo "); //Insere "Rodrigo "na posicao 3 da lista
		lista.add("Marco");
		lista.add("Carla");
		lista.add("Aline");
		lista.add("Marli");
		lista.add("Alex");
		
		System.out.println("Quantidade do vetor: "+ lista.size()); //Imprime o tamanho da lista.
						
		for(String x : lista) { //Pra cada objeto "x" contido na "lista", faca:
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");;
		
		lista.remove(3); //Remove na posicao 3
		lista.remove("Marnon"); //Remove por comparacao
		lista.removeIf(x -> x.charAt(0) == 'M');//Remove por predicado (lambda, retorna true or false)
		//Pega uma string "x" e retorna se essa string "x" na posicao 0 == 'M', depois aplica removeIf
		
		for (String x: lista) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Index of Carla: " + lista.indexOf("Carla"));
		System.out.println("Index of Thiago: " + lista.indexOf("Thiago"));
		//Como nao tem na lista, ele retorna a posicao -1

		System.out.println("----------------------------------");
		
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//Converte a lista para uma Stream (aceita operacoes com expressao lambda), depois chama o filter
		//que recebe um predicado, depois chama o collect que converte o stream pra lista novamente
		//Essa expressao retorna apenas elementos que comecam com 'A', ignorando os demais elementos 
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");
		
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//Traz apenas o primeiro elemento que comeca com a letra 'A' e ignora o restante, mesmo se existir
		//findFirst retorna o primeir elemento da string, mas retorna o optional string
		//depois chama orElse, passando nulo, se ele nao existe imprime null
				
		String name2 = lista.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse("Falhou");
		//Como nao tem ninguem que comeca com 'R', opcionalmente ao null foi colocado a mensagem "Falhou"
		//se a lista for do tipo String, caso contratio nao funciona.
		
		System.out.println("Nome 1: " + name + " " + "Nome 2: " + name2);
	}

}
