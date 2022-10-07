package com.demo.java.b.彩票系统;

import java.util.Scanner;

public class Caipiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []one = new int []{0,1,2,3,4,5,6,7,8,9};
		int sjs1 = (int)(Math.random()*10);
		int sjs2 = (int)(Math.random()*10);
		int sjs3 = (int)(Math.random()*10);
		int []two = new int []{sjs1,sjs2,sjs3};
		System.out.println("请输入三个数：");
		for(int i=0; i<two.length;i++){
			two[i] =sc.nextInt();
		}
		for(int i=0; i<two.length;i++){
			if(two[0]==two[1]&&two[1]==two[2]){
				System.out.println("豹子 中奖10000");
				break;
			}else if((two[1]-two[0]==1&&two[2]-two[1]==1)||(two[1]-two[0]==-1&&two[2]-two[1]==-1)){
				System.out.println("顺子 中奖8000");
				break;
			}else if((two[1]-two[0]==2&&two[2]-two[0]==1)||(two[1]-two[0]==1&&two[2]-two[0]==-1)||(two[1]-two[0]==-1&&two[2]-two[0]==-2)){
				System.out.println("中奖160");
				break;
			}else if(two[0]==1&&two[1]==5&&two[2]==8){
				System.out.println(" 中奖1000");
				break;
			}else {
				System.out.println("未中奖，谢谢参与！！！");
				break;
			}
		}
	}
}
