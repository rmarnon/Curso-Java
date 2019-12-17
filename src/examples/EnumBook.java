package examples;

public enum EnumBook {

	JCP("Java Como Programar", 2015),
	CSCP("C# Como Programar", 2012),
	CPPCP("C++ Como Programar", 2010),
	PCP("Python Como Programar", 2018);
	
	private final String titulo;
	private final int ano;
	
	//Construtor sem encapsulamento (So aceita Private caso omitido)
	EnumBook(String titulo, int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getAno() {
		return ano;
	}	
}
