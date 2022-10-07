package com.demo.oop.homework.pet;

public class Bird extends Animal {
	private String color;
	public Bird(){
		System.out.println("执行无参构造方法");
	}
	//有参构造方法
	public Bird(int age,String color){
		super(age);
		this.setColor(color);
	}
	public void print(){
		System.out.println("我是一只"+color+"的鸟");
		super.print();
	}
	public void setColor(String color){
		this.color=color;
	}

	public String getColor(){
		return this.color;
	}
}
