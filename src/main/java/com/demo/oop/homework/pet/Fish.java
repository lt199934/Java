package com.demo.oop.homework.pet;

public class Fish extends Animal {
	private int weight;
	public Fish(){
		System.out.println("执行无参构造方法");
	}
	//有参构造方法
	public Fish(int age,int weight){
		super(age);
		this.setWeight(weight);
	}
	public void print(){
		System.out.println("我是一只"+weight+"斤重的鱼");
		super.print();
	}
	public void setWeight(int weight){
		this.weight=weight;
	}

	public int getWeight(){
		return this.weight;
	}
}
