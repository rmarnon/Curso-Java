package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class MapMethods {

	public static void main(String[] args) {

		Map<Integer, String> cadastro = new TreeMap<>();//TreeMap ira ordenar pela chave
		
		cadastro.put(1, "Rodrigo");
		cadastro.put(2, "Thiago");
		cadastro.put(3, "Aline");
		
		cadastro.remove(3);//remove do Map, elementos cujo a chave eh 3
		
		cadastro.put(2, "Carla");//Sobreescreve o que tem na chave 2
		
		System.out.println("Cadastro 1: " + cadastro.get(1));//Retorna elemento da chave "1"
		System.out.println("Cadastro 3: " + cadastro.get(3));//Foi removido, entao retorna null
		
		System.out.println();
		for (Integer key : cadastro.keySet()) {//Retorna um Set<k> com uma chave contida no Map
			System.out.println(key + " - " + cadastro.get(key));
		}
		
		//-------------------------------------------------------------------------------------------
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("nome", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99991111");
		
		System.out.println();
		System.out.println("Contains 'cpf' 'key'? " + cookies.containsKey("cpf"));
		System.out.println("Phone number: " + cookies.get("phone"));//Retorna telefone da chave "phone"
		
		System.out.println();
		for (String s : cookies.values()) {//Retorna os valores de uma colecao
			System.out.println(s);
		}
		
		System.out.println("Tamanho do conjunto 'cookies': " + cookies.size());	
		
		//--------------------------------------------------------------------------------------------
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 900.00);
		Product p2 = new Product("PS4", 1500.00);
		Product p3 = new Product("Xbox", 1200.00);
		
		stock.put(p1, 78.0);//Quantidade em Double
		stock.put(p2, 150.0);
		stock.put(p3, 200.0);
		
		Product ps = new Product("TV", 1000.00);
		
		System.out.println();
		System.out.println("Contains 'TV' 'key'? " + stock.containsKey(ps));//False, valores diferentes		
		System.out.println("Products in stock Tv: " + stock.get(p1) + " unidades.");
		
		System.out.println();
		for (Product p : stock.keySet()) {
			System.out.println(p.getName() + " " + p.getPrice() + " " +  stock.get(p));
			//Product "p", nao aceita p.get(p)
		}
		
		System.out.println();//Traz as quantidades de todos os produtos em "DOUBLE"
		for (Double p : stock.values()) {
			System.out.println(p);
		}		
			
	}

}
