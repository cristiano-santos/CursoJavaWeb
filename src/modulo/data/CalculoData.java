package modulo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculoData {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("23-11-2023"));
		
		calendar.add(Calendar.DAY_OF_MONTH, -9);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 3);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 45);
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
