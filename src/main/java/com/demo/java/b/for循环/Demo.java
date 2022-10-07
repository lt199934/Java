package com.demo.java.b.for循环;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int row2=5;
		for(int i=0; i<row2; i++){
			for(int j=0;j<row2-i-1; j++){      
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
