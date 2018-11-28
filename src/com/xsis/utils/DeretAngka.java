package com.xsis.utils;

import java.util.Arrays;

public class DeretAngka {

	//1,1,1,..
	public static int[] getOne(int n) {
		int[] data = new int[n];
		for(int i = 0; i < n; i++) {
			data[i] = 1;
		}
		return data;
	}
	
	//1,2,3,4,5,...
	public static int[] getIncrement(int n) {
		int[] data = new int[n];
		int index = 0;
		for (int i = 0; i < n; i++) {
			data[index] = i;
			index++;
		}
		return data;
	}
	//1,3,5,7,9
	public static int[] getOdd(int n) {
		int[] data = new int[n];
		//System.out.println("n adalah : " + n);
		int hasil = 1;
		for(int i = 0; i < n; i++) {
			//System.out.println("hasil : "+ hasil+", index : "+ i);
			data[i] = hasil;
			hasil = hasil + 2;
		}
		
		return data;
	}
	
	//1,1,2,3,5,8..
	public static int[] getFib(int n) {
		int[] data = new int[n];
		data[0] = 1;
		data[1] = 1;
		for(int i = 2; i< n; i++) {
			data[i] = data[i - 1] + data[i - 2];
		}
		return data;
	}
	
	//1,1,1,3,5,9...
	public static int[] tribo(int n) {
		int[] data = new int[n];
		data[0] = 1;
		data[1] = 1;
		data[2] = 1;
		for(int i = 3; i< n; i++) {
			data[i] = data[i - 1] + data[i - 2] + data[i - 3];
		}
		return data;
	}
	
	
	public static void main(String[] args) {
		int[] temp = DeretAngka.getOne(5);
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(DeretAngka.getIncrement(10)));
		int[] data = DeretAngka.getOdd(6);
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.toString(DeretAngka.getFib(9)));
		System.out.println(Arrays.toString(DeretAngka.tribo(9)));
	}
}
