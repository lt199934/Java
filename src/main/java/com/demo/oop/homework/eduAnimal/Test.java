package com.demo.oop.homework.eduAnimal;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Dog d=new Dog("小美",100,50,"阿拉斯加犬");
		d.print();
		
		penguin png=new penguin("Q仔",100,50,"雄");
		png.print();
		
	}

}
