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
		
		//Iterator remove elementos da colecao c1, que estejam declarados em c2
		Iterator<String> iterator = c1.iterator();//Iterator e Collection sao interfaces genericas
		
		 while(iterator.hasNext())//Determina se existe mais elementos a iterar (True/False)
			 if(c2.contains(iterator.next()))//Se c2 contem referencia de c1 iterado
				 iterator.remove();
	}
}
