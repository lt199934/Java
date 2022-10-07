package com.demo.oop.homework.phoneteacher;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Phone phone = new Phone();
		phone.phoneName="华为";
		phone.type="mate20";
		phone.init();//初始化手机
		
		while(true){
			System.out.println("1 下载音乐");
			System.out.println("2 播放音乐");
			System.out.println("3 充电");
			System.out.println("4 退出");
			System.out.println("请选择");
			int num = sc.nextInt();
			if(1==num){
				if(phone.downMusic()){
					break;
				}
			}else if(2==num){
				if(phone.playMusic()){
					break;
				}
			}else if(3==num){
				phone.addCell();
			}else{
				break;
			}
		}
		
		
	}

}
