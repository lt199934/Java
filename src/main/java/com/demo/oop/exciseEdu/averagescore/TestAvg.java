package com.demo.oop.exciseEdu.averagescore;

import java.util.Scanner;

public class TestAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Avg avg = new Avg();
		System.out.print("请输入java成绩：");
		avg.a=sc.nextInt();
		System.out.print("请输入c#成绩：");
		avg.b=sc.nextInt();
		System.out.print("请输入DB成绩：");
		avg.c=sc.nextInt();

		avg.sum();
		int te = avg.avgTest();
		System.out.println("平均成绩为："+te);
	}

}
