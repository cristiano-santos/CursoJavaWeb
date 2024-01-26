package modulo.txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {

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

		File arquivo = new File("C:\\Users\\crist\\eclipse-workspace\\curso-java-web\\src\\modulo\\txt\\arquivo.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter escrever_no_arquivo = new FileWriter(arquivo);

		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}

		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();

	}
}
