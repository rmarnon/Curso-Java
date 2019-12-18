package PolimorfismoJ8CP353;

public class FuncionarioComissionados extends Empregado {

	private double vendasBrutas;
	private double porcentagemDaComissao;
	
	public FuncionarioComissionados(String nome, String sobrenome, String cpf, double vendasBrutas, 
			double porcentagemDaComissao) {
		super(nome, sobrenome, cpf);
		setVendasBrutas(vendasBrutas);
		setPorcentagemDaComissao(porcentagemDaComissao);
	}
	
	public double getVendasBrutas() {
		return vendasBrutas;
	}
	
	public final void setVendasBrutas(double vendasBrutas) {
		if(vendasBrutas < 0) {
			throw new IllegalArgumentException("Vendas brutas deve ser >= 0.0");
		}
		this.vendasBrutas = vendasBrutas;
	}
	
	public double getPorcentagemDaComissao() {
		return porcentagemDaComissao;
	}
	
	public final void setPorcentagemDaComissao(double porcentagemDaComissao) {
		if(porcentagemDaComissao <= 0.0 || porcentagemDaComissao >= 1.0) {
			throw new IllegalArgumentException("Porcentagem da comissao deve ser > 0.0 e < 1.0");
		}
		this.porcentagemDaComissao = porcentagemDaComissao;
	}
	
	@Override
	public double ganho() {
		return getPorcentagemDaComissao() * getVendasBrutas();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: R$%,.2f; %s: %.2f%%", 
				"Funcionario comissionado", super.toString(),
				"Vendas brutas", getVendasBrutas(),
				"Taxa de comissao", getPorcentagemDaComissao());
	}	
}
