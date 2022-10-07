package com.demo.java.b.for循环;
import java.util.Scanner;

/**
 * @Program: java
 * @ClassName Score
 * @Author: liutao
 * @Description: 输入学员成绩进行排序
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class ScoreSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []score = new int[5];
		int max;
		System.out.println("请输入5位学员的成绩：");
		for(int i=0; i<score.length; i++){
			score[i]=sc.nextInt();
		}
		for(int c=0; c<score.length-1; c++){
			for(int j=0;j<score.length-1-c; j++){
				if(score[j]>score[j+1]){
					max=score[j];
					score[j]=score[j+1];
					score[j+1]=max;
				}
			}
		}
		System.out.print("排序后的结果为：");
		for(int k=0; k<score.length; k++){
			System.out.print(score[k]+",");
		}
	}
}
