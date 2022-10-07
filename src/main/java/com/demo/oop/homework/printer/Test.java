package com.demo.oop.homework.printer;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Box box = null;
		System.out.println("请选择：1，彩色打印2，黑白打印");
		int a =sc.nextInt();
		System.out.println("请输入打印内容：");
		String temp = sc.next();
		if(a==1){
			box=new ColorBox();
		}else if(a==2){
			box=new BlackBox();
		}
		Printer printer = new Printer();
		printer.print(box, temp);
		
	}

}
