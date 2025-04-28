package com.java.alistirma;

import java.util.Scanner;

public class CevreHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int r;
		double cevre, alan;
		
		System.out.print("Lütfen dairenin yarıçapının giriniz :");
		r = input.nextInt();
		
		cevre = 2 * Math.PI * r;
		alan = Math.PI * Math.pow(r, 2);
		
		System.out.println("Dairenin alanı   : " + alan);
		System.out.println("Dairenin çevresi : " + cevre);
	}

}
