package com.demo.oop.exciseEdu.构造方法和封装;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Structure s = new Structure();
		s.show();
		s = new Structure(12,"阿飞");
		s.show();
		System.out.println("请输入年龄：");
		int num=sc.nextInt();
		s.setAge(num);
		int a=s.getAge();
		System.out.println(a);
	}

}
