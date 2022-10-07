package com.demo.java.c.简单登录案例;
import java.util.Scanner;

public class Infocheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "jim";
		String mima = "123456";
		for(int i=0;i<3;i++){
			System.out.print("请输入用户名：");
			String username =sc.next();
			System.out.print("请输入密码：");
			String pass = sc.next();
			if(name.equals(username)&& mima.equals(pass)){
				System.out.println("欢迎登陆Myshopping系统！\n\n");
				break;
			}else{
				System.out.println("输入错误！你还有"+(2-i)+"次机会！\n");
				if(i==2){
					System.out.println("您没有机会了！！！");
				}
				continue;
			}
		}
	}
}
