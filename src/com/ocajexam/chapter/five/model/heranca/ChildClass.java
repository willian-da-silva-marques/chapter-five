package com.ocajexam.chapter.five.model.heranca;

/**
 * @since 15/01/2020 
 * @author willian
 * Classe filha
 */
public class ChildClass extends ParentClass {

	public ChildClass() {
		System.out.println("ChildClass Constructor");
	}
	
	public ChildClass(String s) {
		super(s);
		System.out.println("ChildClass Constructor " + s);
	}
	
	@Override
	public String className() {
		return "ChildClass -> " + super.className();
	}
}
