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
		
		public SimpleTime(int hora, int minuto, int segundo) {
			if(hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60)  {
				throw new IllegalArgumentException();
			}
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		}
		
		public String buildString() {//This explicito e implicito p/ toUniversalString
			 return String.format("%24s: %s%n%24s: %s%n%24s: %s",  
					 "this.toUniversalString()", this.toUniversalString(),
					 "toUniversalString()", toUniversalString(),
			 		 "toUSFormat()", toUSFormat());	
		}

		public String toUniversalString() {//Converte em String o formato (HH:MM:SS)
			return String.format("%02d:%02d:%02d", this.hora , this.minuto , this.segundo);//Com This explicito
		}
		
		public String toUSFormat() {
			return String.format("%02d:%02d:%02d %s", (hora == 0 || hora == 24)? hora: hora % 12,
					minuto, segundo, (hora < 12)? "\"AM\"": "\"PM\"");//Sem This implicito (Opcional)
		}		
	}


