package com.demo.oop.homework.rent;

public final class Bus extends Moto {
	private int seatCount;

	public void bus(int days,int seatCount,String no) {
		int price=0;
		System.out.println("为你分配的车牌号为："+no);
		if(seatCount<=16){
			price=days*800;
		}
		if(seatCount>16){
			price=days*1500;
		}
		super.CalcRent(price);
	}
	
	public Bus() {
		super();
	}

	public Bus(String no, String brand, String color, String mileage,int seatCount) {
		super(no,brand,brand,mileage);
		this.seatCount = seatCount;
	}
	public Bus(int seatCount) {
		super();
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
}
