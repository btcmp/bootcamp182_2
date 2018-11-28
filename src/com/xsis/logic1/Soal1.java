package com.xsis.logic1;

public class Soal1 {
	
	public static void main(String[] args) {
		int input = 9;
		int baris = input;
		int kolom = input;
		int i2 = 1;
		for (int i = 0; i < baris; i++) {
			for(int j = 0; j < kolom; j++) {
				if(i -j == 0){
					System.out.print(i2+"\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
			i2 = i2 + 2;
		}
		
		
		
		
		
	}

}
