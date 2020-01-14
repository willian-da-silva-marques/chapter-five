package com.ocajexam.chapter.five;

public class MathTools {

	public int findLowerValue(int numberOne, int numberTwo) {
		int result;
		if (numberOne < numberTwo)
			result = numberOne;
		else
			result = numberTwo;
		return result;
	}

	public double findLowerValue(double numberOne, double numberTwo) {
		double result;
		if (numberOne < numberTwo)
			result = numberOne;
		else
			result = numberTwo;
		return result;
	}

	public static void main(String[] args) {
		MathTools mathTools = new MathTools();
		int x = 13;
		int y = 13;
		int lowesInt = mathTools.findLowerValue(x, y);
		System.out.println("Result1 : " + lowesInt);
		System.out.println("Result2 : " + mathTools.findLowerValue(x, y));
	}
}