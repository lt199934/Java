package com.demo.oop.homework.handset;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handset c = new commonHandset();
		commonHandset c1 = (commonHandset)c;
		c1.info();
		c1.play();
		c1.sendInfo();
		c1.call();
		System.out.println("");
		Handset a =new AptitudeHandset();
		AptitudeHandset a1 = (AptitudeHandset)a;
		a1.info();
		a1.networkConn();
		a1.play();
		a1.takepicture();
		a1.sendInfo();
		a1.playVideo();
		a1.call();
	}

}
