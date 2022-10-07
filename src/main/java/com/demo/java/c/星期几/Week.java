package com.demo.java.c.星期几;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int num;
		do{
			System.out.print("请输入数字1-7（输入0 结束）：");
			num = sc.nextInt();
			i++;
			switch (num){
				case 1:
					System.out.println("今天是   MONDAY");
					break;
				case 2:
					System.out.println("今天是   TUESDAY");
					break;
				case 3:
					System.out.println("今天是   WENSDAY");
					break;
				case 4:
					System.out.println("今天是   THURSDAY");
					break;
				case 5:
					System.out.println("今天是   FRIDAY");
					break;
				case 6:
					System.out.println("今天是   SUNDAY");
					break;
				case 7:
					System.out.println("今天是  SATURDAY");
					break;
				default:
					System.out.println("对不起没有这个数");
					break;
			}

		}while(i <= 7 && num != 0);
		System.out.println("程序结束");
	}

}
