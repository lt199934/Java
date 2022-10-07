package com.demo.oop.homework.caeser;

import java.util.Scanner;

public class Swticher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Swtich swtich = new Swtich();
		String num = "";
		int keys= 0;
		while(true){
			System.out.println("请选择:（1，加密\t2，解密）");
			int a =sc.nextInt();
			
			if(a==1){
				System.out.println("请输入需要加密的密码：");
				num = sc.next();
				int key =(int)(Math.random()*10000);
				System.out.println("请输入需要密钥：");
				keys =sc.nextInt();
				swtich.Encyption(num,key,keys);
			}else{
				System.out.println("请输入正确数字，提示（1或2）");
			}
			if(a==2){
				System.out.println("请输入您的密钥：");
				int newkeys =sc.nextInt();
				if(keys==newkeys){
				swtich.Decyption(num);
				break;
				}else{
					System.out.println("密钥输入错误！请重新输入");
				}
			}
			
			if(a!=1||a!=2){
				System.out.println("请输入正确数字，提示（1或2）");
			}
							
			}
			
		}
		
	}



