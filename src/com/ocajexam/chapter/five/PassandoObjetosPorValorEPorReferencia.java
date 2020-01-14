package com.ocajexam.chapter.five;

import com.ocajexam.chapter.five.model.Numero;

public class PassandoObjetosPorValorEPorReferencia {

	public static void main(String[] args) {
		int value = 1;
		System.out.println("--------------addTwo primitive-------------");
		System.out.println("Argument: value = " + value);
		addTwo(value);
		System.out.println("After method call: value = " + value);
		System.out.println("--------------addTwo primitive-------------");
		
		Numero numero = new Numero(1);
		System.out.println("--------------addTwo reference-------------");
		System.out.println("Argument: value = " + numero.getValue());
		addTwo(numero);
		System.out.println("After method call: value = " + numero.getValue());
		System.out.println("--------------addTwo reference-------------");
		
		byte byteValue = 2;
		System.out.println("--------------addTwo primitive with return-------------");
		System.out.println("Argument: byteValue = " + byteValue);
		addTwo(byteValue);
		System.out.println("After method call: byteValue = " + byteValue);
		System.out.println("--------------addTwo primitive with return-------------");
	}

	/**
	 * Quando um primitivo � usado como argumento, uma c�pia do valor do mesmo e feita e fornecida para o m�todo.
	 * 
	 */
	private static void addTwo(int value) {
		System.out.println("Parameter: value = " + value);
		value += 2;
		System.out.println("Leaving method: value = " + value);
	}
	
	/**
	 * Quando um objeto � usado como argumento, uma refer�ncia do mesmo � fornecida para o m�todo.
	 * 
	 */
	private static void addTwo(Numero numero) {
		System.out.println("Parameter: value " + numero.getValue());
		numero.setValue(numero.getValue() + 2);
		System.out.println("Leaving method: value = " + numero.getValue());
	}
	
	/* D�VIDA
		comportamento do m�todo abaixo n�o � o mesmo do m�todo addTwo com a referencia?
		Ele vai alterar o valor e retornar agora o valor alterado
	*/
	private static int addTwo(byte byteValue) {
		System.out.println("Parameter: byteValue = " + byteValue);
		byteValue += 2;
		System.out.println("Leaving method: byteValue = " + byteValue);
		return byteValue;
	}
}
