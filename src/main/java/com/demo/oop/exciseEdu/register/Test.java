package com.demo.oop.exciseEdu.register;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Register register = new Register();
		System.out.println("***欢迎进入注册系统***\n");
		
		boolean temp=true;
		do{
			User user = new User();
			System.out.println("请输入身份证");
			user.idCard=sc.next();
			System.out.println("请输入手机号");
			user.num1=sc.next();
			System.out.println("请输入座机号");
			user.num2 = sc.next();
			 temp=register.vreify(user);
			
		}while(!temp);
		
	}

}
