package com.demo.oop.homework.administrator;
import java.util.Scanner;
public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Administrator admin = new Administrator();
		while(true){
		System.out.print("请输入用户名：");
		admin.adminUserName=sc.next();
		System.out.print("请输入密码：");
		admin.adminUserPass=sc.next();
		
		admin.showAd();
		
		System.out.println("是否继续（y/n）");
		String close = sc.next();
		if(!"y".equals(close)){
			System.out.println("退出程序");
			break;
		}
		}
	}

}
