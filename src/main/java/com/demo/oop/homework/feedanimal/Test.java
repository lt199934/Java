package com.demo.oop.homework.feedanimal;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎来到动物管理系统");
		System.out.println("开始你的表演");
		System.out.println("请选择：\n1，老虎\n2，兔子");
		int a=sc.nextInt();
		if(a==1){
		Tiger tiger = new Tiger("辛巴",2,"奔跑",80,100);
		tiger.show();
		while(true){
			System.out.println("请选择操作：1，喂食物,2,喝水,3,睡觉,4，下班");
			int num = sc.nextInt();
			if(num == 1){
				System.out.println("请输入喂养的食物");
				String food = sc.next();
				boolean temp= tiger.eat(food);
				if(temp){
					System.out.println("game over");
					break;
				}
				
			}else if(num == 2){
				tiger.eat(10);
			}else if(num == 3){
				tiger.sleep();
			}else{
				System.out.println("错误");
				
			}
		}
	}
		if(a==2){
			Rabbit rabbit = new Rabbit("小白",3,"吃草",80,60);
			rabbit.show();
			while(true){
				System.out.println("请选择操作：1，喂食物,2,喝水,3,睡觉,4，下班");
				int num = sc.nextInt();
				if(num == 1){
					System.out.println("请输入喂养的食物");
					String food = sc.next();
					boolean temp= rabbit.eat(food);
					if(temp){
						System.out.println("game over");
						break;
					}
					
				}else if(num == 2){
					rabbit.eat("胡萝卜",10);
				}else if(num == 3){
					rabbit.sleep();
				}else{
					System.out.println("错误");
					
				}
			}	
		}
	}

}
