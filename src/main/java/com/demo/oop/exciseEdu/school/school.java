package com.demo.oop.exciseEdu.school;

public class school {
	String name;
	int num1;
	int num2;
public void show(){
	System.out.println("名称："+name+"\n数量1："+num1+"\n数量2："+num2);
}
}
class Student{
	String name;
	int age;
	String className;
	String like;
	public void show(){
		System.out.println("\n名称："+name+"\n年龄："+age+"\n就读于："+className+"\n爱好："+like);
	}
}
class Teacher{
	String name;
	String side;
	String classn;
	int teachAge;
	public void show(){
		System.out.println("\n名称："+name+"\n专业方向："+side+"\n教授课程："+classn+"\n教龄："+teachAge);
	}
}


