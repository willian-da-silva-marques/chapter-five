package com.ocajexam.chapter.five;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ocajexam.chapter.five.model.Pessoa;

public class PessoaTest {

	private static List<Pessoa> pessoas = new ArrayList<>();

	public static void main(String[] args) {

		Pessoa pessoaA = new Pessoa().setNome("Elena").setDataDeNascimento(LocalDate.of(1997, 2, 10)).build();

		Pessoa pessoaB = new Pessoa().setNome("Beatriz").setDataDeNascimento(LocalDate.of(1961, 12, 30)).build();

		Pessoa pessoaC = new Pessoa().setNome("Diana").setDataDeNascimento(LocalDate.of(1900, 3, 03)).build();

		Pessoa pessoaD = new Pessoa().setNome("Caroline").setDataDeNascimento(LocalDate.of(1978, 8, 23)).build();

		Pessoa pessoaE = new Pessoa().setNome("Ana").setDataDeNascimento(LocalDate.of(1991, 9, 30)).build();
		
		pessoaE.getIdade();
		
		{
			pessoas.add(pessoaA);
			pessoas.add(pessoaB);
			pessoas.add(pessoaC);
			pessoas.add(pessoaD);
			pessoas.add(pessoaE);
		}
		
		pessoas.stream().map(Pessoa::getIdade).forEach(System.out::println);
	}
}