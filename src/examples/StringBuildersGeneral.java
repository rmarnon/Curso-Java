package examples;

public class StringBuildersGeneral {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(10);

		System.out.println("Comprimento Inicial Lenghth(): " + sb.length());
		System.out.println("Capacidade Inicial Capacity(): " + sb.capacity());
		
		sb.append("Hello World!");//10 caracteres anteriores + 12 da String no parametro
		System.out.println("After String Lenghth(): " + sb.length());
		System.out.println("After String Capacity(): " + sb.capacity());
		
		sb.ensureCapacity(75);//Expande p 75 especificamente sem arredondar
		System.out.println("After ensureCapacity() lenghth(): " + sb.length());//12 da String
		System.out.println("After ensureCapacity() capcity(): " + sb.capacity());
		
		sb.setLength(5);//Trunca p/ teto de 5 caracteres, ignorando o restante 0-9
		System.out.println("Truncando Lenghth(): " + sb.length());
		System.out.println("Truncando Capacity(): " + sb.capacity());
		System.out.println("Set p/ 10 caracteres: " + sb);
		
		sb.setLength(10);//Aplica teto de 10 caracteres, acrescentando null ate totalizar 20
		System.out.println("Completando com NULL Lenghth(): " + sb.length());
		System.out.println("Capacity(): " + sb.capacity());
		System.out.println("Set p/ 10 caracteres completando com NULL: " + sb + "Fim");
		
		//toString
		System.out.println("toString + Trim p/ cortar Null no fim: " + sb.toString().trim());
		
		//charAt()
		System.out.println("charAt(1): " + sb.charAt(1));
		
		sb.setLength(5);//Copia caracteres de um StringBuilder p/ um array 
		char[] chars = new char[sb.length()];//Arrays de char limitado
		sb.getChars(0, sb.length(), chars, 0);
		
		for(char caracteres : chars) {
			System.out.print(caracteres + " - ");
		}
		
		//Troca caractere da posicao especificada
		sb.setCharAt(0, 'R');
		System.out.println("\nTroca 'H' por 'R': " + sb);
		
		//Invert StringBuilder
		System.out.println("Imprime invertido: " + sb.reverse());
		
		//Buffer com Append
		String s1 = "Good";
		char c = '-';
		Object obj = "Morning";
		char[] array = {'a', 'b', 'c'};
		long l = 1000000L;
		boolean b = true;
		int n = 1234;
		double d = Math.PI;
		StringBuilder last = new StringBuilder("last Buffer");
		StringBuilder buffer = new StringBuilder();
		
		buffer.append(l).append("\n").append(b).append("\n").append(s1).append("\n")
		.append(c).append("\n").append(obj).append("\n").append(d).append("\n").append(n)
		.append("\n").append(array).append("\n").append(last);
		
		System.out.println();
		System.out.printf("buffer contains%n%s%n", buffer);
		
		//Concatenando e convertendo p/ String
		String string1 = new StringBuilder().append("Hello").append(" World").toString();
		string1 += '!';//Caractere
		System.out.println("Concatenado: " + string1);
		
		//Delete de 0 ao tamanho final
		buffer.delete(0, buffer.length());
		System.out.println("Clear: " + buffer);
		
		//Insert
		StringBuilder string2 = new StringBuilder();
		string2.insert(0, s1);
		string2.insert(0, " ");
		string2.insert(1, c);
		string2.insert(0, " ");
		string2.insert(0, obj);
		string2.insert(0, " ");
		string2.insert(0, array);
		System.out.println("Inverte toda vez que coloca na posicao 0: " + string2);
		
		//Delete da posicao 1 ate posicao 2 (3 exclusive)
		string2.delete(1, 3);
		string2.deleteCharAt(0);//Deleta 'a'
		System.out.println("Delete charAt(1): " + string2);
	}

}
