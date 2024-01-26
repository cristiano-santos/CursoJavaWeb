package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GeraParcelas {

	public static void main(String[] args) throws ParseException {
		
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("16/09/2023");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela numero " + parcela + " vencimento em " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
	}
}
