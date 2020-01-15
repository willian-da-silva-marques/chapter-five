package com.ocajexam.chapter.five.model.heranca;
/**
 * @since 15/01/2020
 * @author willian
 * Classe pai
 */
public class ParentClass {

	public ParentClass() {
		System.out.println("ParentClass Constructor");
	}
	
	public ParentClass(String s) {
		System.out.println("ParentClass Constructor " + s);
	}
	
	public String className() {
		String name = ParentClass.class.getName().substring(40);
		return name;
	}
}
