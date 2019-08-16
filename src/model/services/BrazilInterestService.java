package model.services;

import java.security.InvalidParameterException;

public class BrazilInterestService {

	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}
	
	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months be greater than zero");
		}
		else {
			return amount * Math.pow(1 + interestRate / 100, months);//Taxa de juros elevado a qtd meses
		}
	}
}
