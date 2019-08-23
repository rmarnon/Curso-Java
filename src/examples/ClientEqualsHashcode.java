package examples;

import entities.Client;

public class ClientEqualsHashcode {

	public static void main(String[] args) {

		Client c1 = new Client();
		Client c2 = new Client();
		Client c3 = new Client();
		
		c1.setName("Rodrigo");
		c1.setEmail("rmarnon@yahoo.com.br");
		
		c2.setName("Rodrigo");
		c2.setEmail("rmarnon@yahoo.com.br");
		
		c3.setName("Carla");
		c3.setEmail("carlarodbatista@gmail.com");
		
		String s1 = "teste";
		String s2 = "teste";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1 == c2);//False pois compara referencias de memoria (objetos !=) no heap
		System.out.println(s1 == s2);//Mesmo objetos sendo != compilador trata literal de forma especial
		//Agora se instanciar-> String s1 = new String("teste"); ai vai dar false pois objetos sao !=

	}

}
