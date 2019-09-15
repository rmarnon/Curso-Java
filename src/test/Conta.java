package test;

/**
 * Conta bancaria que tem operacoes de tranferencia e saque 
 * @author Rodrigo
 * *
 */
public class Conta {
	
	private static final double PIS = 5;
	
	private Double saldo;
	
	/**
	 * Obtem saldo atualizado da conta
	 * @return saldo atual
	 */
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Operacao de saque a partir da quantia informada
	 * @param quantia que sera sacada
	 */
	public void saque(double quantia) {
		this.saldo -= quantia;
	}

	public void taxa() {
		saque(PIS);
	}
	
	public void transferencia(Conta destino, double quantia) {
		saldo -= quantia;
		destino.saldo += quantia;
		taxa();
	}
}
