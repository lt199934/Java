package com.demo.java.b.猜数游戏.猜指定位数;

import java.util.Scanner;

public class Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] zhi = {8,4,2,2,23,344,12};
		System.out.println("-------循环打印-------");
		for(int i=0; i < zhi.length;i++){
			System.out.println(zhi[i]);
		}
		System.out.println("-------求和-------");
		for(int i=0; i < zhi.length;i++){
			sum+=zhi[i];
		}
		System.out.println("sum："+sum);
		System.out.println("-------猜数-------");
		for(int i=0; i < zhi.length;i++){
			System.out.print("请猜第"+(i+1)+"数字：");
			int shu= sc.nextInt();
			if(zhi[i] == shu){
				System.out.print("恭喜你！！！猜对了");
			}else {
				System.out.println("猜错了");
			}
		}
	}
}