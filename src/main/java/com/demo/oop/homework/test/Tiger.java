package com.demo.oop.homework.test;


public class Tiger extends Animal {
	private int love;
	public Tiger(){

	}
	public Tiger(int age,String name,String hobby,int love){
		super(age,name,hobby);
		this.setLove(love);
	}
	public void show(){
		super.show();
		System.out.println("亲密度："+love);
	}
	@Override
	public int eat() {
		// TODO Auto-generated method stub
		if(love<50){
			System.out.println("老虎的亲密度低于50了哦！小心被吃");
		}else{
			love-=10;
			System.out.println("老虎讨厌吃肉！亲密度还有"+love);
		}
		return love;
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		love-=10;
		System.out.println("老虎不想睡觉觉！亲密度还有"+love);
		return love;
	}

	public int pacify(){
		if(love<=10){
			System.out.println("老虎厌烦你了！");
		}else{
			love+=10;
			System.out.println("老虎喜欢你的安抚！亲密度还有"+love);
		}
		return love;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}

}
