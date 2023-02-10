package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	
	private int cargaHoraria;
	
	//METODO ABSTRATO
	@Override
	public double calcularXp() {
		
		return XP_PADRAO * cargaHoraria;
	}
	
	
	
	//CONSTRUTOR
	public Curso() {
		
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	@Override
	public String toString() {
		
		return "Curso{" + 
				"titulo = " + getTitulo() + //PARA ACESSAR O TITULO NA CLASSE MÃE
				", descricao = " + getDescricao() +
				", cargaHoraria = " + cargaHoraria +
				"}";
	}

	
	
}
