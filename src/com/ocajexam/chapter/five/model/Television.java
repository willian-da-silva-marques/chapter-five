package com.ocajexam.chapter.five.model;

public class Television {
	// Vari�veis de inst�ncia - S�o declaradas na classe, elas guardam o estado do
	// objeto e permanecer�o na mem�ria enquanto a inst�ncia da classe existir.
	int channel;
	boolean on;

	public Television(int channel, boolean on) {
		this.channel = channel;
		this.on = on;
	}

	public int getChannel() {
		return channel;
	}

	public boolean isOn() {
		return on;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nchannel: ").append(channel).append("\non: ").append(on);
		return sb.toString();
	}
}
