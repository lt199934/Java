package com.demo.java.b.for循环;
import java.util.Arrays;
import java.util.Scanner;
public class AlphabeticSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String []zimu = new String[]{"a","c","u","b","e","p","f","z"};
		System.out.print("原字母排序：");
		for(int i=0; i<zimu.length; i++){
			System.out.print(zimu[i]);
		}
		Arrays.sort(zimu);
		System.out.println("");
		System.out.print("排序后：");
		for(int i=0; i<zimu.length; i++){
			System.out.print(zimu[i]);
		}
		System.out.println("");
		System.out.print("降序后：");
		for(int i=zimu.length-1; i>=0; i--){
			System.out.print(zimu[i]);
		}
	}
}