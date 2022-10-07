package com.demo.java.c.加分系统;
import java.util.Scanner;
public class Source {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double zhangsan = 67;
		double lisi = 76;
		double wangwu = 63;
		double average = (zhangsan + lisi + wangwu) / 3;
		do{
			zhangsan = zhangsan + 5;
			lisi = lisi +5;
			wangwu = wangwu +5;
			average = (zhangsan + lisi + wangwu) / 3;
			System.out.println(average);
		}while(average < 90);
		System.out.println("总共加分："+((average * 3) - (67 + 76 + 63)));
	}
}