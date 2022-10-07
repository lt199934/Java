package com.demo.oop.homework.phoneteacher;

public class Cell {
	String cellName;
	int cellNum;
	
	public void addCell(){
		cellNum+=5;
		if(cellNum > 100){
			cellNum = 100;
		}
	}
	
	public int selectCell(){
		return cellNum;
	}
	
	public void updateCell(){
		cellNum -= 5;
		if(cellNum<0){
			cellNum = 0;
		}
	}
}
