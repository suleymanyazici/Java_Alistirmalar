package com.java.alistirma;

import java.util.Scanner;

public class KDV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		double fiyat;
		
		System.out.print("Ürün Fiyatını Giriniz : ");
		fiyat = input.nextDouble();
		double kdvlifiyat = fiyat * 1.2;
		
		System.out.println("KDV'li Fiyat aşağıdaki gibidir.\n      " + kdvlifiyat);
		
		

	}

}
