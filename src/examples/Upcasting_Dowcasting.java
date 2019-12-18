package examples;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Upcasting_Dowcasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1000, "Alex", 0.0);
		SavingsAccount sacc = new SavingsAccount(1001, "Rodrigo", 1000.00, 0.05);
		BusinessAccount bacc = new BusinessAccount(1002, "Anna", 0.00, 500.00);
		
		// UPCASTING
		
		Account acc0 = sacc;
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Joao", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Bob", 0.0, 0.01);
		
		// DOWNCASTING
		
		//BusinessAccount bcc = acc2; Gera erro ao tentar fazer direto, mesmo original sendo derivado
		BusinessAccount bcc = (BusinessAccount)acc2;//Casting manual
		//BusinessAccount bcc1 = (BusinessAccount)sacc; Savings cannot be converted (cast) to business
		//BusinessAccount bcc2 = (BusinessAccount)acc3; Compila, mas gera erro ao executar!
		
		// InstanceOf -> 
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bcc3 = (BusinessAccount)acc3;
			bcc3.loan(500.00);
			System.out.println("Loan");
		}		
		
		if (acc3 instanceof SavingsAccount) {//Se acc3 e objeto do tipo SavingsAccount (instancia)
			SavingsAccount sacc1 = (SavingsAccount)acc3;//Faz casting manual normal
			sacc1.updateBalance(); //Operacao especifica da SavingsAccount
			System.out.println("Updated");
		}
	}
}
