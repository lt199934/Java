package com.demo.oop.homework.phone;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Phone p =new Phone();
		p.brand="vivo iQOO Pro 5G";
		p.internetKinds="全网通5G";
		p.volume=4500;
		p.sum=60;
		p.show();
		System.out.println("-----------------------------");
		System.out.println(p.sum);
		for(int i=0;i<5;i++){
		p.cellAdd();
		}
		System.out.println("充电以后");
		int c =p.getCell();
		System.out.println(c);
		System.out.println("功能：");
		System.out.println("下载音乐：");
		p.song1="姬和不如 -隔壁老樊";
		p.song2="我的歌声里-曲婉婷";
		p.song3="芒种-音阙诗听/赵文婧";
		p.showSongs();
		System.out.println("下载之后");
		int b = p.load();
		System.out.println("是否下载已选好的音乐(y/n)：");
		 p.write = sc.next();
		
		if("y".equals(p.write)){ 
			System.out.println("歌曲正在下载中");
			System.out.println(b);
		System.out.println("音乐播放(y/n):");
		 p.write = sc.next();;
		 if("y".equals(p.write)){
			 System.out.println("播放之前的电量："+p.sum);
			 p.musicPlay();
		int a=p.getCell();
		System.out.println("播放之后的电量："+a);
		 }else{
			 System.out.println("退出播放功能"); 
			 System.out.println("您的手机电量为："+p.sum);
		 }
	  }else{
		  System.out.println("退出下载");
	  }
		
		
		
	}

}
