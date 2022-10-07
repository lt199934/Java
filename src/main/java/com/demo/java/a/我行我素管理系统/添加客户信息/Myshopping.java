package com.demo.java.a.我行我素管理系统.添加客户信息;
import java.util.Scanner;

public class Myshopping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("我行我素购物管理系统 >客户信息管理 >添加客户信息"+"\n");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号（<4位数>）：");
			int hyh = sc.nextInt();
			System.out.print("请输入会员生日（月/日<用两位数表示>）：");
			String sr = sc.next();
			System.out.print("请输入积分：");
			int jf = sc.nextInt();
			if(hyh<999||hyh>9999){
				System.out.println("客户"+hyh+"是无效会员号！");
				System.out.println("录入信息失败\n\n");
				continue;
			}
			System.out.println("已录入的会员信息是：");
			System.out.println(hyh+"\t"+sr+"\t"+jf+"\n\n");
		}
	}
}