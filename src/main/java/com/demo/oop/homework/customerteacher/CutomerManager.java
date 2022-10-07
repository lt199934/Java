package com.demo.oop.homework.customerteacher;

public class CutomerManager {
	Customer[] customer = new Customer[4];
	
	//录入
	public boolean add(Customer cust){
		boolean temp = false;
		for (int i = 0; i < customer.length; i++) {
			if(customer[i]==null){
				customer[i] = cust;
				temp = true;
				break;
			}
		}
		
		return temp;
	}
	
	//显示
	public void show(){
		System.out.println("***会员列表***");
		System.out.println("编号\t积分");
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i].id+"\t"+customer[i].scroe);
		}
		
	}
	
	
	//通过编号查找积分
	public void selectId(int id){
		int temp = 0;
		for (int i = 0; i < customer.length; i++) {
			if(customer[i].id==id){
				System.out.println("该会员的积分为："+customer[i].scroe);
				temp = 1;
				break;
			}
		}
		if(temp == 0){
			System.out.println("该会员d不存在");
		}
	}
}
