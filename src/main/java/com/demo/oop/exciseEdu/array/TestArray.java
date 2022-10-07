package com.demo.oop.exciseEdu.array;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayDemo arrayDemo = new ArrayDemo();
		String [] n = {"f","v","a","c"};
		arrayDemo.showNames(n);
		arrayDemo.myArraySort(n);
		arrayDemo.showNames(n);
		arrayDemo.show(n);
	}

}
