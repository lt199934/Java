package com.demo.oop.exciseEdu.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		List list = new ArrayList();
		list.add(123);
		list.add("你好");
		list.add("hello");
		list.add("dog");//添加元素
		list.add(1, "aaa");//在指定位置添加元素
		list.remove(1);//删除指定位置元素
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		List l = new LinkedList();
		l.add(123);
		l.add("你好");
		l.add("hello");
		l.add("dog");//添加元素
		l.add(1, "aaa");//在指定位置添加元素
		l.remove(1);//删除指定位置元素
	}

}
