package com.Batch8Ujian1.MenggambarDenganJava;

import java.util.Scanner;

public class MenggambarDenganJava {
	private String jenisGambar = "";
	
	
	public String getJenisGambar() {
		return jenisGambar;
	}
	public void setJenisGambar(String jenisGambar) {
		this.jenisGambar = jenisGambar;
	}
	
	
	public void GambarKotak (String kotak) {
		this.jenisGambar = kotak;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang kotak yang diinginkan : ");
		int panjang = scan.nextInt();
		System.out.print("Masukkan lebar kotak yang diinginkan : ");
		int lebar = scan.nextInt();
		
		for (int x = 0; x < panjang; x++) {
			for(int y = 0; y < lebar; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void GambarSegitiga (String segitiga) {
		this.jenisGambar = segitiga;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan tinggi segitiga yang diinginkan : ");
		int panjang = scan.nextInt();
	
		
		for (int x = 0; x < panjang; x++) {
			for(int y = 0; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void GambarSegitigaTerbalik (String segitigaterbalik) {
		this.jenisGambar = segitigaterbalik;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan tinggi segitiga yang diinginkan : ");
		int panjang = scan.nextInt();
	
		
		for (int x = 0; x <= panjang; x++) {
			for(int y = x; y < panjang; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void GambarSelangSeling (String selangseling) {
		this.jenisGambar = selangseling;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan tinggi segitiga yang diinginkan : ");
		int panjang = scan.nextInt();
		int nilai = 0;
		
		for (int x = 0; x <= panjang; x++) {
			for(int y = x; y < panjang; y++) {
				nilai++;
				if (nilai % 2 == 0) {
					System.out.print("!");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	public void GambarCampur (String campur) {
		this.jenisGambar = campur;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang persegi yang diinginkan : ");
		int panjang = scan.nextInt();
	
		
		for (int x = 0; x < panjang; x++) {
			for(int y = 0; y <= panjang; y++) {
				if(y <= x) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}
	public void GambarGabung (String gabung) {
		this.jenisGambar = gabung;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan panjang bidang datar yang diinginkan : ");
		int panjang = scan.nextInt();
		int nilai = 0;
	
		
		for (int x = 0; x < panjang; x++) {
			for(int y = 0; y <= panjang; y++) {
				if(y <= x) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
		for (int x = 0; x <= panjang; x++) {
			for(int y = x; y < panjang; y++) {
				nilai++;
				if (nilai % 2 == 0) {
					System.out.print("!");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	public void hasil() {
		System.out.println("Berikut adalah gambar " + this.jenisGambar + ".");
		System.out.println("");
		System.out.println("================================================");
		System.out.println("|  Terimakasih telah menggunakan program ini!  |");
		System.out.println("|       Created by : Kevin Aditya Sadewo       |");
		System.out.println("================================================");
	}
}
