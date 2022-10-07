package com.demo.oop.exciseEdu.register;

public class Register {
		public boolean vreify(User user){
			if(user.idCard.length()!=18){
				System.out.println("身份证号码长度必须为18位！");
				return false;
			}
			if(!isNumTwo(user.idCard.substring(0,17))){
				System.out.println("身份证 前17 位必须为数字");
				return false;
			}
			
			if(user.num1.length()!=11){
				System.out.println("手机号码必须是11位");
				return false;
			}
			if(!isNumTwo(user.num1)){
				System.out.println("手机号码必须全部为数字");
				return false;
			}
			if(!"1".equals(user.num1.substring(0,1))){
				System.out.println("手机号第一位必须为1");
				return false;
			}
			
			if( "2".equals(user.num1.substring(1,2)) 
					|| "0".equals(user.num1.substring(1,2))){
				System.out.println("手机号第二位不能为0和2");
				return false;
			}
			
			int num=user.num2.indexOf("-");
			if(num==-1){
				System.out.println("必须包含-");
				return false;
			}
			
			String tempTel = user.num2.substring(0,num);
			if(tempTel.length()!=3&&tempTel.length()!=4){
				System.out.println("座机号码区号必须为3或4位");
				return false;
			} 
			
			tempTel = user.num2.substring(num+1);
			if(tempTel.length()<7){
				System.out.println("座机号不能小于7位");
				return false;
			}
			
			if(!isNumTwo(user.num2.substring(0,num))){
				System.out.println("座机 区号必须为数字");
				return false;
			}
			if(!isNumTwo(tempTel)){
				System.out.println("座机 号码必须为数字");
				return false;
			}
			return true;
			}
		public boolean isNum(String a){
			switch(a){
				case"0":
				case"1":
				case"2":
				case"3":
				case"4":
				case"5":
				case"6":
				case"7":
				case"8":
				case"9":
					return true;
				default :
					return false;
			}
		}
		
		public boolean isNumTwo(String temp){
			for(int i=0; i<temp.length(); i++){
				String a = temp.substring(i,i+1);
				switch(a){
					case"0":
					case"1":
					case"2":
					case"3":
					case"4":
					case"5":
					case"6":
					case"7":
					case"8":
					case"9":
						break;
					default :
						return false;
				}
			}
			
			return true;
		}
		
		public boolean isNumthree(String temp){
			for(int i=0; i<temp.length(); i++){
				String a = temp.substring(i,i+1);
				for(int j=0; j<=9; j++){
					if(!(""+j).equals(a)){
						return false;
					}
				}
			}
			
			return true;
		}
		}


