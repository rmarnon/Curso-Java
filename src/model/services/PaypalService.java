package model.services;

public class PaypalService implements OnlinePaymentService {//1% juros simples + 2% taxa de pagamento
	
	private static final double MONTHLY_INTEREST = 0.01;
	private static final double FEE_PERCENTAGE = 0.02;
	
	@Override
	public double paymentFee(double amount) {
		return amount * FEE_PERCENTAGE;
	}
	
	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}	
}
