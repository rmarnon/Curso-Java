package PolimorfismoJ8CP353;

public class Fatura implements Pagamento {

	private final String numeroDaPeca;
	private final String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura(String numeroDaPeca, String descricao, int quantidade, double preco) {
		this.numeroDaPeca = numeroDaPeca;
		this.descricao = descricao;
		setQuantidade(quantidade);
		setPreco(preco);
	}
	
	public String getNumeroDaPeca() {
		return numeroDaPeca;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public final void setQuantidade(int quantidade) {
		if(quantidade < 0) {
			throw new IllegalArgumentException("Quantidade deve ser >= 0");
		}
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public final void setPreco(double preco) {
		if(preco < 0 ) {
			throw new IllegalArgumentException("Preco deve ser >= 0.0");
		}
		this.preco = preco;
	}

	@Override
	public double getCalculaPagamento() {
		return getQuantidade() * getPreco();
	}
	
	@Override
	public String toString() {		
		return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: R$%,.2f", 
				"Fatura", "Numero da peca", getNumeroDaPeca(), getDescricao(),
				"Quantidade", getQuantidade(), "Preco por item", getPreco());
	}
	
}
