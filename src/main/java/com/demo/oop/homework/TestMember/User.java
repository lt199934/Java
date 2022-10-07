package com.demo.oop.homework.TestMember;

public class User {
	String[]names = new String[50];
	String[]namess = new String[50];
	public void addName(String name,String namee){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				names[i]=name;
				break;
			}

		}
		for(int i=0;i<namess.length;i++){
			if(namess[i]==null){
				namess[i]=namee;
				break;
			}
		}
	}

	public void showName(){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				break;
			}
			System.out.println(names[i]+"\t");
		}
		for(int i=0;i<namess.length;i++){
			if(namess[i]==null){
				break;
			}
			System.out.println(namess[i]+"\t");
		}
	}


	public boolean search(String name){
		for(int i=0;i<names.length;i++){
			if(names[i]==null){
				System.out.print("查询不到此会员，查询结束");
				return true;
			}
			if(names[i].equals(name)){
				System.out.print("该会员的积分为："+namess[i]+"\t");
				return true;
			}
		}
		return false;
	}

}

