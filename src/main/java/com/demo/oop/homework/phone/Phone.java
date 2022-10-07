package com.demo.oop.homework.phone;

public class Phone {
String brand; //品
String internetKinds;
String song1;
String song2;
String song3;
int volume; //电池容量
int sum;
String write;
int a;
public void showSongs(){ 
	System.out.println(song1+"\n"+song2+"\n"+song3);
}
public void show(){
	System.out.println("手机品牌："+brand+"\n网络："+internetKinds+"\n电池容量:"+volume+"mah");
}
public void cellAdd(){ //充电
	sum+=5;
	if(sum > 100){
		sum =100;
	}
}
public int load(){ // 下载音乐
	sum-=2;
	if(sum <= 1){
		System.out.println("您的手机电量不足！60秒后将自动关机");
		}
	return sum;
}


public void musicPlay(){ //播放音乐
	sum-=3;
	if(sum <= 1){
		System.out.println("您的手机电量不足！60秒后将自动关机");
		}
	}
public int getCell(){ //得到电池电量
	return sum;
}
}
