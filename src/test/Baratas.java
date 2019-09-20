package test;

public class Baratas {

	private double populacao;
	
	public Baratas(int populacaoInicial) {
		this.populacao = populacaoInicial;
	}
	
	public void breed() {
		populacao *= 2;
	}
	
	public void spray() {
		populacao-= populacao * 10 /100;
	}
	
	public double getRoaches() {
		return populacao;
	}
}
