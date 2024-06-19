package Lendo_Arquivo_txt_Criando_Lista_objeto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner lerArquivo = new Scanner(new File(
				"C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\testeArquivos\\Arquivos5.txt"));

		List<Fruta> frutas = new ArrayList<Fruta>();

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			if (!linha.isEmpty() && linha != null) {
				String[] dados = linha.split("\\;");

				Fruta fruta = new Fruta();
				fruta.setNome(dados[0]);
				fruta.setValor(dados[1]);

				frutas.add(fruta);

			}

		}
		double total = 0.0;
		for (Fruta fruta : frutas) {
			System.out.println(fruta);
			total += Double.parseDouble(fruta.getValor());
		}

		System.out.println("Total: " + total);

	}

}
