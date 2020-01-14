package com.ocajexam.chapter.five.model;

import java.io.Serializable;

public class Numero implements Serializable {

	private static final long serialVersionUID = -1304232240710513709L;

	private int value;

	public Numero(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}