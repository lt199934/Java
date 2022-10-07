package com.demo.oop.homework.calputer;

import java.util.Scanner;

public class CounterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Counter counter = new Counter();
		System.out.println("1,加号\t"+"2,减号\t"+"3,乘号\t"+"4,除号");
		System.out.println("请输入第一个数：");
		counter.num1=sc.nextDouble();
		System.out.println("请输入第一个数：");
		counter.num2=sc.nextDouble();
		System.out.println("请输入你要运算的符号：");
		int newnum = sc.nextInt();
		if(newnum == 1){
			counter.add(counter.num1, counter.num2);
		}else if(newnum == 2){
			counter.reduce(counter.num1, counter.num2);
		}else if(newnum == 3){
			counter.multiply(counter.num1, counter.num2);
		}else if(newnum == 4){
			counter.divide(counter.num1, counter.num2);
		}
		
		System.out.println("计算结果为："+counter.sum);
		
	}

}
