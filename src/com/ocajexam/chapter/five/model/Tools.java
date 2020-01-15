package com.ocajexam.chapter.five.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @since 15/01/2020
 * @author willian.marques
 * Exemplo de Classe com método estático 
 */
public class Tools {

	public static String getData() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dateTimeFormatter.format(LocalDate.now());
	}
	
	public static void main(String[] args) {
		System.out.println(Tools.getData());
	}
}
