package modulo.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiJavaData {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual);
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e hora atuais: " + dataHoraAtual);
		
		/*Formatando Data e Hora*/
		
		System.out.println("Data e hora formatados: " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		System.out.println("Dia do mes " + localDate.getDayOfMonth());
		
		System.out.println("Dia da Semana " + localDate.getDayOfWeek().name());
		
		System.out.println("Dia do ano " + localDate.getDayOfYear());
		
		System.out.println("Ano: " + localDate.getYear());
		
		System.out.println("Mes: " + localDate.getMonth());
		
		
	}
}
