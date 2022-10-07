package com.demo.oop.homework.TestMember;

import java.util.Scanner;

public class TestMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User u = new User();
		for(int i=0; i<4 ;i++){
			System.out.println("请输入会员编号：");
			String name=sc.next();
			System.out.println("请输入会员积分：");
			String namee=sc.next();
			u.addName(name,namee);

		}
		System.out.println("***会员列表***");
		u.showName();
		System.out.println();
		System.out.print("请输入查询的会员号:");
		String n=sc.next();
		u.search(n);
	
		
}
}