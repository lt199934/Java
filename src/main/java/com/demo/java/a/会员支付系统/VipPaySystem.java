package com.demo.java.a.会员支付系统;
import java.util.Scanner;
public class VipPaySystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入是否是会员：是（y）/否（其他字符）");
		String hy = sc.next();
		System.out.println("请输入购物金额：");
		int je = sc.nextInt();
		if(hy.equals("y")){
			if(je >= 200){
				double zje1 = je * 0.75;
				System.out.println("实际支付："+zje1);
			}else if(je >=100){
				double zje2 = je *0.8;
				System.out.println("实际支付："+zje2);
			}
		}else{
			double zje3 = je *0.9;
			System.out.println("实际支付："+zje3);
		}
	}
}