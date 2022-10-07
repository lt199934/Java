package com.demo.java.d.万年历;
import java.util.Scanner ;
public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("***************欢迎使用万年历***************");
		System.out.print("请输入年份：");
		int year1 = sc.nextInt(); //输入年份
		System.out.println("");
		System.out.print("请输入月份：");
		int mon = sc.nextInt(); //输入月份份
		boolean isBigYear = false; //判断是否为闰年
		int days=0; //天数
		if((year1%4==0&&year1%100!=0)||year1%400==0){
			isBigYear = true;
		}else{
			isBigYear = false;
		}
		if(isBigYear){
			System.out.println(year1+"  "+"闰年"+"  "+"366天");

		}else{
			System.out.println(year1+"  "+"平年"+"  "+"365天");
		}

		switch(mon){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if(isBigYear){
					days=29;

				}else{
					days=28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
		}
		System.out.println(mon+"月  "+"共"+days+"天");
		int sumYearsDays=0;
		for(int i=1900; i<year1; i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				sumYearsDays+=366;
			}else{
				sumYearsDays+=365;
			}
		}
		System.out.println("输入年份距1900年1月1日的天数："+sumYearsDays);
		int sumMonthDays=0;
		for(int i=1;i<mon;i++){
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
				sumMonthDays+=31;
			}else if(i==4||i==6||i==9||i==11){
				sumMonthDays+=30;
			}else{
				if(isBigYear){
					sumMonthDays+=29;

				}else{
					sumMonthDays+=28;
				}
			}
		}
		int sumDays=sumYearsDays+sumMonthDays;
		System.out.println("输入年份距1900年1月1日的天数："+sumDays);
		int week=sumDays%7+1;
//				if(week==7){
//					week=0;
//				}
		System.out.println("第一天是星期几:"+week);
		System.out.println("星期一"+"\t"+"星期二"+"\t"+"星期三"+"\t"+"星期四"+"\t"+"星期五"+"\t"+"星期六"+"\t"+"星期日");
		for(int i=0;i<week-1;i++){
			System.out.print(""+"\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if((i+week-1)%7==0){
				System.out.println();
			}
		}
	}
}
