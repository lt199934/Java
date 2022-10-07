package com.demo.java.b.for循环;

import java.util.Scanner;

/**
 * @Program: java
 * @ClassName Score
 * @Author: liutao
 * @Description: 逆向输入输出信息
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String []one = new String[5];    //
		System.out.println("------请输入5句话------");
		for(int i=0; i<one.length; i++){
			System.out.print("请输入第"+(i+1)+"句话:");
			one[i] = sc.next();
		}
		System.out.println("\n逆向输入：");
		for(int i=one.length-1; i>=0;i--){
			System.out.println(one[i]);
		}
		System.out.println("------逆向输出数字------");
		int[] array = new int[]{1,3,-1,5,-2};
		int[] newArray = new int[array.length];
		System.out.println("原数组为：");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
		}
		System.out.println("\n逆向输入：");
		for(int i=array.length-1; i>=0;i--){
			if(array[i]<0){
				array[i]=0;
			}
			System.out.print(array[i]);
		}
	}

}

