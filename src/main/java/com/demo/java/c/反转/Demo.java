package com.demo.java.c.反转;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = sc .nextInt();
		int dum;
		int first = 1;
		System.out.print("反转以后的数:");
		do{	                     // 方法1
			if(num > 0 ){
				dum = num % 10;
				num = num / 10;
				System.out.print(dum);
			}else{
				dum = num % 10;
				num = -num / 10;
				System.out.print(dum);
			}
		}while(num != 0);

//		do{	                 // 方法2
//				dum = num % 10;
//				num = num / 10;
//				if(dum > 0 && first == -1 ){
//					dum = -dum;
//				}
//				first = 1;
//				System.out.print(dum);
//		}while(num != 0);
	}
}
