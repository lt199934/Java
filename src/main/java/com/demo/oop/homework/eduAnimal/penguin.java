package com.demo.oop.homework.eduAnimal;

public class penguin {
	private String name;
	private int health;
	private int love;
	private String sex;
	//无参构造方法
		public penguin(){
			System.out.println("执行无参构造方法");
		}
	//有参构造方法
		public penguin(String name,int health,int love,String sex){
			this.name=name;
			this.setHealth(health);
			this.love=love;
			this.sex=sex;
			System.out.println("执行有参构造方法");
		}
	//打印信息
		public void print(){
			System.out.println("姓名："+name+"\n健康值："+health+"\n亲密度："+love+"\n品种："+sex+"\n");
		}
		//封装
		public void setName(String name){
			this.name=name;
		}
	
		public String getName(){
			return this.name;
		}
		public void setLove(int love){
			this.love=love;
		}
		
		public int getLove(){
			return this.love;
		}
		public void setHealth(int health){
			if(health<=0){
					System.out.println("你的"+this.name+"已经死了");
			}else if(health>100){
					System.out.println("健康值大于100");
			}else{
					this.health=health;
			}
		}
			
		public int getHealth(){
			return this.health;
		}
		public void setSex(String sex){
			this.sex=sex;
		}
	
		public String getSex(){
			return this.sex;
		}
		
}
