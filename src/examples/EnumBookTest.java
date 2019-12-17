package examples;

import java.util.EnumSet;

public class EnumBookTest {

	public static void main(String[] args) {
		
		System.out.println("Todos os livros:");
		
		for(EnumBook book : EnumBook.values()) {
			System.out.printf("%-10s%-30s%s%n",  book, book.getTitulo(), book.getAno());
		}
		
		//Classe static EnumSet exibe o intervalo das constantes enums, recebendo 2 parametros (inicio e fim) 
		System.out.println("\nDo Livro 2 ao 3");
		for(EnumBook book : EnumSet.range(EnumBook.CSCP, EnumBook.CPPCP)) {
			System.out.printf("%-10s%-30s%s%n",  book, book.getTitulo(), book.getAno());
		}
	}
}