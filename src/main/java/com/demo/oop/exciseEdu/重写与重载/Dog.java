package com.demo.oop.exciseEdu.重写与重载;


public class Dog extends Animal {
	public Dog(){
		System.out.println(111111111);
	}
	public Dog(String nmae){
		System.out.println(222222222);
	}//重写
	public void back(){
		super.back();
		System.out.println("汪汪");
	}
	//重载
	public void back(String name){
		System.out.println("汪汪汪");
	}
	
}
