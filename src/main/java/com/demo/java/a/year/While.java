package com.demo.java.a.year;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2006;
		int xs = 80000;
		while(xs <= 200000){
			year++;
			xs =(int)(xs * 1.25);
		}
		System.out.println(year);
		System.out.println(xs);
	}

}
