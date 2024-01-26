package modulo.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataLocaldate {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2020-05-09");
		
		System.out.println("Mais 05 dias: " + (dataBase = dataBase.plusDays(5)));
		System.out.println("Mais 05 meses: " + (dataBase = dataBase.plusMonths(5)));
		//System.out.println("Mais 01 semanas: " + (dataBase = dataBase.plusWeeks(1)));//adiciona semana a ultima entrada
		System.out.println("Mais 10 anos: " + (dataBase = dataBase.plusYears(10)));
		
		System.out.println("Menos 15 dias: " + (dataBase = dataBase.minusDays(15)));
		System.out.println("Menos 08 meses: " + (dataBase = dataBase.minusMonths(8)));
		System.out.println("Menos 06 anos: "  + (dataBase = dataBase.minusYears(6)));
		
		LocalDate dataBoleto = LocalDate.parse("2023-12-01");
		
		for (int data = 1; data <= 12; data++) {
			dataBoleto = dataBoleto.plusMonths(1);
			System.out.println("Data de vencimento: " + dataBoleto.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " da parcela: " + data);
		}
	}
}
