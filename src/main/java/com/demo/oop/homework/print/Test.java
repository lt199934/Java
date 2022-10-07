package com.demo.oop.homework.print;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Printer printer = new Printer();
		Box box = null;
		Paper p = null;
		System.out.println("请选择墨盒：1，彩色打印2，黑白打印");
		int a =sc.nextInt();
		System.out.println("请选择纸张：1，A4纸张2，B5纸张");
		int b =sc.nextInt();
		System.out.println("请输入打印内容：");
		String temp = sc.next();
		if(a==1){
			box=new ColorBox();
		}else if(a==2){
			box=new BlackBox();
		}
		if(b==1){
			p=new A4();
		}else if(b==2){
			p=new B5();
		}
		
		printer.print(box, temp,p);
		
	}

}
