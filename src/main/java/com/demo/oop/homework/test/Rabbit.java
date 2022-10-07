package com.demo.oop.homework.test;


public class Rabbit extends Animal {
	private int heath;
	public Rabbit(){

	}
	public Rabbit(int age,String name,String hobby,int heath){
		super(age,name,hobby);
		this.setHeath(heath);
	}
	public void show(){
		super.show();
		System.out.println("健康值："+heath);
	}
	@Override
	public int eat() {
		// TODO Auto-generated method stub
		if(heath<60){
			System.out.println("兔兔健康值低于60了哦！不能吃这些");
			return heath;
		}else{
			heath-=10;
			System.out.println("兔兔的健康值还有"+heath);
			return heath;
		}
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		heath-=10;
		System.out.println("兔兔的健康值还有"+heath);
		return heath;
	}

	public int look(){
		if(heath<=10){
			System.out.println("兔兔没有救了");
		}else{
			heath+=10;
			System.out.println("兔兔的健康值还有"+heath);
		}
		return heath;
	}
	public int getHeath() {
		return heath;
	}
	public void setHeath(int heath) {
		this.heath = heath;
	}

}
