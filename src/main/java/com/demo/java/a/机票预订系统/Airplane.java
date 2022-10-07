package com.demo.java.a.机票预订系统;
import java.util.Scanner;
public class Airplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("机票预订系统");
		int yjp = 4000;
		System.out.println("机票原价"+yjp);
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		if (month >= 5 && month <= 10){
			System.out.println("5至10月为旺季");
			System.out.println("1.旺季：头等舱9折");
			System.out.println("2.旺季：经济舱7.5折");
			System.out.print("请输入机舱类型：");
			int cx1 = sc.nextInt();
			switch (cx1){
				case 1:
					double xjp = yjp * 0.9;
					System.out.println("本次机票价格是："+xjp);
					break;
				case 2:
					double xjp1 = yjp * 0.75;
					System.out.println("本次机票价格是："+xjp1);
					break;
			}
		}else{
			System.out.println("其他情况为淡季");
			System.out.println("1.淡季：头等舱6折");
			System.out.println("2.淡季：经济舱3折");
			System.out.println("请输入机舱类型：");
			int  cx2 = sc.nextInt();
			switch (cx2){
				case 1:
					double xjp2 = yjp * 0.6;
					System.out.println("本次机票价格是："+xjp2);
					break;
				case 2:
					double xjp3 = yjp * 0.3;
					System.out.println("本次机票价格是："+xjp3);
					break;
			}
		}


	}

}
