package modulo.data;

import java.time.LocalDate;
import java.time.Period;

public class ObjetoPeriod {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(1978, 9, 16);
		
		LocalDate dataAtual = LocalDate.of(2023, 12, 01);
		
		System.out.println("Data antiga é maior que atual: " + dataAntiga.isAfter(dataAtual));
		
		System.out.println("Data antiga é anterior a data atual: " + dataAntiga.isBefore(dataAtual));
		
		System.out.println("Datas são iguais: " + dataAntiga.equals(dataAtual));
		
		
		Period periodo = Period.between(dataAntiga, dataAtual);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		System.out.println("Quantos meses: " + periodo.getMonths());
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("Total do periodo: " + periodo.getYears() + " anos " + periodo.toTotalMonths() + " meses e " + periodo.getDays() + " dias.");
	}
}
