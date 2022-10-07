package com.demo.oop.exciseEdu.tourist;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Tourist tour = new Tourist();
		while(true){
			System.out.print("请输入姓名：");
			tour.name=sc.next();
			System.out.print("请输入年龄：");
			tour.age=sc.nextInt();
			if(tour.age >= 18&&tour.age < 60){
				tour.picket="20";
			}else{
				tour.picket="免门票";
			}
			tour.showTour();
			System.out.println("是否继续（y/n）");
			String close = sc.next();
			if(!"y".equals(close)){
				System.out.println("退出程序");
				break;
			}
			
		}
	}

}
