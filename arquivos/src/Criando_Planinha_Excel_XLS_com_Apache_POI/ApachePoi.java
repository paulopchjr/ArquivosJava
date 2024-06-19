package Criando_Planinha_Excel_XLS_com_Apache_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import Classes.Pessoa;

public class ApachePoi {

	public static void main(String[] args) throws Exception {

		File arquivo = new File(
				"C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\testeArquivos\\ApacheiPOi\\arquivo_excel1125454.xls");

		if (!arquivo.exists()) {
			arquivo.createNewFile();

			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			String qtd = JOptionPane.showInputDialog("Quantas pessoas desejam na lista?");
			for (int x = 0; x < Integer.parseInt(qtd); x++) {

				Pessoa pessoa = new Pessoa();
				String nome = JOptionPane.showInputDialog("nome da pessoa " + (x+1) + "?");
				String idade = JOptionPane.showInputDialog(" A sua idade " + (x+1) + "?");
				String telefone = JOptionPane.showInputDialog(" Telefone " + (x+1) + "?");
				pessoa.setNome(nome);
				pessoa.setIdade(Integer.parseInt(idade));
				pessoa.setTelefone(telefone);
				pessoas.add(pessoa);

			}
			
			
					/**OBJETO APACHE POI*/ 
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /* Escreve a planilha */
			HSSFSheet linhaPessoa = hssfWorkbook.createSheet("Lista de Pessoas"); // cria a planilha

			int numeroLinha = 0;
			for (Pessoa pessoa : pessoas) {
				Row linha = linhaPessoa.createRow(numeroLinha++); // criando linha na Planilha

				int celula = 0;

				Cell celNome = linha.createCell(celula++); // celula 1
				celNome.setCellValue(pessoa.getNome());

				Cell celIdade = linha.createCell(celula++); // celula 2
				celIdade.setCellValue(pessoa.getIdade());

				Cell celTelefone = linha.createCell(celula++); // celula 3
				celTelefone.setCellValue(pessoa.getTelefone());
			} // termino de montar a planinha

			
			FileOutputStream saida  = new FileOutputStream(arquivo);
			hssfWorkbook.write(saida); // escreve planinha em arquivo
			saida.flush();
			saida.close();
			
			
			
			
			System.out.println("Planinha criada");
		}
	}
}
