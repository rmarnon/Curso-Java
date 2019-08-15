package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //Formato p data
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Formato para data/hora 
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));//Hora de Greenwich "0" sem abater o UTC
		
		Date y1 = sdf1.parse("21/07/2019");//Parse converte a String p/ formato "sdf1" e joga pra y1
		Date y2 = sdf2.parse("21/07/2019 11:48:07");
		Date y3 = Date.from(Instant.parse("2019-07-21T12:09:13z"));//Data Padrao ISO 8601 padrao UTC - 3hs
		//Classe Instant, funcao parse converte o padrao ISO 8601 pro padrao Date, usando Date.from()
		
		Date x1 = new Date(); //Instancia data com horario atual.
		Date x2 = new Date(System.currentTimeMillis());
		//Pega instante do sistema, converte p milisegundos e cria data com esse valor.
		
		Date x3 = new Date(0); //Imprime 3 horas antes porque BRT = -3:00 e comecou a ser contado em 1970.
		Date x4 = new Date(1000 * 60 * 60 * 8);
		//1 Segundo = 1000 milisegundos; 1 Minuto = 60 segundos; 1 Hora = 60 segundos; 8-3(UTC) = 5 Horas
		
		System.out.println("------------------------------------");
		System.out.println("Horario sem formatar: "); //Padrao do Java
		System.out.println();
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		System.out.println("ISO 8601: " + y3);	
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		System.out.println("X3: " + x3);
		System.out.println("X4: " + x4);
		System.out.println("------------------------------------");
		System.out.println("Horario do Brasil BRT: ");//Formatacao padrao sdf2
		System.out.println();
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("ISO 8601: " + sdf2.format(y3));	
		System.out.println("X1: " + sdf2.format(x1));
		System.out.println("X2: " + sdf2.format(x2));
		System.out.println("X3: " + sdf2.format(x3));
		System.out.println("X4: " + sdf2.format(x4));
		System.out.println("------------------------------------");
		System.out.println("Horario de Greenwich GMT: ");
		System.out.println();
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("ISO 8601: " + sdf3.format(y3));	
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
		System.out.println("------------------------------------");
		}

}
