package com.demo.oop.homework.register;

import java.util.Scanner;

public class Register {
	String user;
	String userPassWord;
	Scanner sc = new Scanner(System.in);
		public void vreify(){
			while(true){
				System.out.println("请输入用户名");
				user=sc.next();
				System.out.println("请输入密码");
				userPassWord=sc.next();
				System.out.println("请再次输入密码");
				String num = sc.next();
				if(user.length() >= 3 && userPassWord.length() >=6){
					if(userPassWord.equals(num)){
						System.out.println("注册成功");
						break;
				}else{
					System.out.println("两次输入密码不一致！");
				}
				}else{
					System.out.println("用户名长度不能小于3，密码长度不能小于6");
				}
				
			}
			
		}

}
