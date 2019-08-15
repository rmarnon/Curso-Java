package entities;

public final class SavingsAccount extends Account{//Heranca de Poupanca extende Conta

	private Double interestRate;//Taxa de juros
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double initialDeposit, Double interestRate) {
		super(number, holder, initialDeposit);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
}
