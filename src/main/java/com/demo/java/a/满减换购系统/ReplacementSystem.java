package com.demo.java.a.满减换购系统;
import java.util.Scanner;
public class ReplacementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double je = sc.nextInt();
		if (je > 0 && je >= 50){
			System.out.println("是否参加优惠换购活动：");
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			System.out.println("2：满100元，加3元换购500ml可乐一瓶");
			System.out.println("3：满150元，加10元换购五公斤面粉");
			System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
			System.out.println("5：满250元，加20元可换购欧莱雅爽肤水一瓶");
			System.out.println("0：不换购");
			System.out.print("请选择：");

		}else{
			System.out.println("本次消费总金额："+je);
		}
		int num = sc.nextInt();
		int tep = 0;
		switch (num) {
			case 1:
				if (je >= 50) {
					tep = 2;
					System.out.println("成功换购：百事可乐饮料1瓶");
					break;
				}
			case 2:
				if (je >= 100) {
					tep = 3;

					System.out.println("成功换购：500ml可乐一瓶");
					break;
				}
			case 3:
				if (je >= 150 ){
					tep = 10;
					System.out.println("成功换购：5公斤面粉");
					break;
				}

			case 4:
				if (je >= 200){
					tep = 10;
					System.out.println("成功换购：一个苏泊尔炒菜锅");
					break;
				}
			case 5:
				if (je >= 250){
					tep = 20;
					System.out.println("成功换购：欧莱雅爽肤水一瓶");
					break;
				}
			case 0:

				System.out.println("不换购");
				break;
		}
		double zje = je + tep;
		System.out.println("本次消费总金额："+zje);
	}
}
