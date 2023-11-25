package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparaDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("05/11/2023");
		
		Date dataAtual = simpleDateFormat.parse("23/11/2023");
		
		if(dataVencimentoBoleto.after(dataAtual)) {
			System.out.println("Boleto em dia");
		}else {
			System.out.println("Boleto vencido - Realize o pagamento o quanto antes.");
		}
	}
}
