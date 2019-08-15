package entities;

import model.exceptions.DomainException;

public /*abstract*/ class Account { //Deixei comentado pra nao atrapalhar outros exercicios c/ Account
	
	private Integer number;
	private String holder;
	protected double balance;
	private double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(Integer number, String holder, double initialDeposit, double withdrawLimit) {//Parametro + legivel
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
		deposit(initialDeposit); //Coerente, e se precisar alterar, so altera no metodo "deposit".
	}
	
	public Account(Integer number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;	
	}
	
	public String toString() {
		return "Account: "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
