package com.demo.oop.exciseEdu.admin;
import java.util.Scanner;
public class Test3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Admin admin = new Admin();
		int a=admin.getMon();
		System.out.println(a);
		admin.username="admin";
		admin.userpass="123456";
		admin.show();
		System.out.print("请输入用户名：");
		String name=sc.next();
		System.out.print("请输入密码:");
		String pass=sc.next();

		if(name.equals(admin.username) &&  pass.equals(admin.userpass) ){
			admin.update();
			admin.show();
		}else{
			System.out.println("没有权限");
		}
	}
}
