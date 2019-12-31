package examples;

public class ValidaEntrada {

	//O método String matches verifica se uma string inteira se adapta a uma expressão regular
	public static boolean validaPrimeiroNome(String nome) {
		return nome.matches("[[:upper:][a-zA-Z]]+");
	}
	
	public static boolean validaSobrenome(String sobrenome) {
		return sobrenome.matches("[a-zA-Z]+([ ]?[a-zA-Z]+)*");
	}
	
	public static boolean validaEndereco(String endereco) {
		return endereco.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)\\s+\\d+");
	}
	
	public static boolean validaCidade(String cidade) {
		return cidade.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validaEstado(String estado) {
		return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");		
	}
	
	public static boolean validaCep(String cep) {
		return cep.matches("\\d{8}");
	}
	
	public static boolean  validaFone(String fone) {
		return fone.matches("[1-9]\\d-[1-9]\\d{3}-\\d{4}");
	}
	
}
