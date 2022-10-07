package com.demo.java.b.for循环;
import java.util.Scanner;

/**
 * @Program: java
 * @ClassName Book
 * @Author: liutao
 * @Description: 插入书籍
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] books ={"Computer","Hiberate","Java","Struts"};
		String[] newbooks =new String[books.length+1];
		String book = "";
		System.out.print("插入前的数组为：");
		for(int i=0;i<books.length; i++){
			System.out.print(books[i]+",");
		}
		System.out.println();
		System.out.print("请输入新书名称：");
		book = sc.next();
		for(int i=0;i<books.length; i++){
			newbooks[i]=books[i];
		}
		int index = -1;
		for(int i=0; i<books.length; i++){
			if(books[i].compareToIgnoreCase(book)>0){ //把前后的字符进行比较
				index = i;
			}
		}
		for(int i=newbooks.length-1; i>index; i--){
			newbooks[i] = newbooks[i-1];   //将字符后移一位数
			newbooks[i]=book;
		}
		System.out.print("插入后的数组为：");
		for(int i=0; i<newbooks.length; i++){
			System.out.print(newbooks[i]+",");
		}
//

	}

}
