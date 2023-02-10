package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	//CONSTANTE - ESTÁTICO PARA PODER SER ACESSO FORA DA CLASS CONTEUDO
	protected static final double XP_PADRAO = 10;

	//XP_PADRAO SERÁ FILHO DA CLASS CONTEÚDO
	
	//CLASSE ABSTRATA - NÃO CONSIGO CRIAR UM CONTEÚDO FORA DESTA CLASSE, À NÃO SER A CLASSE FILHA
	
	private String titulo;
	private String descricao;
	
	
	//AS CLASSES FILHAS QUE EXTENDEREM DA CLASS CONTEUDO, SERÃO OBRIGADAS A IMPLEMENTAR UMA LÓGICA NO MÉTODO
	public abstract double calcularXp();


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
