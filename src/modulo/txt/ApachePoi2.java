package modulo.txt;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		FileInputStream entrada = new FileInputStream(
				"C:\\Users\\crist\\eclipse-workspace\\curso-java-web\\src\\modulo\\txt\\arquivo_excel.xls");

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /* Prepara a entrada para o arquivo excel ler */
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); /* Pega a primeira planilha do arquivo excel */

		Iterator<Row> linhaIterator = planilha.iterator();

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();

			Iterator<Cell> celulas = linha.iterator();

			Pessoa pessoa = new Pessoa();

			while (celulas.hasNext()) {
				Cell cell = celulas.next();

				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			}

			pessoas.add(pessoa);
		}

		entrada.close();

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
