package com.ocajexam.chapter.five;

public class LogManager {

	public void logInfo(String messageError, int codeError) {
		System.out.println("Error: " + codeError + " | " + messageError);
	}
	
	public void logInfo(String messageError) {
		logInfo(messageError, -1);
	}
	
	public static void main(String[] args) {
		LogManager logManager = new LogManager();
		logManager.logInfo("First log message", -299);
		logManager.logInfo("Second log message");
	}
}
