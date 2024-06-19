package Lendo_Arquivo_txt_Criando_Lista_objeto;

public class Fruta {
	
	private String nome;
	private String valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 public void setValor(String valor) {
		this.valor = valor;
	}
	 
	 public String getValor() {
		return valor;
	}
	@Override
	public String toString() {
		return "Fruta [nome=" + nome + ", valor=" + valor + "]";
	}


	

}
