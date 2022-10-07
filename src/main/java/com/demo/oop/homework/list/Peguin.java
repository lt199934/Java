package com.demo.oop.homework.list;

public  class Peguin {
	private String name;//姓名
	private String sex;//性别
	
	public Peguin() {//无参构造方法
		super();
	}
	public Peguin(String name, String sex) {//有参构造方法
		super();
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
