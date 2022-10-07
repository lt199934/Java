package com.demo.oop.homework.counter;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Count count = new Count();
		Counter counter = new Counter();
		System.out.println("请输入一个字符串：");
		count.str1=sc.next();
		System.out.println("请输入要查找的字符：");
		count.str2=sc.next();
		counter.sreach(count);
	}

}
