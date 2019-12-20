package examples;

public class ExceptionChain {

	public static void main(String[] args) {
		
		try {
			method1();
		}
		catch (Exception e) {//Excecao lancada do metodo 1
			e.printStackTrace();//Rastreamento da pilha
		}

	}

	//Retorna excecao p/ metodo main
	public static void method1() throws Exception {
		
		try {
			method2();
		}
		catch (Exception e) {//Excecao lancada do metodo 2
			throw new Exception("Error Method 1", e);
		}
		
	}

	//Retorna excecao p/ metodo 1
	public static void method2() throws Exception {
		
		try {
			method3();
		}
		catch (Exception e) {//Excecao lancada do metodo 3
			throw new Exception("Error Method 2", e);
		}
	}

	//Sem bloco try, lanca excecao de volta p/ method2
	public static void method3() throws Exception{	
		
		throw new Exception("Error Method 3");
		
	}

}
