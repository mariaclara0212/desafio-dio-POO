package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//CLASSE FILHA - EXTENDS
public class Mentoria extends Conteudo {

	//MODIFICADOR DE ACESSO PRIVATE
	//SÓ PODEMOS TER ACESSO A ESSES ATRIBUTOS, ATRAVÉS DOS MÉTODOS GET E SET
	private LocalDate data;
	
	//MÉTODO CALCULAR XP - herdado da classe mãe
	@Override
	public double calcularXp() {
		
		return XP_PADRAO + 20d; //AO CRIAR UMA MENTORIA E CHAMAR O MÉTODO calcularXp, O xp referente a mentoria vai ser o xp padrão + 20
	}
	
	//CONSTRUTOR
	public Mentoria() {
		
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return "Mentoria{" + 
		"titulo = " + getTitulo() +
		", descricao = " + getDescricao() +
		", datas = " + data +
		"}";
	}



	
}
