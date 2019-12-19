package PolimorfismoJ8CP353;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		FuncionarioAssalariado funcionario1 = new FuncionarioAssalariado(
				"Rodrigo", "Morais", "123456789-0", 800.00);
		
		FuncionarioPorHora funcionario2 = new FuncionarioPorHora(
				"Gisely", "Barros", "321654987-0", 16.75, 40);
		
		FuncionarioComissionados funcionario3 = new FuncionarioComissionados(
				"Nyna", "Willians", "036985214-7", 10000.0, 0.06);
		
		FuncionarioAssalariadoComissionado funcionario4 = new FuncionarioAssalariadoComissionado(
				"Karina", "Lago", "987654321-0", 5000.00, 0.04, 300.00);
		
		FuncionarioAssalariadoComissionado funcionario5 = new FuncionarioAssalariadoComissionado(
				"Mayko", "Cunha", "789456123-0", 7000.00, 0.05, 500.00);
		
		System.out.println("Empregados processados individualmente:");
		System.out.printf("%n%s%n%s: R$%,.2f%n", funcionario1, "Ganhou", funcionario1.getCalculaPagamento());
		System.out.printf("%n%s%n%s: R$%,.2f%n", funcionario2, "Ganhou", funcionario2.getCalculaPagamento());
		System.out.printf("%n%s%n%s: R$%,.2f%n", funcionario3, "Ganhou", funcionario3.getCalculaPagamento());
		System.out.printf("%n%s%n%s: R$%,.2f%n", funcionario4, "Ganhou", funcionario4.getCalculaPagamento());
		System.out.printf("%n%s%n%s: R$%,.2f%n", funcionario5, "Ganhou", funcionario5.getCalculaPagamento());
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Empregados processados polimorficamente:\n");
		
		List<Empregado> empregados = new ArrayList<>();
		empregados.addAll(Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4, funcionario5));
		
		for(Empregado empregado : empregados) {
			System.out.println(empregado);
			
			if(empregado instanceof FuncionarioAssalariadoComissionado) {
				FuncionarioAssalariadoComissionado funcionario = (FuncionarioAssalariadoComissionado)empregado;
				funcionario.setSalarioBase(1.10 * funcionario.getSalarioBase());
				System.out.printf("Novo salario c/ 10%% de reajuste eh: R$%,.2f%n", funcionario.getSalarioBase());
			}
			System.out.printf("Ganhou R$%,.2f%n%n", empregado.getCalculaPagamento());
		}
		for(int contador = 0; contador < empregados.size(); contador++) {
			System.out.printf("Empregado %d eh um ", 1 + contador);
			String n = empregados.get(contador).getClass().getName();//Estava trazendo o nome do pacote
			System.out.println(n.substring(20));
		}
	}
}
