package com.demo.oop.exciseEdu.多级继承关系;

public class Animal extends Yz{
	private int age;
	public Animal(){
			System.out.println("a 11111111");
	}
	//有参构造方法
	public Animal(int age){
		System.out.println("a 22222222");
		this.setAge(age);
	}
	public void print(){
		System.out.println("今年"+age+"岁了！");
	}
	public void setAge(int age){
		this.age=age;
}

	public int getName(){
		return this.age;
	}
	
}
