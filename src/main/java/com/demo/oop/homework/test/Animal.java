package com.demo.oop.homework.test;


public  abstract class Animal {
	String name;
	int age;
	String hobby;

	public abstract int eat();
	public abstract int sleep();
	public void show(){
		System.out.println("我的名字是："+name+"\t我今年"+age+"岁了\t我的爱好是"+hobby);
	}
	public Animal(){

	}
	public Animal(int age,String name,String hobby){
		this.setAge(age);
		this.setName(name);
		this.setHobby(hobby);
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

}
