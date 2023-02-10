package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		//INICIANDO UM OBJETO
		Curso curso1 = new Curso(); //new instancia um objeto
		curso1.setTitulo("Curso Java"); //setando-enviando a informação pra variável
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso(); //new instancia um objeto
		curso2.setTitulo("Curso JavaScript"); //setando-enviando a informação pra variável
		curso2.setDescricao("Descrição Curso JavaScript");
		curso2.setCargaHoraria(4);
		
		//CRIANDO CURSO() À PARTIR DA CLASSE CONTEÚDO - POLIMORFISMO
		//Conteudo conteudo = new Curso();
		
		
		
		//INICIANDO UM OBJETO
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria Java");
		mentoria.setData(LocalDate.now()); //AO CRIAR O OBJETO, IRÁ ATRIBUIR A DATA DE CRIAÇÃO
		
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		//INSTANCIAR UM BOOTCAMP E CRIAR OS DEVS
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		//CRIANDO OS DEVS
		Dev devMaria = new Dev();
		devMaria.setNome("Maria Clara");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devMaria.getConteudosInscritos());
		
		devMaria.progredir();
		devMaria.progredir();
		
		
		System.out.println("");
		System.out.println("Conteúdos Inscritos: " + devMaria.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());

		
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("");
		
		Dev devGustavo = new Dev();
		devGustavo.setNome("Gustavo");
		devGustavo.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devGustavo.getConteudosInscritos());
		
		devGustavo.progredir();
		
		System.out.println("");
		System.out.println("Conteúdos Inscritos: " + devGustavo.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devGustavo.getConteudosConcluidos());
		System.out.println("XP: " + devGustavo.calcularTotalXp());
		
		
	}

}
