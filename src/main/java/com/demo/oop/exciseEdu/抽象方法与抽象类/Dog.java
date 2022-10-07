package com.demo.oop.exciseEdu.抽象方法与抽象类;


public class Dog extends Pet {
	public Dog(){
		System.out.println(111111111);
	}
	public Dog(String nmae){
		System.out.println(222222222);
	}//重写
	public void back(){
		System.out.println("汪汪");
	}
	//重载
	public void back(String name){
		System.out.println("汪汪汪");
	}
	
}
