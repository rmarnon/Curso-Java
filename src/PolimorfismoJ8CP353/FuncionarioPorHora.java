package PolimorfismoJ8CP353;

public class FuncionarioPorHora extends Empregado {

	private double salario;//Salario por hora
	private double horas; //Horas trabalhadas durante a seman
	
	public FuncionarioPorHora(String nome, String sobrenome, String cpf, double salario, double horas) {
		super(nome, sobrenome, cpf);
		setSalario(salario);
		setHoras(horas);
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		if(salario < 0.0) {
			throw new IllegalArgumentException("Remuneracao deve ser >= 0.0");
		}
		this.salario = salario;
	}
	
	public double getHoras() {
		return horas;
	}
	
	public void setHoras(double horas) {
		if ((horas < 0.0) || (horas > 168.0)) {
			 throw new IllegalArgumentException("Horas trabalhadas deve ser >= 0.0 e <= 168.0");
		 }		 
		this.horas = horas;
	}
	
	@Override
	public double ganho() {
		if(horas <= 40) {
			return getHoras() * getSalario();
		}
		else {
			return 40 * getSalario() + (getHoras() - 40) * getSalario() * 1.5;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s R$%.2f; %s: %.2f", 
				"Funcionario por Hora", super.toString(), 
				"Ganho por hora", getSalario(), "Horas trabalhadas", getHoras());
	}
	
}
