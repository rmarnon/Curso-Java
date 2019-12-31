package examples;

import java.util.Scanner;

public class ValidaEntradaDomain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro nome: ");
		String nome = sc.nextLine();
		System.out.print("Entre com o sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.print("Entre com o Endereco: ");
		String endereco = sc.nextLine();
		System.out.print("Entre com a cidade: ");
		String cidade = sc.nextLine();
		System.out.print("Entre com o estado: ");
		String estado = sc.nextLine();
		System.out.print("Entre com o cep: ");
		String cep = sc.nextLine();
		System.out.print("Entre com o numero de telefone: ");
		String fone = sc.nextLine();

		System.out.println("\nValidando resultado: ");
		
		if(!ValidaEntrada.validaPrimeiroNome(nome)) {
			System.out.println("Nome Invalido!");
		}
		else if(!ValidaEntrada.validaSobrenome(sobrenome)) {
			System.out.println("Sobrenome Invalido!");
		}
		else if(!ValidaEntrada.validaEndereco(endereco)) {
			System.out.println("Endereco Invalido!");
		}
		else if(!ValidaEntrada.validaCidade(cidade)) {
			System.out.println("Cidade Invalida");
		}
		else if(!ValidaEntrada.validaEstado(estado)) {
			System.out.println("Estado invalido!");
		}
		else if(!ValidaEntrada.validaCep(cep)) {
			System.out.println("Cep Invalido!");
		}
		else if(!ValidaEntrada.validaFone(fone)) {
			System.out.println("Numero de telefone invalido!");
		}			
		else {
			System.out.println("Entradas Validas, Obrigado!");
		}
	}
}
