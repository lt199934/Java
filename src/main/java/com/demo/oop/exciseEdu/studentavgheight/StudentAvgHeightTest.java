package com.demo.oop.exciseEdu.studentavgheight;

import java.util.Scanner;

public class StudentAvgHeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AvgHeight avgHeight = new AvgHeight();
		
		//计算平均身高
		System.out.println("************平均身高************");
		StudentHeight[] stuArray = new StudentHeight[5];
		for(int i=0;i<stuArray.length;i++){
			StudentHeight s = new StudentHeight();
			System.out.println("请输入身高");
			s.stuHeight=sc.nextInt();
			stuArray[i]=s;
		}
		double avgHe= avgHeight.showAvgHeight(stuArray);
		System.out.println("平均身高："+avgHe);
	}

}
