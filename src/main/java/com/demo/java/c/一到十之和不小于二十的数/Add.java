package com.demo.java.c.一到十之和不小于二十的数;

public class Add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10;i++){
			sum+=i;
			System.out.println(sum);
			if(sum>=20){
				System.out.println("第"+i+"位："+sum);
				break;
			}
		}
	}
}
