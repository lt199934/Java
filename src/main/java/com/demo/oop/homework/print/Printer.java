package com.demo.oop.homework.print;

public  class Printer {
	public void print(Box box,String temp,Paper p){
		System.out.println("这是"+p.getPepear()+"纸张上"+box.getColor()+"打印："+temp);
	}
}
