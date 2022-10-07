package com.demo.oop.exciseEdu.customerBiz;
import java.util.Scanner;
public class Cutest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerBiz cut = new CustomerBiz();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入客户的名字：");
			String name = sc.next();
			cut.addName(name);
			System.out.println("是否继续：（y/n）");
			String a = sc.next();
			if("n".equals(a)){
				break;
			}

		}
		cut.showNames();
		System.out.println("\n**********查找名字**********");
		System.out.println("请输入查找人姓名：");
		String a = sc.next();
		boolean temp=cut.select(a);
		if(temp){
			System.out.println("找到了");
		}else{
			System.out.println("没有找到");
		}

		System.out.println("\n**********修改姓名**********");
		System.out.println("请输入旧名字：");
		String n = sc.next();
		System.out.println("请输入新名字：");
		String nn = sc.next();
		boolean temp1=cut.repair(n,nn);
		if(temp1){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
		cut.showNames();

		System.out.println("\n**********查找**********");
		System.out.println("请输入开始位置");
		int aa = sc.nextInt();
		System.out.println("请输入开始位置");
		int bb = sc.nextInt();
		System.out.println("请输入名字");
		String na = sc.next();
		boolean temp2=cut.zhao(aa,bb,na);
		if(temp2){
			System.out.println("找到了");
		}else{
			System.out.println("没有找到");
		}
	}

}
