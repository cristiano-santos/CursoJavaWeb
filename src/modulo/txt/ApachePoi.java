package modulo.txt;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\\\crist\\eclipse-workspace\\curso-java-web\\src\\modulo\\txt\\arquivo_excel.xls");
		if (!file.exists()) {
			file.createNewFile();
		}

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("cristianopxt@gmail.com");
		pessoa1.setIdade(45);
		pessoa1.setNome("Cristiano Peixoto");

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("ana.castelar@gmail.com");
		pessoa2.setIdade(44);
		pessoa2.setNome("Ana Paula Castelar");

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("emily.09@gmail.com");
		pessoa3.setIdade(9);
		pessoa3.setNome("Emily Castelar");
		
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("cristina.maria@gmail.com");
		pessoa4.setIdade(69);
		pessoa4.setNome("Cristina Maria");

		/* Pode vir do banco de dados ou qualquer fonte de dados */
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /*Vai ser usado para escrever a planilha*/
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamento"); /*Criar a planilha*/
		
		int numeroLinha = 0;
		
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++ ); /*Criando a linha na planilha*/
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula ++);/*Celular 1*/
			celNome.setCellValue(p.getNome());
			
			
			Cell celemail = linha.createCell(celula ++); /*Celular 2 */
			celemail.setCellValue(p.getEmail());
			
			
			Cell celIdade = linha.createCell(celula ++); /*Celular 3*/
			celIdade.setCellValue(p.getIdade());
		
		}/*Termino de montrar a planilha*/
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);/*Escreve planilha em arquivo*/
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada");
	}
}
