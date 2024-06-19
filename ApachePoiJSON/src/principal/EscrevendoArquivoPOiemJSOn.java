package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import classes.Produtos;

public class EscrevendoArquivoPOiemJSOn {
	
	public static void main(String[] args) throws Exception {
		
		
		
		int condicao = JOptionPane.showConfirmDialog(null, "Deseja efetuar uma compra?");
		if(condicao == 1 && condicao == 2) {
			JOptionPane.showMessageDialog(null, " Saiu do Sistema");
		}else {
			
			
			List<Produtos>carrinho = new ArrayList<Produtos>();
			int controle =0;
			while (controle == 0) {
				
				int idProduto = 0;
				idProduto = idProduto+1;	
				String id  = String.valueOf(idProduto); // convertendo inteiro para String
				
				
				String nomeProduto = JOptionPane.showInputDialog("Qual é o nome do Produto ?");
				String valorProduto = JOptionPane.showInputDialog("Qual é o valor do produto ?");
				
				Produtos produtos = new Produtos(Long.valueOf(id), nomeProduto, BigDecimal.valueOf(Long.valueOf(valorProduto)));
				carrinho.add(produtos);
				
				controle = JOptionPane.showConfirmDialog(null, "Deseja addiconar mais produtos no carrinho ?");
				
			}
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String JsoProduto = gson.toJson(carrinho);
			
			FileWriter fileWriter = new FileWriter("C:\\Users\\Junior\\Documents\\Curso Java\\Modulo 16 - Arquivos apache poi\\ApachePoi\\ProdutoPoiJson.json");
			fileWriter.write(JsoProduto);
			fileWriter.flush();
			fileWriter.close();
			
			for (Produtos produtos : carrinho) {
				System.out.println(produtos);
				
			}
			
		}
	}

}
