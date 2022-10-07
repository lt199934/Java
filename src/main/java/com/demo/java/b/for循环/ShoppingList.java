package com.demo.java.b.for循环;

import java.util.Scanner;
/**
 * @Program: java
 * @ClassName Score
 * @Author: liutao
 * @Description: 输入金额循环打印金额和运算
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class ShoppingList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[]list = new double[5];
		for(int i=0; i<list.length; i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			list[i] = sc.nextDouble();
		}
		double sum=0;
		System.out.println("序号\t\t金额（元）");
		for(int i=0; i<list.length; i++){
			System.out.println((i+1)+"\t\t"+list[i]);
			sum+=list[i];
		}
		System.out.println("总金额\t\t"+sum);
	}
}
