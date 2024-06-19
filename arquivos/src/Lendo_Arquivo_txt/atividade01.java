package Lendo_Arquivo_txt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class atividade01 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo = new FileInputStream(new File("C:\\\\Users\\\\Junior\\\\Documents\\\\Curso Java\\\\Modulo 16 - Arquivos apache poi\\\\testeArquivos\\\\Arquivos5.txt"));
	
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		
		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			
			if(!linha.isEmpty() && linha != null) {
				System.out.println(linha);
			}
		}
	
	}

}
