package com.demo.java.c.最大最小;
import java.util.Scanner;
public class MinMax {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int num = 0;
		do{
			System.out.println("请输入一个数，输入0结束：");
			num = sc.nextInt();
			if(num > max && num != 0 || max == 0){
				max = num;
			}
			if(num < min && num != 0 || min ==0){
				min = num;
			}
		}while(num != 0);
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}
}
