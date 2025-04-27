package com.java.alistirma;

import java.util.Scanner;



public class JavaNotOrtalamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int quizNot, vizeNot, finalNot;
		double ort;
		String isim  = "";
		
		
		System.out.print("Öğrenci İsmini Giriniz : ");
		isim  = input.next();
		
		System.out.print( isim + " isimli öğrencinin Quiz notunu giriniz  : ");
		quizNot = input.nextInt();
		
		while (quizNot < 0 || quizNot > 100) {
			quizNot = 0;
			System.out.println("Hatalı giriş yaptınız lütfen 0 ile 100 arasında bir not giriniz");
			System.out.print( isim + " isimli öğrencinin Quiz notunu giriniz  : ");
			quizNot = input.nextInt();
			
		}
		
		System.out.print( isim + " isimli öğrencinin Vize notunu giriniz  : ");
		vizeNot = input.nextInt();

		while(vizeNot < 0 || vizeNot > 100) {
			vizeNot = 0;
			
			System.out.println("Hatalı giriş yaptınız lütfen 0 ile 100 arasında bir not giriniz");
			System.out.print( isim + " isimli öğrencinin Vize notunu giriniz  : ");
			vizeNot = input.nextInt();
		}
		
		System.out.print( isim + " isimli öğrencinin Final notunu giriniz  : ");
		finalNot = input.nextInt();
		
		while (finalNot < 0 || finalNot > 100) {
			finalNot = 0;
			System.out.println("Hatalı giriş yaptınız lütfen 0 ile 100 arasında bir not giriniz");
			System.out.print( isim + " isimli öğrencinin Final notunu giriniz  : ");
			finalNot = input.nextInt();
			
		}
		
		ort = ((quizNot * 0.2) + (vizeNot * 0.35) + (finalNot * 0.45));
		
		System.out.println(isim + " isimli öğrencinin not ortalaması : " + ort);
		
		if (ort < 50) {
			System.out.println("Öğrencinin karne notu  1 dir. \nSınıfta Kaldı.");
		} else if (ort >= 50 && ort < 60 ) {
			System.out.println("Öğrencinin karne notu  2 dir. \nGeçti");
		} else  if (ort >= 60 && ort < 70) {
			System.out.println("Öğrencinin karne notu  3 tür. \nGeçti");
		}else if (ort >= 70 && ort < 85) {
			System.out.println("Öğrencinin karne notu  4 tür. \nGeçti");
		}else {
			System.out.println("Öğrencinin karne notu  5 tir. \nGeçti");

		}
		
		

	}
}


