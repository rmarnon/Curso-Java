
public class StringTips {

	public static void main(String[] args) {
		
		//Ver tambem funcoes String!!!
		
		char[] array = {'O', 'l', 'a', ',', ' ', 'M', 'u', 'n', 'd', 'o'};
		char[] arrayVazio = new char[6];
		
		//Tipos de construtores
		String s = "Ola, Mundo!";
		String s0 = new String();
		String s1 = s;
		String s2 = new String(array);
		String s3 = new String(array, 5, 3);
		
		String s5 = new String("Hello");
		String s6 = "good bye";
		String s7 = "GOOD BYE";
		String s10 = "Good ";
		String s11 = "Morning";
		
		String[] s8 = {"iniciado", "iniciando", "finalizado", "finalizando"};
		String s9 = "abcdefghijklmabcdefghijklm";
		
		//Copia caracteres de uma String 's' "do 5 ao 10" p/ um arrayVazio iniciando no 0.
		s.getChars(5, 11, arrayVazio, 0);
		
		System.out.println("S-" + s);
		System.out.println("S0-" + s0);
		System.out.println("S1-" + s1);
		System.out.println("S2-" + s2);
		System.out.println("S3-" + s3);
		
		System.out.print("S4-");
		for(char c : arrayVazio) {
			System.out.print(c);
		}
		
		//Imprime invertido
		System.out.println();
		System.out.print("Invertido: ");
		for(int count = s.length() - 1; count >= 0; count--) {
			System.out.print(s.charAt(count));
		}
		
		//Testa igualdade
		System.out.println();
		if(s5.equals("Hello")) //True, Sao o mesmo objeto "Referencia"
			System.out.println("S5.equals =  True");
		else
			System.out.println("S5.equals False");	
		
		//Compara objetos "Not Equals"
		if(s7.equals(s6))
			System.out.println("S6 Equals S7");
		else
			System.out.println("S6 Not equals S7");
		
		//False, pois sao objetos diferentes
		if(s5 == "Hello")
			System.out.println("S5 == Hello");
		else
			System.out.println("S5 != Hello");
		
		//Compara ignorando Maiusculas de Minusculas
		if(s6.equalsIgnoreCase(s7))
			System.out.println("S6 igual S7 com Case ignorado");
		
		//CimpareTo retorn um numero inteiro
		System.out.println("S6 compareTo S7: " + s6.compareTo(s7));
		System.out.println("S7 compareTo S6: " + s7.compareTo(s6));
		System.out.println("S6 compareTo S: " + s6.compareTo(s));
		System.out.println("S7 compareTo S7: " + s7.compareTo(s7));
		
		//Comparacao de igualdade entre partes de duas strings
		
		//Testa regionMatches (Distingue Maiusculas e Minusculas)
		if(s6.regionMatches(0, s7, 0, 5))//False fica implicito
			System.out.println("Primeiros 5 caracteres batem");
		else
			System.out.println("Primeiros 5 caracteres nao batem");
		
		//Testa regionMatches (Ignora Maiusculas e Minusculas)
		if(s6.regionMatches(true, 0, s7, 0, 5))
			System.out.println("Primeiros 5 caracteres batem com CASE ignorado");
		else
			System.out.println("Primeiros 5 caracteres nao batem com CASE ignorado");
		
		//starWith, endsWith(So funciona com Strings, nao funciona com char)
		for(String string : s8) {
			if(string.startsWith("in")) {
				System.out.println(string + " -> starsWith 'in'");
			}			
		}
		
		for(String string : s8) {
			if(string.startsWith("ali", 3)) {
				System.out.println(string + " -> starsWith 'ali na posicao 3'");
			}			
		}
		
		for(String string : s8) {
			if(string.endsWith("ado")) {
				System.out.println(string + " => endsWith 'ado'");
			}
		}
		
		//indexOf e lastIndexOf
		System.out.println("'c' indexOf " + s9.indexOf('c'));
		System.out.println("'a' indexOf " + s9.indexOf('a', 1) + " a partir da posicao 1");
		System.out.println("'#' indexOf inexistente " + s9.indexOf('#'));//Nao existe
		System.out.println("'a' lastIndexOf " + s9.lastIndexOf('a'));
		System.out.println("\"def\" lastIndexOf " + s9.lastIndexOf("def"));
		
		System.out.println("S10.concat(S11) -> " + s10.concat(s11));
	}

}
