package test;

public class Car {

	private double combustivel;
	private double rendimento;

	public Car(double rendimento) {
		this.rendimento = rendimento;
		combustivel = 0.0;
	}
	
	public double verificaCombustivel() {
		return combustivel;
	}
	
	public void dirigir(double distancia) {
		this.combustivel = (rendimento * combustivel - distancia)  / rendimento ;
	}
	
	public void addGas(double gas) {
		this.combustivel += gas;
	}
	
}
