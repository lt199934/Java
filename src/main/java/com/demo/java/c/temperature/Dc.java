package com.demo.java.c.temperature;

public class Dc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wendu = 0;
		double huashiwendu;
		System.out.println("摄氏温度    \t\t\t"+"华氏温度");
		do{
			huashiwendu = wendu * 9 / 5.0 + 32;
			System.out.println(wendu    +"\t\t\t"+huashiwendu);
			System.out.println();
			wendu = wendu +20;
		}while( wendu <= 180);
	}
}
