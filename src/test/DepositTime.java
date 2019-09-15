package test;

public class DepositTime {	
	
	private double saldo;
	private double juros;
	
	public double getSaldo() {
		return saldo;
	}

	public DepositTime(double juros, double depositoInicial) {
		this.juros = juros / 100;
		deposito(depositoInicial);;			
	}
	
	public void addJuros() {
		this.saldo += saldo * juros;
	}
	
	public void deposito(double dep) {
		if(saldo == 0) {
			this.saldo = dep;
		}
		else {
			throw new RuntimeException("Conta nao permite depositos!");
		}
	}
	
	public void saque(double quantia) {
		if(quantia == saldo) {
			this.saldo -= quantia;
		}
		else {
			throw new RuntimeException("Permitido somente saque no valor total da conta!");
		}
			}
}
