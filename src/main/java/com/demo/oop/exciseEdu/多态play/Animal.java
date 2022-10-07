package com.demo.oop.exciseEdu.多态play;

public abstract class Animal {
	private String name;
	private int age;
	private String hobby;
	private int hungry;

	//吃
	public abstract boolean eat(String food);
	//睡觉
	public abstract void sleep();

	//自我介绍
	public void show() {
		String message =  "Animal [name=" + name + ", age=" + age + ", hobby=" + hobby
				+ ", hungry=" + hungry + "]";
		System.out.println(message);
	}

	public Animal() {
		super();
	}
	public Animal(String name, int age, String hobby, int hungry) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.hungry = hungry;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getHungry() {
		return hungry;
	}
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

}
