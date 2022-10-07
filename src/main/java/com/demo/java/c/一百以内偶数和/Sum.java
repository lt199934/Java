package com.demo.java.c.一百以内偶数和;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 2;

		int sum = 0;
		while (num % 2 == 0&&num <= 100){
			System.out.println("偶数："+num);
			System.out.println(sum);
			sum = sum + num;
			num = num +2;
		}
		System.out.println("偶数和："+sum);

		System.out.println("***************************************");
		int a1= 2;
		int a50 = 100;
		int Sn = ((a1 + a50)*50)/2;
		System.out.println("偶数和"+Sn);
	}
			
			
}
