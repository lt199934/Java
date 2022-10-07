package com.demo.oop.homework.printer;

public  class Printer {
	public void print(Box box,String temp){
		if(box instanceof BlackBox){
			BlackBox box1 = (BlackBox)box;
			box1.getColor();
		}else if(box instanceof ColorBox){
			ColorBox box1 = (ColorBox)box;
			box1.getColor();
		}
		System.out.println(temp);
	}
}
