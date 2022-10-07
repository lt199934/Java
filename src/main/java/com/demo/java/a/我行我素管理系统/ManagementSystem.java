package com.demo.java.a.我行我素管理系统;
import java.util.Scanner;
public class ManagementSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("我行我素管理系统");
		System.out.println("* * * * * * * * * * * * * * *");
		System.out.println("1.登录系统");
		System.out.println("2.退出");
		System.out.println("* * * * * * * * * * * * * * *");
		System.out.println("请输入数字：");
		int sz = sc.nextInt();
		switch (sz) {
			case 1:
				System.out.println("我行我素管理系统>管理主菜单");
				System.out.println("* * * * * * * * * * * * * * *");
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				System.out.println("* * * * * * * * * * * * * * *");
				System.out.println("请输入数字：");
				sz = sc.nextInt();
				switch(sz){
					case 1:
						System.out.println("我行我素管理系统>客户信息管理");
						System.out.println("1.显示所有客户信息");
						System.out.println("2.添加客户信息");
						System.out.println("3.修改客户信息");
						System.out.println("4.查询客户信息");
						break;
					case 3:
						System.out.println("我行我素管理系统>真情回馈");
						System.out.println("1.幸运大放送");
						System.out.println("2.幸运抽奖");
						System.out.println("3.生日问候");
						break;
				}
				break;
			case 2:
				System.out.println("我行我素管理系统");
				System.out.println("* * * * * * * * * * * * * * *");
				System.out.println("1.登录系统");
				System.out.println("2.退出");
				System.out.println("* * * * * * * * * * * * * * *");
				System.out.println("请输入数字：");
				System.out.println("谢谢您的参与");
				break;
		}
	}

}
