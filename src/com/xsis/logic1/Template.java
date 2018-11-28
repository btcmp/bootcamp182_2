package com.xsis.logic1;

import java.util.concurrent.SynchronousQueue;

import com.xsis.utils.DeretAngka;

public class Template {

	int baris=0;
	int kolom=0;
	String[][] data;
	
	public void setMatrix(int n) {
		baris = n;
		kolom = n;
		data = new String[baris][kolom];
		int[] dataGanjil = DeretAngka.getOdd(n);
		int[] dataFib = DeretAngka.getFib(n);
		//isi matrix
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(i == j) {
					data[i][j] = String.valueOf(dataGanjil[i]);
				} else if(i+j == kolom - 1) {
					data[i][j] = dataFib[i] + "";
					
				}
			}
		}
	}
	
	
	public void showMatrix() {
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Template template = new Template();
		template.setMatrix(9);
		template.showMatrix();
	}
}
