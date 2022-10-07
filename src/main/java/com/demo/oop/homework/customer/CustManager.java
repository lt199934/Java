package com.demo.oop.homework.customer;

public class CustManager {
	Customer[] customers = new Customer[100];
	public boolean add(Customer cust){
		boolean temp = false;
		for (int i = 0; i < customers.length; i++) {
			if(customers[i]==null){
				customers[i] = cust;
				temp = true;
				break;
			}
		}
		
		return temp;
	}
	public void show(){
		System.out.println("***会员列表***");
		System.out.println("编号\t积分");
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]+"\t"+customers[i].scroe);
		}
	}
	public void searchScore(int id){
		int temp = 0;
		for (int i = 0; i < customers.length; i++) {
			if(customers[i].id==id){
				System.out.println("该会员的积分为："+customers[i].scroe);
				temp = 1;
				break;
			}
		}
		if(temp == 0){
			System.out.println("该会员d不存在");
		}
	}
}
