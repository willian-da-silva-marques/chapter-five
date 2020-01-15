package com.ocajexam.chapter.five.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Pessoa implements Serializable, Comparable<Pessoa> {

	private static final long serialVersionUID = 7495052732695782939L;

	private Long id;
	private String nome;
	private LocalDate dataDeNascimento;
	
	public Pessoa() {}
	
	public Pessoa(String nome, LocalDate dataDeNascimento) {
		this.id = this.getId();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}

	public Long getId() {
		Random random = new Random();
		long nextInt = 0;
		do {
			nextInt = random.nextInt(100);
		} while (nextInt == 0);
		id = nextInt;
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Pessoa setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public Pessoa setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
		return this;
	}
	
	public Pessoa build() {
		return new Pessoa(nome, dataDeNascimento);
	}
	
	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period period = Period.between(dataDeNascimento, hoje);
		return period.getYears();
	}
	
	@Override
	public int compareTo(Pessoa p) {
		return this.nome.compareTo(p.getNome());
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder
		.append("\nid: ").append(id)
		.append("\nnome: ").append(nome)
		.append("\ndataDeNascimento: ").append(dataDeNascimento);
		return stringBuilder.toString();
	}
}