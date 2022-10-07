package com.demo.oop.exciseEdu.log4j.src.log4j;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Logger logger = Logger.getLogger(Test.class.getName());
		int c = 0;
		int a = 0;
		int b = 0;
		try{
		System.out.println("请输入被除数");
		a = sc.nextInt();
		System.out.println("请输入");
		b = sc.nextInt();
		c = a / b;
		System.out.println("结果为："+"a/b="+c);
		}catch(InputMismatchException ex){
		logger.error("除数和被除数为整数");
		ex.printStackTrace();
		System.exit(1);
		}catch(ArithmeticException ex){
			logger.warn("除数不为0");
			ex.printStackTrace();
			System.exit(1);
		}
		logger.info("a/b="+c);
		
	}

}
