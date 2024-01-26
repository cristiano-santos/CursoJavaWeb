package modulo.data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class DataChronoUnit {

	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1978-09-16"),LocalDate.now());
		//System.out.println("Eu tenho " + dias + " dias de idade.");
		JOptionPane.showMessageDialog(null,"Eu tenho " + dias + " dias de idade");
	}
}
