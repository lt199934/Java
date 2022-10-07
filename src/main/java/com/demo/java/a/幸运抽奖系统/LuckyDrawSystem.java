package com.demo.java.a.幸运抽奖系统;
import java.util.Scanner;
public class LuckyDrawSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("我行我素购物管理系统"+">"+"幸运抽奖 \n ");
		System.out.print("请输入4位会员名：");
		int hym = sc.nextInt();
		int bw = (hym%1000)/100;
		int sjs = (int)((Math.random()*10));
		if (bw == sjs){
			System.out.println(hym+"号客户是幸运客户，获得静美MP3一个");
		}else  {
			System.out.println(hym+"号客户，谢谢您的支持！");
		}
	}
}
