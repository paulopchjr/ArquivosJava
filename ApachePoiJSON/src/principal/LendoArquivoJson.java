package principal;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import classes.Produtos;

public class LendoArquivoJson {

	public static void main(String[] args) throws Exception {

		// Diretorio arquivo
		File arquivo = new File(
				"C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\ApachePoi\\ProdutoPoiJson.json");

		FileReader lerJson = new FileReader(arquivo);
		JsonArray jsonArray =(JsonArray) JsonParser.parseReader(lerJson);
		
		List<Produtos>listaProdutos = new ArrayList<Produtos>();
		
		for (JsonElement elementos : jsonArray) {
			Produtos produtos = new Gson().fromJson(elementos, Produtos.class);
			listaProdutos.add(produtos);
		}
		
		
		System.out.println("Ler arquivo json " + listaProdutos);
	}

}
