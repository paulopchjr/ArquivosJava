package Escrevendo_E_Lendo_Arquivos_CSV_Planinha_Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Lendo_Arquivo_txt_Criando_Lista_objeto.Fruta;

public class LendoArquivoCsv {

	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File(
				"C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\testeArquivos\\fruta.csv");
		
		List<Fruta>frutas = new ArrayList<Fruta>();

		//// lendo arquivo
		Scanner lerArquivo = new Scanner(arquivo, "UTF-8");

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");

				Fruta fruta = new Fruta();
				fruta.setNome(dados[0]);
				fruta.setValor(dados[1]);

				frutas.add(fruta);

			}
		}
		
		for (Fruta fruta : frutas) {
				System.out.println(fruta);
		}	
		
	}
}
