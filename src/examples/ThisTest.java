package examples;

import java.text.ParseException;

public class ThisTest {//Somente uma classe pode ser publica

	public static void main(String[] args) throws ParseException {
		
		SimpleTime time = new SimpleTime(15, 47, 58);
		System.out.println(time.buildString());
		System.out.println("-----------------------------------------");
		SimpleTime t1 = new SimpleTime();
		SimpleTime t2 = new SimpleTime(07);
		SimpleTime t3 = new SimpleTime(15, 25);
		SimpleTime t4 = new SimpleTime(21, 41, 51);
		SimpleTime t5 = new SimpleTime(t4);
				
		display("T1: Inicializado", t1);
		display("T2: Hora", t2);
		display("T3: Hora/Minuto", t3);
		display("T4: Hora/Minuto/Segundo", t4);
		display("T5: Objeto T4", t5);
		
		try {
			SimpleTime t6 = new SimpleTime(27, 74, 98);
		}
		catch (IllegalArgumentException e) {
			System.out.printf("Excessao ao inicializar T6: %s%n", e.getMessage());
		}
		
	}
	
	public static void display(String header, SimpleTime t) {
		System.out.printf("%s%n %s%n %s%n%n", header, t.toUniversalString(), t.toString());
	}	
}
	
/*****/class SimpleTime {//Classes adicionais nao podem ter encapsulamento!
		
		private int hora;
		private int minuto;
		private int segundo;
		
		//Para usar construtores com This (Abaixo) deve se ter um com Parametros e This implementado (Esse).
		public SimpleTime(int hora, int minuto, int segundo) {
			if(hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60)  {
				throw new IllegalArgumentException("Valor(es) fornecido(s) fora da faixa permitida!");
			}
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
		
		//Construtor "Padrao" sobrecarregado implicitamente c/ (3 argumentos) e inicializandos.
		public SimpleTime() {
			this(11, 22, 33);
		}
		
		//Construtor obrecarregado c/ Hora fornecida, minuto e segundo = 0.
		public SimpleTime(int hora) {
			this(hora, 0, 0);
		}
		
		//Sobrecarga com hora/minuto, segundos = 0.
		public SimpleTime(int hora, int minuto) {
			this(hora, minuto, 0);
		}
		
		//Invoca construtor com 03 argumentos passando o proprio construtor 
		public SimpleTime(SimpleTime time) {
			this(time.getHora(), time.getMinuto(), time.getSegundo());
		}
		
		public int getHora() {
			return hora;
		}

		public int getMinuto() {
			return minuto;
		}

		public int getSegundo() {
			return segundo;
		}
		
		public String buildString() {//This explicito e implicito p/ toUniversalString
			 return String.format("%26s: %s%n%26s: %s%n%26s: %s",  
					 "this.toUniversalString()", this.toUniversalString(),
					 "toUniversalStringComGet()", toUniversalStringComGet(),
			 		 "toString()", toString());	
		}

		public String toUniversalString() {//Converte em String o formato (HH:MM:SS)
			return String.format("%02d:%02d:%02d", this.hora , this.minuto , this.segundo);//Com This explicito
		}
		
		public String toUniversalStringComGet() {//Converte em String o formato (HH:MM:SS)
			return String.format("%02d:%02d:%02d", getHora() , getMinuto(), getSegundo());
		}
		
		public String toString() {//Converte em String o formato (HH:MM:SS "AM" ou "PM")
			return String.format("%02d:%02d:%02d %s", (hora == 0 || hora == 24)? hora: hora % 12,
					minuto, segundo, (hora < 12)? "\"AM\"": "\"PM\"");//Sem This implicito (Opcional)
		}			
	}
