package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasComJava {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Data em milesegundos: " + date.getTime());
		System.out.println("Calendar em milesegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mes: " + date.getDate());
		System.out.println("Calendar dia do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Calendar dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Calendar minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Calendar segundos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar ano: " + calendar.get(Calendar.YEAR));
		
		/*           Utilizando o SimpleDateFormat          */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Com formato padrao em String " + simpleDateFormat.format(date));
		System.out.println("Calendar com formato padrao em String " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Com formato para banco de dados " + simpleDateFormat.format(date));
		System.out.println("Calendar com formato para banco de dados " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date " + simpleDateFormat.parse("1978-09-16"));
	}
}
