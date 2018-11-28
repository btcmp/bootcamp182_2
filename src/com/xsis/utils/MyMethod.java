package com.xsis.utils;

public class MyMethod {

	public String getUsername() {
		return "sujana";
	}
	
	public double salary() {
		return 23.9;
	}
	
	//void
	public void tampilin() {
		System.out.println("name : "+ getUsername());
		System.out.println("gaji : "+ salary());
	}
	
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();
		mm.tampilin();
		String name = mm.getUsername(); //"dita";
		double gaji = mm.salary();
		System.out.println("name :" + mm.getUsername());
		System.out.println("gaji : "+ gaji);
	}
}
