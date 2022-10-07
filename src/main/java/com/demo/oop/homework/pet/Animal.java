package com.demo.oop.homework.pet;

public class Animal {
	private int age;
	public Animal(){
		System.out.println("执行无参构造方法");
	}
	//有参构造方法
	public Animal(int age){
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
