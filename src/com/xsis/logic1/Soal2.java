package com.xsis.logic1;

public class Soal2 {
	
	public static void main(String[] args) {
		int input = 8;
		int baris = input;
		int kolom = input;
		int i2 = input*2-2;
		for (int i = 0; i < baris; i++) {
			for(int j = 0; j < kolom; j++) {
				if(i+j == kolom-1){
					System.out.print(i2+"\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
			i2 = i2 - 2;
		}
		
		
		
		
		
	}

}
