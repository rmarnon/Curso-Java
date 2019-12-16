package examples;

import java.text.ParseException;

public class ThisTest {//Somente uma classe pode ser publica

	public static void main(String[] args) throws ParseException {
		
		SimpleTime time = new SimpleTime(15, 47, 58);
		System.out.println(time.buildString());
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
			this(05,50,55);
		}
		
		//Construtor obrecarregado c/ Hora fornecida, minuto e segundo padrao 0.
		public SimpleTime(int hora) {
			this(hora, 0, 0);
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
			 		 "toUSFormat()", toUSFormat());	
		}

		public String toUniversalString() {//Converte em String o formato (HH:MM:SS)
			return String.format("%02d:%02d:%02d", this.hora , this.minuto , this.segundo);//Com This explicito
		}
		
		public String toUniversalStringComGet() {//Converte em String o formato (HH:MM:SS)
			return String.format("%02d:%02d:%02d", getHora() , getMinuto(), getSegundo());
		}
		
		public String toUSFormat() {//Converte em String o formato (HH:MM:SS "AM" ou "PM")
			return String.format("%02d:%02d:%02d %s", (hora == 0 || hora == 24)? hora: hora % 12,
					minuto, segundo, (hora < 12)? "\"AM\"": "\"PM\"");//Sem This implicito (Opcional)
		}		
	}

