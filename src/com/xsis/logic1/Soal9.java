package com.xsis.logic1;

public class Soal9 {
	
	public static void main(String[] args) {
		int input = 9;
		int baris = input;
		int kolom = input;
		
		for (int i = 0; i < baris; i++) {
			int i2 = 1;
			for(int j = 0; j < kolom; j++) {
					System.out.print(i2+"\t");
					if(j <= kolom /2-1) {
						i2 = i2 + 2;
					} else {
						i2 = i2 - 2;
					}
				
			}
			System.out.println();
			
		}
	}

}
