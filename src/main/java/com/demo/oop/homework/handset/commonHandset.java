package com.demo.oop.homework.handset;

public class commonHandset extends Handset implements playWiring {

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("发送文字信息......");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话......");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.setBrand("索尼爱立信");
		String brand =super.getBrand(); 
		super.setType("G502c");
		String type = super.getType();
		System.out.println("这是一款型号为"+type+"的"+brand+"手机:");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("开始播放音乐《热雪》......");
	}
}
