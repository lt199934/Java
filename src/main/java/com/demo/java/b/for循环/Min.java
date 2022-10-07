package com.demo.java.b.for循环;
import java.util.Scanner;
/**
 * @Program: java
 * @ClassName Score
 * @Author: liutao
 * @Description: for循环查找最小数
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class Min {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []num = new int[4];
		int min =0;
		System.out.println("请输入4家店的价格：");
		for(int i=0 ; i<num.length; i++) {
			System.out.print("第"+(i+1)+"家店的价格：");
			num[i] = sc.nextInt();
			if(i==0){
				min=num[0];
			}else if(min>num[i]){
				min=num[i];
			}
		}
		System.out.print(min);
	}
}