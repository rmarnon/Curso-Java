package video03_visibilidade;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Esta tampada? " + this.tampada);		
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO!!! A caneta esta' tampada.");
		}else {
			System.out.println("Rabisque a vontade!!!");
			System.out.println(" ");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
