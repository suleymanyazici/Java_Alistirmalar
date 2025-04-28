package com.java.alistirma;

import java.util.Scanner;

public class BuyuktenKucuge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		int array[] = new int[5];
		
		for(int x = 0; x <= 4; x++) {
			System.out.print("Lütfen dizinin " + x + " numaralı elemanını giriniz : ");
			array[x] = input.nextInt();
		}
		
		System.out.println("\nDizinin büyükten küçüğe sıralanmış hali aşağıdaki gibidir.\n");
		
		for(int i = 0; i < 4; i++) {
			for(int j = i+1; j < 5;j++) {
				
				if(array[j] > array[i]) {
					a = array[i];
					array[i] = array[j];
					array[j] = a;	
				
				}
			}
		}
		for(int i = 0 ; i < 5; i++) {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + array[i]);
		}
		
	}

}
