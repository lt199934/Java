package com.demo.oop.exciseEdu.构造方法和封装;

public class Structure {
	private int age;
	String name;
	
	//无参构造方法
	public Structure(){
		age=10;
		name="张三";
		System.out.println("执行无参构造方法");
	}
	
	//有参构造方法
		public Structure(int age,String name){
			this.age=age;
			this.name=name;
			System.out.println("执行有参构造方法");
		}
		
		public void show(){
			System.out.println("name："+name+"\t\n"+"age："+age);
		}
		//封装
		public void setAge(int age){
			if(age>120||age<0){
				System.out.println("你不能使用");
			}else{
				this.age=age;
			}
		}
		
		public int getAge(){
			return this.age;
		}
}
