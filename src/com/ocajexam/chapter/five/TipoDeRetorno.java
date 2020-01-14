package com.ocajexam.chapter.five;

import java.util.ArrayList;
import java.util.List;

import com.ocajexam.chapter.five.model.Account;

public class TipoDeRetorno {

	static List<Account> accounts = new ArrayList<>();
	
	static {
		accounts.add(new Account("Ana", "ana@hotmail.com"));
		accounts.add(new Account("Bruna", "bruna@gmail.com"));
		accounts.add(new Account("Carolina", "corolina@gmail.com.br"));
		accounts.add(new Account("Diana", "diana@hotmail.com.br"));
	}

	public static void main(String[] args) {
		
		// Exemplos
		TipoDeRetorno retorno = new TipoDeRetorno();
		System.out.println(retorno.findAllAccounts());

	}

	public boolean isActive() {
		return true;
	}

	public int getCurrentTotal() {
		return 5;
	}
	
	public void processPendingData() {
		
	}
	
	public List<Account> findAllAccounts() {
		return accounts;
	}
}