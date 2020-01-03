package examples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) {
		
		String[] cor1 = {"Azul", "Branco", "Amarelo", "Dourado", "Laranja", "Vermelho"};
		String[] cor2 = {"Preto", "Verde", "Prata", "Rosa", "Violeta", "Marrom", "Fantasia"};
		
		List<String> lista1 = new LinkedList<>();
		List<String> lista2 = new LinkedList<>();
		
		for(String cor : cor1)
			lista1.add(cor);
		
		for(String cor : cor2)
			lista2.add(cor);
		
		lista1.addAll(lista2);
		lista2 = null;
		
		print("Original: ",  lista1);
		imprimeInvertido(lista1);
		converteListaPMaiusculo(lista1);
		print("Maiusculas: ", lista1);
		converteListaPMinusculo(lista1);
		print("Minusculas: ", lista1);		
		removeItens(lista1, 0, 4);
		print("", lista1);
		
	}
	
	public static void print(String texto,List<String> list) {
		System.out.println(texto);
		System.out.print("[ ");
		for(String string : list) {
			System.out.printf("%s ", string);
		}
		System.out.println("]\n");
	}
	
	public static void converteListaPMaiusculo(List<String> list) {
		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String cor = iterator.next();
			iterator.set(cor.toUpperCase());
		}	
	}
	
	public static void converteListaPMinusculo(List<String> list) {		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			String cor = iterator.next();
			iterator.set(cor.toLowerCase());
		}
	}
	
	public static void imprimeInvertido(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.println("Lista reversa: ");
		System.out.print("[ ");
		while(iterator.hasPrevious()) {
			System.out.printf("%s ", iterator.previous());
		}
		System.out.print("]\n\n");
	}
	
	public static void removeItens(List<String> list, int inicio, int fim) {		
		System.out.printf("Deletando elementos de %d a %d...", inicio, fim - 1);
		list.subList(inicio, fim).clear();
	}
}
