package com.demo.oop.exciseEdu.cell;

public class Cell {
	String brand;
	int volume;
	public void testCell(){
		volume+=5;
		if(volume > 100){
			volume =100;
		}
	}
	public int add(){
		return volume;
	}
} 
	

