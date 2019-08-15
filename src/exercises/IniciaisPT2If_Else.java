package exercises;

import java.util.Locale;
import java.util.Scanner;

public class IniciaisPT2If_Else {

	public static void main(String[] args) {
		
		/*03) Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre 
		 * si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. 
		 */
 		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digitar dois valores para ver se sao multiplos: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("Multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		//------------------------------------------------------------------------------------------//
		
		/*04) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de
		 * 1 hora e máxima de 24 horas. 
		 */
		
		System.out.println("Digite a hora inicial: ");
		double horaInicial = sc.nextDouble();
		System.out.println("Digite a hora final: ");
		double horaFinal = sc.nextDouble();
		
		double duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;			
		}
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		//------------------------------------------------------------------------------------------//
		
		/*05) Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
		 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.  
		 */
		
		int code = 0, quantities;
		double price = 0.00, tot = 0.00;
		String productName;
		
		System.out.println("Insert product code: ");
		code = sc.nextInt();
		System.out.println("What amount of product: ");
		quantities = sc.nextInt();
		
		if (code == 1) {
			productName = "Cachorro Quente";
			price = 4.00;
		}
		else if (code == 2) {
			productName = "X-Salada";
			price = 4.50;
		}
		else if (code == 3) {
			productName = "X-Bacon";
			price = 5.00;
		}
		else if (code == 4) {
			productName = "Salada Simples";
			price = 2.00;
		}
		else if (code == 5) {
			productName = "Refrigerante";
			price = 1.50;
		}
		else {
			productName = "Produto nao cadastrado!";
		}
		
		tot = quantities * price;
		System.out.printf("%s %nValor unitario: R$%.2f %nTotal: R$%.2f %n", productName, price, tot);
		
		/*06) Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem 
		 * dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor
		 *  se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser
		 *   impressa a mensagem “Fora de intervalo”. 
		 */
 
		double valor;
		System.out.println("Digite um valor qualquer: ");
		valor = sc.nextDouble();
		
		if (valor >= 0 && valor < 25) {
			System.out.println("Intervalo 0 - 25");
		}
		else if (valor > 25 && valor <= 50) {
			System.out.println("Intervalo 25 - 50");
		}
		else if (valor > 50 && valor <= 75) {
			System.out.println("Intervalo 50 - 75");
		}
		else if (valor > 75 && valor <= 100) {
			System.out.println("Intervalo 75 - 100");
		}
		else {
			System.out.println("Fora do Intervalo");
		}
		
		//----------------------------------------------------------------------------------------//
		
		/*07) Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de 
		 * um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou 
		 * se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
		 
 		Se o ponto estiver na origem, escreva a mensagem “Origem”. 
 		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		*/
		
		System.out.println("Verifica Quadrante!");
		System.out.println("Digite dois valores: ");
		
		double l = sc.nextDouble();
		double c = sc.nextDouble();
		
		if (l > 0 && c > 0) {
			System.out.println("Q1");
		}
		else if (l < 0 && c > 0) {
			System.out.println("Q2");
		}
		else if (l < 0 && c < 0) {
			System.out.println("Q3");
		}
		else if (l > 0 && c < 0) {
			System.out.println("Q4");
		}
		else if (l == 0 && c != 0) {
			System.out.println("Eixo Y");
		}
		else if (c == 0 && l != 0) {
			System.out.println("Eixo X");
		}
		else {
			System.out.println("Origem");
		}
		
		//------------------------------------------------------------------------------------------//
		
		/*08) Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar
		 * seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados
		 * são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o 
		 * Rombus, cujo símbolo é o R$. 
		 
 		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
 		Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo 
 		a tabela abaixo.
 		
 		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
 		pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
 		No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que 
 		resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais. 
 		*/
		
		System.out.println("Digite o salario: ");
		double sal = sc.nextDouble();		
		double imposto;

		if (sal <= 2000.0) {
			imposto = 0.0;
		}
		else if (sal <= 3000.0) {
			imposto = (sal - 2000.0) * 0.08;
		}
		else if (sal <= 4500.0) {
			imposto = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
  