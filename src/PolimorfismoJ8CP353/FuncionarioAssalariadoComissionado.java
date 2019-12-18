package PolimorfismoJ8CP353;

public class FuncionarioAssalariadoComissionado extends FuncionarioComissionados {

	private double salarioBase;

	public FuncionarioAssalariadoComissionado(String nome, String sobrenome, String cpf, double vendasBrutas,
			double porcentagemDaComissao, double salarioBase) {
		super(nome, sobrenome, cpf, vendasBrutas, porcentagemDaComissao);
		
		if(salarioBase < 0.0) {
			throw new IllegalArgumentException("Salario base deve ser >= 0.0");
		}
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		if(salarioBase < 0.0) {
			throw new IllegalArgumentException("Salario base deve ser >= 0.0");
		}
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double ganho() {
		return super.ganho() + getSalarioBase();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; %s: R$%,.2f", 
				"Piso salarial", super.toString(), "Salario base", getSalarioBase());
	}
}