package com.java.alistirma;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int giris;
		double sonuc;
		double a,b;
		
		
		

		while (true) {
			System.out.println("---- Hesap Makinesi Menüsü ----");
			System.out.println("1 - Toplama");
			System.out.println("2 - Çıkarma");
			System.out.println("3 - Çarpma");
			System.out.println("4 - Bölme");
			System.out.println("5 - Üslü Sayı Hesaplama");
			System.out.println("6 - Mod Alma");
			System.out.println("7 - Karekök Hesaplama");
			System.out.println("8 - Faktöriyel Hesaplama\n");
			System.out.println("0 - Çıkış");
			
			System.out.print("Yapmak istedğiniz seçim nedir?  -> ");
			giris = input.nextInt();
			
			if (giris == 1) {
				System.out.println("Lütfen toplanacak 2 sayıyı giriniz.");
				System.out.print("Sayı 1 -> ");
				a = input.nextDouble();
				System.out.print("\nSayı 2 -> ");
				b = input.nextDouble();
				sonuc = a + b;
				System.out.println("Toplama İşleminin Sonucu  = " + sonuc);
				System.out.println(a + " + " + b + " = " + sonuc);
				
			}else if (giris == 2) {
				System.out.println("Lütfen çıkarılacak 2 sayıyı giriniz.");
				System.out.print("Sayı 1 -> ");
				a = input.nextDouble();
				System.out.print("\nSayı 2 -> ");
				b = input.nextDouble();
				sonuc = a - b;
				System.out.println("Çıkarma İşleminin Sonucu  = " + sonuc);
				System.out.println(a + " - " + b + " = " + sonuc);
				
				
			}else if (giris == 3) {
				System.out.println("Lütfen çarpılacak 2 sayıyı giriniz.");
				System.out.print("Sayı 1 -> ");
				a = input.nextDouble();
				System.out.print("\nSayı 2 -> ");
				b = input.nextDouble();
				sonuc = a * b;
				System.out.println("Çarpma İşleminin Sonucu  = " + sonuc);
				System.out.println(a + " x " + b + " = " + sonuc);
				
			}else if (giris == 4) {
				System.out.println("Lütfen bölünecek 2 sayıyı giriniz.");
				System.out.print("Sayı 1 -> ");
				a = input.nextDouble();
				System.out.print("\nSayı 2 -> ");
				b = input.nextDouble();
				sonuc = a / b;
				System.out.println("Bölme İşleminin Sonucu  = " + sonuc);
				System.out.println(a + " / " + b + " = " + sonuc);
				
			}else if (giris == 5) {
				System.out.println("Lütfen önce taban sonra üs olacak şekilde 2 adet sayı giriniz.");
				System.out.print("Taban Sayısını giriniz -> ");
				a = input.nextDouble();
				System.out.print("\nÜs sayısını giriniz -> ");
				b = input.nextDouble();
				sonuc = Math.pow(a, b);
				System.out.println("Toplama İşleminin Sonucu  = " + sonuc);
				System.out.println(a + " ^ " + b + " = " + sonuc);
				
			}else if (giris == 6) {
				System.out.println("Lütfen mod işlemi için 2 adet sayı giriniz.");
				System.out.print("Bölünecek sayıyı giriniz -> ");
				a = input.nextDouble();
				System.out.print("\nBölüm sayısını giriniz -> ");
				b = input.nextDouble();
				sonuc = a % b;
				int intSonuc = (int) sonuc; 
				System.out.println("Mod alma İşleminin Sonucu  = " + intSonuc);
				System.out.println(a + " % " + b + " = " + intSonuc);
				
			}else if (giris == 7) {
				System.out.println("Lütfen karekök ü alınacak sayıyı giriniz.");
				System.out.print("Bölünecek sayıyı giriniz -> ");
				a = input.nextDouble();
				sonuc = Math.sqrt(a);
				System.out.println("Karekök İşleminin Sonucu  = " + sonuc);
				System.out.println(a + "'nın karekökü  = " + sonuc);
				
			}else if (giris == 8) {
				System.out.println("Faktörüyel almak istediğiniz sayıyı giriniz ->");
				int c = input.nextInt();
				int cxc = 1;
				for (int i = 1 ; i <= c; i++) {
					cxc *= i;
				}
				System.out.println("Faktöriyel İşleminin Sonucu  = " + cxc);
				for (int i = c; i > 0; i--) {
		            System.out.print(i);
		            if (i > 1) {
		                System.out.print(" x ");
		            }
		        }
				System.out.println(" = " + cxc);
				
			}else if (giris == 0) {
				
				break;
			}else {
				System.out.println("Lütfen işlem yapılabilmesi için 1 ila 8 arasında bir sayı giriniz. \nÇıkış yapmak istiyorusanız 0 a tıklayıp enter tuşuna basınız.");
				
			}
		continue;	
		}
		
		input.close();
	}

}
