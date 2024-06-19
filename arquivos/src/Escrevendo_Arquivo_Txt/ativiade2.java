package Escrevendo_Arquivo_Txt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Lendo_Arquivo_txt_Criando_Lista_objeto.Fruta;

public class ativiade2 {
	
	public static void main(String[] args) throws IOException {
		
		
		File arquivo = new File("C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\testeArquivos\\Arquivos5.txt");
		
		
		String qtd = JOptionPane.showInputDialog("Quantas frutas deseja ?");
		
		List<Fruta>frutas = new ArrayList<Fruta>();
		
		for(int i = 0; i < Integer.valueOf(qtd); i++ ) {
			
			
			String nomeFruta = JOptionPane.showInputDialog("Qual é o nome da fruta " + (i+1));
			String valor = JOptionPane.showInputDialog("Valor:");
			
			Fruta fruta = new Fruta();
			fruta.setNome(nomeFruta);
			fruta.setValor(valor);
			
			
			frutas.add(fruta);
		}
		
		
		if (!arquivo.exists()) {
			
			arquivo.createNewFile();
			
			
				
			FileWriter escrever_arquivo = new FileWriter(arquivo);
			
			 
			for (Fruta fruta : frutas) { 
				escrever_arquivo.write(fruta.getNome() +" ; "+ fruta.getValor() +"\n");
				
				
			}
			
			
			escrever_arquivo.flush();
			escrever_arquivo.close();
			
		}
	}

}
