package com.demo.oop.exciseEdu.customerBiz;

public class CustomerBiz {
		String[] names = new String[50];
		public void addName(String name){
			for(int i=0;i < names.length;i++){
				if(names[i] == null){
					names[i] = name;
					break;
				}
				
			}
			
		}
		public void showNames(){	
		for(int i=0;i<names.length;i++){
			if(names[i] == null){
				break;
				}
			System.out.print(names[i]+"\t");
			
			}
		}
		public boolean select(String name){
			
			for(int i=0;i<names.length;i++){
				if(name.equals(names[i])){
					return true;
					}
				}
			return false;
		}
		
		public boolean repair(String oldname, String newname){
			for(int i=0;i<names.length;i++){
				if(oldname.equals(names[i])){
					names[i]= newname;
					return true;
					}
				}
			return false;
		}
		public boolean zhao(int a,int b,String name){
			if(a<b || a<names.length || b<=names.length){
			for(int i=a-1;i<b;i++){
				if(name.equals(names[i])){
					return true;
					}
				}
			}
			return false;
		}
}
