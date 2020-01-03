package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		
		String[] cores = {"Amarelo", "Verde", "Laranja", "Vermelho", "Azul", "Branco", "Preto"};
		List<String> list = new ArrayList<>();
		
		for(String cor : cores) 
			list.add(cor);
				
		String[] removeCores = {"Amarelo", "Verde", "Laranja"};
		List<String> removeList = new ArrayList<>();
		
		for(String cor : removeCores) 
			removeList.add(cor);
		
		//Exclui elementos de list, que contenham em removeList
		removendoCoresDaLista(list, removeList);
		
		System.out.println("Lista apos remocao: ");
		for(String cor : list)
			System.out.println(cor);		
	}
	
	//Tambem funciona passando List ao inves de Collection
	public static void removendoCoresDaLista(Collection<String> c1, Collection<String> c2) {
		
		//Remove elementos na segunda colecao da primeira colecao ArrayList
		Iterator<String> iterator = c1.iterator();
		
		 while(iterator.hasNext())
			 if(c2.contains(iterator.next()))
				 iterator.remove();
	}
}
