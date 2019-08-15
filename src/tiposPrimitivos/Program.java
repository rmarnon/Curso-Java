package tiposPrimitivos;

public class Program {

	public static void main(String[] args) {
		
		byte b1 = -128; 
		short s1 = -32768; 
		int n1 = -2147483648; 
		long n2 = -9223372036854775808L;
		
		float n3 = 7.5459659f; //Colocar 'F'
		double n4 = 54596591545115315151135111454820515D; //Colocar 'D', veja que ele eleva os valores.
		
		//Vao ate um digito a menos nas casas positivas, exemplo byte vai ate +127
		
		char letter = '\u0041'; //Codigo unicode do caractere A
		boolean chose = true;  //False or True
		
		String nome = "Rodrigo";
		Object obj1 = "Marnon";
		Object obj2 = 37; //Object recebe qualquer tipo de dado.
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(letter);
		System.out.println(chose);
		System.out.println(nome);
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}