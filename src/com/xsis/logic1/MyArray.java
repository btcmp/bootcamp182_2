package com.xsis.logic1;

import java.util.Arrays;

public class MyArray {
	//tunggal
	public int baris=0;
	public int kolom=0;
	public String[][] matrix; 
	
	public void logicMatrix(int nganu) {
		baris = nganu;
		kolom = nganu;
		matrix = new String[baris][kolom];
		
		//isi matrix
		int ganjil = 1;
		int ganjil2 = nganu*2-2;
		for(int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if(i == j) {
					matrix[i][j]=ganjil + "";
				} else if(i+j == kolom - 1) {
					matrix[i][j]=ganjil2 + "";
				}
				
			}
			ganjil = ganjil + 2;
			ganjil2 = ganjil2 - 2;
		}
		
	}
	
	public static void contohStatic() {
		System.out.println("hallo static");
	}
	
	public void showMatrix() { //nganu parameter
		for(int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MyArray ma = new MyArray();
		MyArray ma2 = new MyArray();
		MyArray ma3 = new MyArray();
		int n = 9;
		ma.logicMatrix(n); //n argument
		ma.showMatrix();
		MyArray.contohStatic();
		//ma.exampleArray();
	}
}


//jamak
//public String[] data = new String[5];
//public void exampleArray() {
//System.out.println("jumlah baris : "+ baris);
//System.out.println("jumlah kolom : "+ kolom);
//data[0] = "jakarta";
//data[1] = "palembang";
//
////output : 
//System.out.println(Arrays.toString(data));
//}
