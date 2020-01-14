package com.ocajexam.chapter.five.model;

import java.io.Serializable;
import java.util.Random;

public class Account implements Serializable, Comparable<Account> {

	private static final long serialVersionUID = 9069204315389144258L;

	private Long id;
	private String nome;
	private String email;
	
	public Account(String nome, String email) {
		this.id = this.getId();
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		Random random = new Random();
		int nextInt = 0;
		do {
			nextInt = random.nextInt(100);
			id = (long) nextInt;			
		} while(nextInt == 0);
		id = (long) nextInt;
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int compareTo(Account account) {
		return Integer.compare(this.id.intValue(), account.getId().intValue());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nId: ").append(id)
		.append("\nNome: ").append(nome)
		.append("\nEmail: ").append(email);
		return sb.toString();
	}
}
