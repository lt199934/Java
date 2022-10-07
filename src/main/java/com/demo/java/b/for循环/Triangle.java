package com.demo.java.b.for循环;

/**
 * @Program: java
 * @ClassName Triangle
 * @Author: liutao
 * @Description: 打印三角形
 * @Create: 2022-10-07 12:34
 * @Version 1.0
 **/
public class Triangle {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
			for(int j=0;j<=i; j++){      //j<=i等于j<i+1//正三角
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
		int row1=5;
		for(int i=0; i<row1; i++){
			for(int j=0;j<row1-i-1; j++){      //反三角
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------");
		for(int i=0; i<5; i++){
			for(int j=0;j<2*i+1; j++){
				System.out.print("*");
		}
			System.out.println();
		}


		int row2=5;
		for(int i=0; i<row2; i++){
			for(int j=0;j<row2-i-1; j++){      //菱形
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1; j++){
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row2-1; i>0; i--){
			for(int j=0;j<row2-i; j++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1; j++){
			System.out.print("*");
			}
			System.out.println();
		}
    }
}
