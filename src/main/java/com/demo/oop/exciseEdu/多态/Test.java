package com.demo.oop.exciseEdu.多态;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Master master = new Master();
		System.out.println("请选择：1，老虎 2，兔子");
		int num =sc.nextInt();
		Animal a=master.getAnimal(num);
			System.out.println(a);
	}

}