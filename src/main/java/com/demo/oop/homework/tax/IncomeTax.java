package com.demo.oop.homework.tax;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("请输入员工的姓名：");
		employee.name=sc.next();
		System.out.println("请输入员工工资：");
		double salary=employee.salary=sc.nextDouble();
		System.out.println("请输入员工的姓名加班补贴：");
		double subsidy=employee.subsidy=sc.nextDouble();
		employee.setter(salary,subsidy);
	}

}
