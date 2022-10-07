package com.demo.java.a.拨号系统;
import java.util.Scanner;
public class DialSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入号数");
		int num = sc.nextInt();
		switch(num){
			case 1:
				System.out.println("拨爸爸 的号");
				break;
			case 2:
				System.out.println("拨妈妈 的号");
				break;
			case 3:
				System.out.println("拨爷爷 的号");
				break;
			case 4:
				System.out.println("拨奶奶 的号");
				break;
			default:
				System.out.println("请输入正确的号数");
		}
	}

}
