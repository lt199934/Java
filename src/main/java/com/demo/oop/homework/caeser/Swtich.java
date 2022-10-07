package com.demo.oop.homework.caeser;

public class Swtich {
	String aa = "abcdefghijklmnopqrstuvwxyzabc";
	public void Encyption(String num,int key,int keys){
		String newStr="";
		int x = 0;
		for (int i=0; i < num.length(); i++) {
			String a = num.substring(i,i+1);
			int b = aa.indexOf(a);
			if(b!=-1){
				b=(b+key+keys)%26;
				newStr+=aa.substring(b,b+1);
				b=(b+(int)(Math.random()*23423))%26;
				newStr+=aa.substring(b,b+1);
				b=(b+(int)(Math.random()*324325))%26;
				newStr+=aa.substring(b,b+1);
				b=(b+(int)(Math.random()*325435))%26;
				newStr+=aa.substring(b,b+1);
				b=(b+(int)(Math.random()*23543645))%26;
				newStr+=aa.substring(b,b+1);
				b=(b+(int)(Math.random()*353457688))%26;
				newStr+=aa.substring(b,b+1);
			}else{
				newStr+=a;
			}	
		}
		System.out.println("加密后：");
		System.out.println(newStr);
		System.out.println("请牢记您的密钥："+keys);
		
	}
	
	public void Decyption(String num){
		String newStr="";
		for (int i=0; i < num.length(); i++) {
			String a = num.substring(i,i+1);
			int b = aa.indexOf(a);
			if(b!=-1){
				b=(b)%26;
				newStr+=aa.substring(b,b+1);
			}else{
				newStr+=a;
			}	
		}
		System.out.println("解密后：");
		System.out.println(newStr);
		
		}
}
