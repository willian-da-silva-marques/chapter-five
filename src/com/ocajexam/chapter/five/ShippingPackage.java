package com.ocajexam.chapter.five;

import java.math.BigDecimal;

/**
 * @since 15/01/2020
 * @author willian
 * 
 * Exemplo de classe com variável estática também conhecida como variável de classe 
 *
 */
public class ShippingPackage {

	private static final BigDecimal PI = new BigDecimal(Math.PI);
	
	public static int nextTrackingNumber = 100000;
	private int packageTrackingNumber;

	public ShippingPackage() {
		this.packageTrackingNumber = nextTrackingNumber;
		nextTrackingNumber++;
	}

	public int getPackageTrackingNumber() {
		return packageTrackingNumber;
	}
	
	public static void main(String[] args) {
		ShippingPackage packageOne = new ShippingPackage();
		ShippingPackage packageTwo = new ShippingPackage();
		ShippingPackage packageTree = new ShippingPackage();
		
		System.out.println("Package One Tracking: " + packageOne.getPackageTrackingNumber());
		System.out.println("Package Two Tracking: " + packageTwo.getPackageTrackingNumber());
		System.out.println("Package Tree Tracking: " + packageTree.getPackageTrackingNumber());
		System.out.println("PI: " + ShippingPackage.PI);
	}
}