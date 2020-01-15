package com.ocajexam.chapter.five.model;

public class SampleClass {
	/**
	 * Mesmo sendo uma variável de classe ou variável estática 
	 * o valor "default" é atribuido da mesma forma que seria 
	 * se fosse uma variável de instância. 
	 */
	private static int currentCount;
	private boolean onOff;
	
	public SampleClass() {
		currentCount++;
	}

	public void increaseCount() {
		currentCount++;
	}
	
	/**
	 * Métodos estáticos só podem chamar variáveis estáticas e outros métodos estáticos 
	 */
	public static void sampleMethodOne() {
//		sampleMethodTwo();
		System.out.println("SampleMethodOne");
	}

	private void sampleMethodTwo() {
		System.out.println("SampleMethodTwo");
	}
}