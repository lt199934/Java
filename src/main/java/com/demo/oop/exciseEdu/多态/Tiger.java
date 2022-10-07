package com.demo.oop.exciseEdu.多态;

public class Tiger extends Animal {
	private int love;//亲密度
	
	@Override
	public boolean eat(String food) {
		// TODO Auto-generated method stub
		if("肉".equals(food)){
			System.out.println("好吃");
			this.setLove(this.getLove()+15);
			super.setHungry(super.getHungry()+20);
		}else{
			System.out.println("不吃");
			this.setLove(this.getLove()-5);
			super.setHungry(super.getHungry()-20);
		}
		if(super.getHungry() < 60){
			this.setLove(this.getLove()-20);
		}
		if(love < 50){
			System.out.println("吃人");
			return true;
		}
		return false;
	}

	public boolean eat(int water) {
		// TODO Auto-generated method stub
		if(water > 5){
			System.out.println("喝饱了开心");
			this.setLove(this.getLove()+15);
			super.setHungry(super.getHungry()+20);
		}else{
			System.out.println("太少了不喝");
			this.setLove(this.getLove()-5);
			super.setHungry(super.getHungry()-20);
		}
		if(super.getHungry() < 60){
			this.setLove(this.getLove()-20);
		}
		if(love < 50){
			System.out.println("吃人");
			return true;
		}
		return false;
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("老虎正在睡觉");
		super.setHungry(super.getHungry()-20);
	}
	
	
	public Tiger() {
		super();
	}
	
	public Tiger(String name, int age, String hobby, int hungry,int love) {
		super(name,age,hobby,hungry);
		this.love = love;
	}
	
	public Tiger(int love) {
		super();
		this.love = love;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if(love < 0){
			this.love = 0;
		}else if(love > 100){
			this.love = 100;
		}else{
			this.love = love;
		}
		
	}
	
	
}
