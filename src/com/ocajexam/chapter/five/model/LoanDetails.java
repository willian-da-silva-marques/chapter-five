package com.ocajexam.chapter.five.model;

public class LoanDetails {

	private int term;
	private double rate;
	private double principal;

	public LoanDetails(int term, double rate, double principal) {
		this.term = term;
		this.rate = rate;
		this.principal = principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double monthlyPayment() {
		return (rate * principal / 12) / (1.0 - Math.pow(((rate / 12) + 1.0), (-term)));
	}
	
	public LoanDetails() {
		this(180, 0.0265, 0);// chama o construtor que recebe os tres parâmetros
	}
}
