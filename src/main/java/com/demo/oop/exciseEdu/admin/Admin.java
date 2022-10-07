package com.demo.oop.exciseEdu.admin;

import java.util.Scanner;

public class Admin {
	String username;
	String userpass;
	Scanner sc = new Scanner(System.in);
	public void show(){
		System.out.println("用户名："+username+"\n密码："+userpass);
	}


	public void update(){
		while(true){
			System.out.print("请输入新密码:");
			String password=sc.next();
			System.out.print("请输入新密码:");
			String repassword=sc.next();
			if(password.equals(repassword)){
				userpass = repassword;
				System.out.println("密码修改成功；新密码为："+userpass);
				break;
			}else{
				System.out.println("请重新输入密码！！！");
			}
		}
	}
	public int getMon(){
		return 12;

	}

}

