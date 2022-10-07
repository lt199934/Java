package com.demo.oop.homework.rent;

public abstract class Moto {
	private String no;
	private String brand;
	private String color;
	private String mileage;
	
	public void CalcRent(int price){
		System.out.println("顾客您好，您需要支付的租您费用是"+price);
	}
	public Moto() {
		super();
	}
	public Moto(String no, String brand, String color, String mileage) {
		super();
		this.no = no;
		this.brand = brand;
		this.color = color;
		this.mileage = mileage;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	
	
}