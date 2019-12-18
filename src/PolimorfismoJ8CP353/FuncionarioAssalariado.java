package PolimorfismoJ8CP353;

public class FuncionarioAssalariado extends Empregado {

	private double salarioSemanal;

	public FuncionarioAssalariado(String nome, String sobrenome, String cpf, double salarioSemanal) {
		super(nome, sobrenome, cpf);
		
		if(salarioSemanal < 0.0) {
			throw new IllegalArgumentException("Salario semanal deve ser >= 0.0");
		}
		this.salarioSemanal = salarioSemanal;
	}
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	
	public void setSalarioSemanal(double salarioSemanal) {
		if(salarioSemanal < 0.0) {
			throw new IllegalArgumentException("Salario semanal deve ser >= 0.0");
		}
		this.salarioSemanal = salarioSemanal;
	}
	
	@Override
	public double ganho() {
		return getSalarioSemanal();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: R$%,.2f", "Funcionario Assalariado",
				super.toString(), "Salario semanal", getSalarioSemanal());
	}	
	
}
