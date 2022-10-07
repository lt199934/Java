package com.demo.oop.exciseEdu.多级继承关系;

public class Bird extends Animal {
	private String color;
	public Bird(){
		System.out.println("b 11111111");
	}
	//有参构造方法
	public Bird(int age,String color){
		super(age);
		this.setColor(color);
		System.out.println("b 222222222");
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
