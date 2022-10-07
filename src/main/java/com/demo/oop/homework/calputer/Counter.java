package com.demo.oop.homework.calputer;

public class Counter {
double num1;
double num2;
double sum;
public double add(double num1,double num2){
	sum=num1+num2;
	return sum;
}

public double reduce(double num1,double num2){
	sum=num1-num2;
	return sum;
}

public double multiply(double num1,double num2){
	sum=num1*num2;
	return sum;
}

public double divide(double num1,double num2){
	if(num2 == 0){
		System.out.println("除数不能为0");
	}
	sum=num1/num2;
	return sum;
}
}
