package test;

/**
 * Conta bancaria que tem operacoes de tranferencia e saque 
 * @author Rodrigo
 * *
 */
public class Conta {
	
	private static final double PIS = 5;
	
	private double saldo;
	private double interest;
	
	public Conta(double interest, double saldoInicial) {
		deposito(saldoInicial);
		this.interest = interest;
	}
	
	public Conta() {
	}

	/**
	 * Obtem saldo atualizado da conta
	 * @return saldo atual
	 */
	
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Operacao de saque a partir da quantia informada
	 * @param quantia que sera sacada
	 */
	public void saque(double quantia) {
		saldo -= quantia;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void taxa() {
		saque(PIS);
	}
	
	public void addInterest() {
		saldo += saldo * interest / 100;
	}
	
	public void transferencia(Conta destino, double quantia) {
		saldo -= quantia;
		destino.saldo += quantia;
		taxa();//Debita uma taxa pra cada operacao de tranferencia
	}
}
