package com.demo.java.c.MyShopping管理系统;
import java.util.Scanner;
public class Shopping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double discount = 0.8;
		double sumjg = 0;      //开始时的总金额变量
		String shifou = "y";   //声明变量
		String mz = "";        // 商品名字
		double jg = 0;  // 商品价格
		System.out.println("MyShopping管理系统 > 购物结算\n\n");
		System.out.println("***************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤"+"\t"+"2.网球鞋"+"\t"+"3.网球拍");
		System.out.println("***************************************");
		while (shifou.equals("y")){
			System.out.print("\n请输入商品编号：");
			int num = sc.nextInt();
			System.out.print("请输入商品数量：");
			int dum = sc.nextInt();
			switch (num){
				case 1:
					mz = "T恤";
					jg = 245;
					break;
				case 2:
					mz = "网球鞋";
					jg = 570;
					break;
				case 3:
					mz = "网球拍";
					jg = 340 ;
					break;
			}
			System.out.println(mz+"\t"+"￥"+jg+"\t"+"数量"+dum+"\t"+"合计￥"+(jg * dum));
			sumjg =sumjg +(jg * dum);   //不同商品总金额
			System.out.print("是否继续（y/n）：");
			shifou = sc.next();
		}
		System.out.println("折扣："+discount);
		System.out.println("总金额："+sumjg);
		System.out.println("应付金额："+sumjg * discount);
		System.out.print("实付金额：");
		double sfje = sc.nextDouble();
		while (sfje <(sumjg * discount)){
			System.out.println("您输入的金额小于应付金额，请输入正确金额：");
			sfje = sc.nextDouble();
		}
		System.out.println("找钱："+(sfje - (sumjg * discount)));
	}
}
