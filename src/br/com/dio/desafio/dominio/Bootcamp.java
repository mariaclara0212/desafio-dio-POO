package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now(); //DATA ATUAL AO INSTÂNCIAR O BOOTCAMP
	private final LocalDate dataFinal = getDataInicial().plusDays(45); //DATA FINAL = DATA INICIAL + 45 DIAS
	
	private Set<Dev> devsInscritos = new HashSet<>(); //HASHSET - A ORDEM DOS INSCRITOS NÃO FAZ DIFERENÇA
	private Set<Conteudo> conteudos = new LinkedHashSet<>(); //A ORDEM DOS CONTEÚDOS IMPORTA
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Bootcamp bootcamp = (Bootcamp) obj;
		return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, dataFinal);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
	}
	
}
