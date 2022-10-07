package com.demo.oop.homework.rent;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		Bus bus = new Bus();
		System.out.println("欢迎来到汽车租恁中心");
		System.out.println("请输入天数");
		int days = sc.nextInt();
		System.out.println("请选择：1，轿车\t2，客车");
		int a = sc.nextInt();
		if(a==1){
			System.out.println("请选择品牌：1，宝马\t2，别客");
			int b = sc.nextInt();
			if(b==1){
				System.out.println("550i");
				car.car(days,"550i","AU8765");	
			}else if(b==2){
				System.out.println("请选择车型：1，商务舱GL8\t2，林荫大道");
				int c = sc.nextInt();
				System.out.println("请选择车牌号：1，"+"AU8765");
				int no = sc.nextInt();
				if(c==1&&no==1){
				car.car(days,"商务舱GL8","AU8765");
				}
				if(c==2){
					car.car(days,"林荫大道","AU8765");
					}
				
			}
		}
		if(a==2){
			System.out.println("请选择品牌：1，金杯\t2，金龙");
			int b = sc.nextInt();
			System.out.println("请选择车牌号：1，"+"Jk8765");
			int no = sc.nextInt();
			System.out.println("请输入座位数");
			int num=sc.nextInt();
			if(b==1&&no==1){
				bus.bus(days, num, "JK8765");
			}else if(b==2){
				bus.bus(days, num, "JK8765");
			}
		}
		
	}

}
