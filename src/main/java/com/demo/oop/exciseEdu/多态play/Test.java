package com.demo.oop.exciseEdu.多态play;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Master master = new Master();
//		System.out.println("请选择领养的动物：1，老虎 2，兔子");
//		int num =sc.nextInt();
//		Animal a=master.getAnimal(num);
//			System.out.println(a);
		System.out.println("你想和谁玩儿：1，老虎 2，兔子");
		int a = sc.nextInt();
		if(a==1){
			master.play(new Tiger());
		}else if(a==2){
			master.play(new Rabbit());
		}else{
			System.out.println("好累，不想玩");
		}
	}

}