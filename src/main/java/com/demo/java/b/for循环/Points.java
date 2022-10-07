package com.demo.java.b.for循环;
import java.util.Scanner;
/**
 * @Program: java
 * @ClassName Score
 * @Author: liutao
 * @Description: for循环运算打印
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] old = new int[5];
		int[] newjf =new int[5];

		System.out.println("请输入5位会员的积分：");
		for(int i=0; i<old.length; i++){
			System.out.print("第"+(i+1)+"位会员的积分：");
			old[i] = sc.nextInt();
		}

		System.out.println("序号\t\t历史积分\t\t新年积分");
		for(int j=0; j<old.length; j++){
			newjf[j]=old[j]+500;
			System.out.println((j+1)+"\t\t\t"+old[j]+"\t\t"+newjf[j]);

		}
	}

}