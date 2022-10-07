package com.demo.oop.exciseEdu.多态;

public class Master {
	//饲养方法
	public void feed(Animal animal,String food){
		animal.eat(food);
	}
	//领养方法
	//你告诉我你的需求  我就给你指定动物
	public Animal getAnimal(int a){
		Animal animal;
		if(a == 1){
			animal = new Tiger("xx",22,"33",12,12);
		}else if(a == 2){
			animal = new Rabbit();
		}else{
			System.out.println("没有这种动物");
			animal = null;
		}
		return animal;
	}
}	
	
