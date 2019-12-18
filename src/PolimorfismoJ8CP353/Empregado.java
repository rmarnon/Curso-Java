package PolimorfismoJ8CP353;

public abstract class Empregado {

	private final String nome;
	private final String sobrenome;
	private final String cpf;
	
	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%nCPF: %s", getNome(), getSobrenome(), getCpf());
	}
	
	public abstract double ganho();
}
