package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2019-07-29T10:50:33z"));
		
		System.out.println(sdf.format(d));
		
		Calendar  cal = Calendar.getInstance(); //Instancia Calendario, passando getInstance().
		
		cal.setTime(d); //Set o objeto no padrao "d"
		int minutes = cal.get(Calendar.MINUTE); //Devolve a quantidade de minutos
		int month = 1 + cal.get(Calendar.MONTH); //Devolve o mes p/ o java, mes "Zero" = Janeiro (somar 1)
		
		cal.add(Calendar.HOUR_OF_DAY, 4); //Adiciona 4 horas do dia a data de "cal"
		d = cal.getTime(); //Atualiza "d" com a data do "cal"
		
		System.out.println(sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month); //Poderia ser somado 1 tbm na hora da impressao.
	}

}
