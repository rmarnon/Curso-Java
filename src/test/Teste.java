package test;

public class Teste {

	public static void main(String[] args) {
		
		ContaBanco c = new ContaBanco();
		ContaBanco p = new ContaBanco();
		
		c.setName("Rodrigo");
		c.abrirConta("cc");
		c.sacar(50);
		c.setNumerodaConta(128449);
		p.setName("Carla");
		p.abrirConta("pp");
		c.fecharConta(128449);
	

		p.depositar(500);
		p.sacar(100);


		System.out.println();
		System.out.println(c);
		System.out.println(p);
		
			
	}
}
