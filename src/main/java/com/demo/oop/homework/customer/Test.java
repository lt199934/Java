package com.demo.oop.homework.customer;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustManager c = new CustManager();
		for(int i=0; i<4;i++){
			Customer cust = new Customer();
			System.out.print("输入会员编号：");
			cust.id=sc.nextInt();
			System.out.print("输入会员积分："); 
			cust.scroe=sc.nextInt();
			c.add(cust);
		}	
		 c.show();
		 System.out.println("请输入需要查找的会员编号");
			int id =sc.nextInt();
			c.searchScore(id);
		 	
		
		
	}

}
