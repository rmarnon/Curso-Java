package operadores_bitwise;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;

		System.out.println(n1 & n2);  // "&" Os dois tem que ser verdadeiros
		System.out.println(n1 | n2);  // "|" Ou um ou outro, ou ambos verdadeiros
		System.out.println(n1 ^ n2);  // "^" Ou um verdadeiro ou outro verdadeiro somente (XOR).
		
		//-----------------------------------------------------------------------------------//

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para conferir seu 6th bit: ");
		int n = sc.nextInt();
		int mask = 0b001000000; // Equivale ao numero 32 em binario (6th bit = 1)

		if ((n & mask) != 0) { // Ou seja se o 6th bit valer 1
			System.out.println("6th bit is true!"); // 6th bit conta da direita para esquerda <-
		} else {
			System.out.println("6th bit is false!");
		}

		// Compara o 6th bit de um numero lido qualquer com a mascara
		// Se 6th bit for igual a 1, retorna verdadeiro---------------"113" Exemplo
		// Se 6th bit for igual a zero, retorna falso------------------"89" Exemplo

		sc.close();
	}

}
