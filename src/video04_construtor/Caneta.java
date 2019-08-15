package video04_construtor;

public class Caneta {
	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;

	public Caneta(String m, String c, float p) { //Construtor usa o mesmo nome da classe

		this.modelo = m;
		this.cor = c;
		this.setPonta(p); // ou usar set se tiver os metodos getters e setters declarados
		this.tampar();
	}

	public String getModelo() {
		return modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {

		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamapda: " + this.tampada);
	}
}