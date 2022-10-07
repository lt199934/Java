package com.demo.java.a.折扣系统;
import java.util.Scanner;
public class DiscountSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入会员积分：");
		int jf = sc.nextInt();
		if(jf >= 8000){
			System.out.println("该会员的折扣是：0.6");
		}
		else if((4000 <= jf) && (jf  < 8000)){
			System.out.println("该会员的折扣是：0.7");
		}
		else if((2000 <= jf) && (jf  < 4000)){
			System.out.println("该会员的折扣是：0.8");
		}
		else if(jf  < 200){
			System.out.println("该会员的折扣是：0.9");
		}
	}
}