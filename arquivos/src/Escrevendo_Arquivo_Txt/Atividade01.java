package Escrevendo_Arquivo_Txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Atividade01 {
	
	public static void main(String[] args) throws IOException {
		File  arquivo = new File("C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\testeArquivos\\arquivo.txt");
		
		if(!arquivo.exists()) { // se o aquivo nao exite
		// criando o arquivo
			arquivo.createNewFile();
			
		}
		
		// escreve no arquivo
		FileWriter escrever_arquivo  = new FileWriter(arquivo);
		
		escrever_arquivo.write("Texto do arquivo 07/05");
		escrever_arquivo.write(" \n PAulo Cezar Henrique Junior");
		escrever_arquivo.flush(); // grava as alteraoções do arquivo
		escrever_arquivo.close(); // fecha o arquivo
	}

}
