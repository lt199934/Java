package com.demo.oop.homework.handset;

public class AptitudeHandset extends Handset implements Network, playWiring,
		TheakePictures,Video {

	@Override
	public void takepicture() {
		// TODO Auto-generated method stub
		System.out.println("咔嚓......拍照成功");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("已经开始播放视频《小时代》......");
	}

	@Override
	public void networkConn() {
		// TODO Auto-generated method stub
		System.out.println("已经启动移动网络......");
	}

	@Override
	public void sendInfo() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片和文字的信息......");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话......");
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.setBrand("I9100");
		String brand =super.getBrand(); 
		super.setType("HTC");
		String type = super.getType();
		System.out.println("这是一款型号为"+type+"的"+brand+"手机");
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话......");
	}

}
