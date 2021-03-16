package com.Batch8Ujian1.MenggambarDenganJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MenggambarDenganJava jenis = new MenggambarDenganJava();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan gambar yang ingin ditampilkan : ");
		
//		Yang terdapat dalam program ini :
//			1. Kotak
//			2. Segitiga
//			3. Segitiga Terbalik
//			4. Selang Seling
//			5. Campur
//			6. Gabung
			
		String jawab = input.next().toLowerCase();
		switch (jawab) {
		case "kotak":
			jenis.GambarKotak("Kotak");
			jenis.hasil();
			break;
			
		case "segitiga":
			jenis.GambarSegitiga("Segitiga");
			jenis.hasil();
			break;
			
		case "segitigaterbalik":
			jenis.GambarSegitigaTerbalik("SegitigaTerbalik");
			jenis.hasil();
			break;
			
		case "selangseling":
			jenis.GambarSelangSeling("Selang-seling");
			jenis.hasil();
			break;
			
		case "campur":
			jenis.GambarCampur("Campur");
			jenis.hasil();
			break;
			
		case "gabung":
			jenis.GambarGabung("Gabung");
			jenis.hasil();
			break;
			
			default:
				System.out.println("Maaf, gambar yang dimaksud tidak terdapat dalam program ini.");
				break;
		}
	}

}
