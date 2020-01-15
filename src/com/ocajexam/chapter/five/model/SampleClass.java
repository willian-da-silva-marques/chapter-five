package com.ocajexam.chapter.five.model;

public class SampleClass {
	/**
	 * Mesmo sendo uma vari�vel de classe ou vari�vel est�tica 
	 * o valor "default" � atribuido da mesma forma que seria 
	 * se fosse uma vari�vel de inst�ncia. 
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
	 * M�todos est�ticos s� podem chamar vari�veis est�ticas e outros m�todos est�ticos 
	 */
	public static void sampleMethodOne() {
//		sampleMethodTwo();
		System.out.println("SampleMethodOne");
	}

	private void sampleMethodTwo() {
		System.out.println("SampleMethodTwo");
	}
}