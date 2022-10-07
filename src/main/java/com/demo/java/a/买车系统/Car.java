package com.demo.java.a.买车系统;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入您的存款：");
		int ck = sc.nextInt();
		if ( ck > 500){
			System.out.println("我就买凯迪拉克");
		}
		else if (ck > 100){
			System.out.println("我就买帕萨特");
		}
		else if (ck > 10){
			System.out.println("我就买奥托");
		}
		else {
			System.out.println("我就买捷安特");
		}
	}

}
