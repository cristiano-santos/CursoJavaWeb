package modulo.txt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		usuario1.setCpf("075.497.897-46");
		usuario1.setLogin("crispxt");
		usuario1.setSenha("123456");
		usuario1.setNome("Cristiano Peixoto");

		Usuario usuario2 = new Usuario();
		usuario2.setCpf("230.067.231-00");
		usuario2.setLogin("emily09");
		usuario2.setSenha("987456");
		usuario2.setNome("Emily Castelar");

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jsonUser = gson.toJson(usuarios);

		System.out.println(jsonUser);

		FileWriter filewriter = new FileWriter(
				"C:\\Users\\crist\\eclipse-workspace\\curso-java-web\\src\\modulo\\txt\\filjson.json");

		filewriter.write(jsonUser);
		filewriter.flush();
		filewriter.close();

		/*----------------------------------Lendo o arquivo JSON-------------------------------------*/

		FileReader fileReader = new FileReader(
				"C:\\Users\\crist\\eclipse-workspace\\curso-java-web\\src\\modulo\\txt\\filjson.json");

		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);

		List<Usuario> listusuarios = new ArrayList<Usuario>();

		for (JsonElement jsonElement : jsonArray) {

			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listusuarios.add(usuario);
		}

		System.out.println("Leitura do arquivo Json: " + listusuarios);
	}
}
