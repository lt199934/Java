package com.demo.oop.homework.test;

import java.util.Scanner;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Tiger tiger=new Tiger();
		Rabbit rabbit=new Rabbit();
		int a;
		int b;
		System.out.println("请输入年龄");
		int age=sc.nextInt();
		System.out.println("请输入名字");
		String name=sc.next();
		System.out.println("请输入爱好");
		String hobby=sc.next();
		System.out.println("请输入亲密度");
		int love=sc.nextInt();
		Tiger t = new Tiger(age,name,hobby,love);
		System.out.println("请选择宠物\t\n1.老虎\n2.兔兔");
		a=sc.nextInt();
		switch(a){
			case 1: 
				t.show();
				while(true){
					System.out.println("请选择操作\t\n1.吃\n2.睡觉觉\n3.安抚");
					a=sc.nextInt();
					if(a==1){
						tiger.eat();
					}else if(a==2){
						tiger.sleep();
					}else if(a==3){
						tiger.pacify();
					}
					if(tiger.getLove()<=10){
						break;
					}
				}
				System.out.println("老虎吃掉了你！");
				break;
			case 2:
				Rabbit r=new Rabbit(age,name,hobby,love);
				r.show();
				while(true){
					System.out.println("请选择操作\t1.吃\n2.睡觉觉\n3.看医生");
					b=sc.nextInt();
					if(b==1){
						rabbit.eat();
					}else if(b==2){
						rabbit.sleep();
					}else if(b==3){
						rabbit.look();
					}
					if(rabbit.getHeath()<=10){
						break;
					}
				}
				System.out.println("兔子死掉了！");
				break;
		}
	}

}
