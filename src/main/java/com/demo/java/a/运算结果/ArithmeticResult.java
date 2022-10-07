package com.demo.java.a.运算结果;
import java.util.Scanner;
public class ArithmeticResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int jf1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int jf2 = sc.nextInt();
		int he = jf1 + jf2;
		int ji = jf1 * jf2;
		int cha = jf1 - jf2;
		int shang = jf1 / jf2;
		System.out.println("求和结果："+he);
		System.out.println("求积结果："+ji);
		System.out.println("求差结果："+cha);
		System.out.println("求商结果："+shang);
	}

}
