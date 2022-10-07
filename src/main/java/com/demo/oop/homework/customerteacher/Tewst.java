package com.demo.oop.homework.customerteacher;

import java.util.Scanner;

public class Tewst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CutomerManager cm = new CutomerManager();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			Customer cust = new Customer();
			System.out.println("请输入会员编号");
			cust.id=sc.nextInt();
			System.out.println("请输入会员积分");
			cust.scroe=sc.nextInt();
			cm.add(cust);	
		}
		cm.show();
		System.out.println("请输入需要查找的会员编号");
		int id =sc.nextInt();
		cm.selectId(id);
	}

}
