package test;

public class ContaBanco {

	private int numerodaConta;
	private String tipo;
	private String name;
	private double saldo;
	private boolean status;
	
	public ContaBanco() {
	}
	
	public void abrirConta(String tipo) {
			this.setTipo(tipo);
			this.setStatus(true);
			if(tipo.equals("cc")) {
				this.setSaldo(50);
			}
			else {
				this.setSaldo(150);
			}
			System.out.println("Conta criada com sucesso!");
		}
	
	public void fecharConta(int numeroDaConta) {
				
		if(this.getSaldo() != 0) {
			throw new RuntimeException("Conta deve ter saldo 0 para ser cancelada!");
		}
		else {
			this.setStatus(false);	
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(double valor) {
		if(this.getStatus()) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Deposito efetuado na conta de: " + this.getName());
		}
		else {
			throw new RuntimeException("Conta inexistente para deposito!");
		}
	}
	
	public void sacar(double valor) {
		if(this.getStatus()) {
			if(valor <= this.getSaldo()) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.printf("Saque de R$%.2f do titular %s "
						+ "Restando R$%.2f de saldo", 
						valor, this.getName(), this.getSaldo());
			}
			else {
				System.out.println();
				throw new RuntimeException("Saldo insuficiente!");
			}
		}
		else {
			throw new RuntimeException("Conta inexixstente para saque!");
		}
	}
	
	public void pagarMensalidade() {
		if(this.getStatus()) {
			if(getTipo() == "cc") {
				this.setSaldo(this.getSaldo() - 12.0);
			}
			else {
				this.setSaldo(this.getSaldo() - 20);
			}
		}
		else {
			throw new RuntimeException("Conta nao cadastrada para taxar mensalidade!");
		}
	}

	public int getNumerodaConta() {
		return numerodaConta;
	}

	public void setNumerodaConta(int numerodaConta) {
		this.numerodaConta = numerodaConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return "-----------------------\n"
				+ "Dono: " + getName() + "\n"
				+ "Numero da conta: " + getNumerodaConta()  + "\n"
				+ "Tipo: " + getTipo() + "\n"
				+ "saldo: " + getSaldo() + "\n"
				+ "Status: " + getStatus();
	}
	
}
