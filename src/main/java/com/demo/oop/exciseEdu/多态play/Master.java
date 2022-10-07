package com.demo.oop.exciseEdu.多态play;

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

	public void play(Animal animal){
		if(animal instanceof Tiger){
			Animal tiger = new Tiger();//强制转换
			Tiger tiger1 = (Tiger)tiger;
			tiger1.play();
		}else if(animal instanceof Rabbit){
			Animal rabbit = new Rabbit();
			Rabbit rabbit1 = (Rabbit)rabbit;
			rabbit1.play();
		}else{
			System.out.println("不想玩，好累");
		}
	}
}	
	
