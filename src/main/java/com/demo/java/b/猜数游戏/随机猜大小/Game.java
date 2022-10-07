package com.demo.java.b.猜数游戏.随机猜大小;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int one = (int)(Math.random()*145+342);
		for(int i=0; i<5; i++){
			System.out.println("请输入一个数：");
			int num = sc.nextInt();
			if(num==one){
				System.out.println("猜对了");
				break;
			}else if(num>one){
				System.out.println("太大了");
			}else if(num<one){
				System.out.println("太小了");
			}else if(i==4){
				System.out.println("你没机会了！！！");
			}
		}
	}
}
