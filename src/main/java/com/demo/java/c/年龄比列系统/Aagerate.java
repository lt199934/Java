package com.demo.java.c.年龄比列系统;
import java.util.Scanner;

public class Aagerate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double dum=0;

		for(int i=1,num;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			num =sc.nextInt();
			if(num < 30){
				dum++;
			}
		}
		System.out.println("30岁以下的比例是："+(dum/10*100)+"%");
		System.out.println("30岁以上的比例是："+((1-dum/10)*100)+"%");
	}
}
