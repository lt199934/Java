package com.demo.oop.homework.list;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		list.add(new Peguin("欧欧","Q仔"));
		list.add(new Peguin("亚亚","Q妹"));
		list.add(new Peguin("菲菲","Q妹"));
		list.add(new Peguin("美美","Q妹"));
		System.out.println("共计有"+list.size()+"只企鹅\n分别是：");
		for (int i = 0; i < list.size(); i++) {
			Peguin p = (Peguin)list.get(i);
			System.out.println(p.getName()+"\t"+p.getSex());
		}
		list.remove(2);
		list.remove(2);
		System.out.println("\n删除之后还有"+list.size()+"只企鹅\n分别是：");
		for (int i = 0; i < list.size(); i++) {
			Peguin p = (Peguin)list.get(i);//强制转化
			System.out.println(p.getName()+"\t"+p.getSex());
		}
		boolean a=list.contains(new Peguin("美美","Q妹"));
		if(a==false){
		System.out.println("\n集合中不包含美美的信息");
		}
		
	}

}
