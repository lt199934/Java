package com.demo.java.c.七的倍数之和;

public class SumDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 7;
		int sum = 0;
		while(i <50){
			sum = sum +i;
			System.out.println("7的倍数："+i);
			System.out.println("和："+sum);
			i = i +7;
		}
	}
}
