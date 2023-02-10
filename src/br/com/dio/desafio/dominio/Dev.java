package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	//<Conteudo> - CLASSE MÃE
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //COLOQUE NA MESMA ORDEM
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); //SET SÓ PERMITE ADICIONAR ELEMENTOS UNICOS
	
	//IRÁ INICIALMENTE SE INSCREVER NO BOOTCAMP
	public void inscreverBootcamp (Bootcamp bootcamp) {
		//pegando conteúdosincritos e adicionando dentro dele todos os conteúdos do bootcamp
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this); //pegamos o bootcamp e adicionamos o dev que se inscreveu no bootcamp
	}
	
	//AO REALIZAR AS TAREFAS ETC, IRÁ PROGREDIR DENTRO DO BOOTCAMP
	public void progredir() {
		//pegando em ordem
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		
		//se esse conteúdo existe
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get()); //pegando o conteúdo, e tornando em concluído
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	//QUANTO XP CONSEGUIU, COM A PROGRESSÃO DO BOOTCAMP
	public double calcularTotalXp() {
		
		//pegamos cada conteúdo de dentro de conteudosInscritos, pegamos o xp de cada conteúdo e somamos.
		 return this.conteudosInscritos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
		//return conteudosConcluidos;
		 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosIncsritos) {
		this.conteudosInscritos = conteudosIncsritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	
	//AO TRABALHAR COM HASH - ADICIONAR
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Dev dev = (Dev) obj;
		return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosInscritos, conteudosConcluidos);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
	}
	
}
