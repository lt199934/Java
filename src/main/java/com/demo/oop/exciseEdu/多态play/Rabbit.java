package com.demo.oop.exciseEdu.多态play;

public  class Rabbit extends Animal {
	private int health;
	public void play(){
		System.out.println("赛跑");
	}
	@Override
	public boolean eat(String food) {
		// TODO Auto-generated method stub
		if("草".equals(food)){
			System.out.println("好吃");
			this.setHealth(this.getHealth()+15);
			super.setHungry(super.getHungry()+20);
		}else{
			System.out.println("不吃");
			this.setHealth(this.getHealth()-5);
			super.setHungry(super.getHungry()-20);
		}
		if(super.getHungry() < 60){
			this.setHealth(this.getHealth()-20);
		}
		if(health < 60){
			System.out.println("不吃东西");
			return true;
		}
		return false;
	}

	public boolean eat(String food,int water) {
		// TODO Auto-generated method stub
		if(water >5||"胡萝卜".equals(food)){
			if("胡萝卜".equals(food)){
				System.out.println("好吃");
			}else{
				System.out.println("好喝");
			}
			this.setHealth(this.getHealth()+15);
			super.setHungry(super.getHungry()+20);
		}else{
			System.out.println("不吃");
			this.setHealth(this.getHealth()-5);
			super.setHungry(super.getHungry()-20);
		}
		if(super.getHungry() < 60){
			this.setHealth(this.getHealth()-20);
		}
		if(health < 60){
			System.out.println("不吃东西");
			return true;
		}

		return false;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("兔子正在睡觉");
		super.setHungry(super.getHungry()-20);
	}

	public Rabbit() {
		super();
	}
	public Rabbit(String name, int age, String hobby, int hungry,int health) {
		super(name,age,hobby,hungry);
		this.health = health;
	}

	public Rabbit(int health) {
		super();
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 0){
			this.health = 0;
		}else if(health > 100){
			this.health = 100;
		}else{
			this.health = health;
		}
	}

}
