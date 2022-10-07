package com.demo.java.b.for循环;

import java.util.Scanner;

/**
 * @Program: java
 * @ClassName Score
 * @Author: liutao
 * @Description: 计算平均成绩
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int k=0; k<3; k++){
		double sum =0;
		double ave =0;
		System.out.println("请输入第"+(k+1)+"个班级");
		for(int i=0; i<4; i++ ){
			System.out.print("请输入"+(i+1)+"位学院的成绩：");
			int socre = sc.nextInt();
			sum+=socre;
		}
		ave = sum/4;
		System.out.print("参赛学员的平均分是："+ave+"\n");
		}
    }
}
