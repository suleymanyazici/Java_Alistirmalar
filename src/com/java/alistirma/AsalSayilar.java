package com.java.alistirma;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Scanner;

public class AsalSayilar {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen 1 ile hangi sayılar arasındaki asal sayıları bulmak istediğinizi belirtini -> ");
		int a ;
		boolean asal = true;
		a = input.nextInt();
		
		ArrayList<Integer> array= new ArrayList<>();
		
		
		
		
		for( int i = 2; i <= a; i++) {
			asal = true;
			for( int x = 2; x <= i-1 ; x++) {
				
			if(i % x == 0) {
				asal = false;
				break;
			

			}
		}
			
		if(asal == true) {
			array.add(i);
		}
	}
	
		
		System.out.print(array);

}
}