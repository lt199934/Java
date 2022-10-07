package com.demo.oop.homework.administrator;

public class Administrator {
	String adminUserName;
	String adminUserPass;
	public void showAd(){
		System.out.println("用户名："+adminUserName+"\n密码："+adminUserPass);
		System.out.println("欢迎用户"+adminUserName+"登录系统");
	}
}
