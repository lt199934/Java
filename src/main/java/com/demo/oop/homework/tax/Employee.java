package com.demo.oop.homework.tax;

public class Employee {
	String name;//员工姓名
	double salary;//工资
	double subsidy;//加班补贴
	public void setter(double salary, double subsidy){
		double rate = 0;
		double preTax=salary+subsidy;//税前收入
		double income=0;//所得税额
		double num=preTax-2000;//应纳税额
//		double postTax=preTax-income;//税后收入
		if(preTax>=2000){
			if(num>=0&&num<=500){
				rate = 0.05;
			}
			if(num>500&&num<=2000){
				rate = 0.1;
			}
			if(num>2000&&num<=5000){
				rate = 0.15;
			}
			if(num>5000&&num<=20000){
				rate = 0.2;
			}
			if(num>20000){
				rate = 0.3;
			}
			
		}else{
			num=0;
			income=0;//所得税额
		}
			 income=num*rate;//所得税额
			double postTax=preTax-income;//税后收入
			
		System.out.println("员工"+name+"的税前收入为"+preTax+"元，税后收入为"+postTax+"元，您缴纳的个人所得税为"+income+"元");
	}
}
