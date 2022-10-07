package com.demo.oop.homework.rent;

public final class Car extends Moto {
	private String type;
	
	public void car(int days,String type,String no) {
		System.out.println("为你分配的车牌号为："+no);
		int price=0;
		if("550i".equals(type)){
			price=days*500;
		}
		if("商务舱GL8".equals(type)){
			price=days*600;
		}
		if("林荫大道".equals(type)){
			price=days*300;
		}
		super.CalcRent(price);
	}
		
	
	public Car() {
		
	}
	public Car(String no, String brand, String color, String mileage,String type) {
		super(no,brand,brand,mileage);
		this.type = type;
	}
	public Car(String type) {
		super();
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
