package com.demo.java.b.ATM银行系统.mine.a;
import java.util.Scanner;
/**
 * author: liutao
 * program: ATM小练习
 * date: 2022-3-14 01:23
 * */
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String[] userName = {"aaa","bbb","ccc"}; //用户名
		String[] userPass = {"111","123","321"}; //密码
		double[] moneys = {3000,400,609.7};          //金额
		boolean[] isLogin = {false,false,false};//用户登录状态
		String[] names = {"张三","李四","王五"};
		int loginNum=0;
		menu:
		while(true){
			System.out.println("欢迎进入ATM银行系统");
			System.out.println("\t1.查询");
			System.out.println("\t2.存钱");
			System.out.println("\t3.取钱");
			System.out.println("\t4.转账");
			System.out.println("\t5.登录");
			System.out.println("\t6.取卡\n");
			System.out.print("请选择：");
			int num = sc.nextInt();
			if(num==1){
				//判断用户登录状态
				if(isLogin[loginNum] == true){
					System.out.println("欢迎进入ATM银行系统  > 查询");
					System.out.println("姓名\t\t用户名\t密码\t余额\t\t登录状态");
					System.out.println(names[loginNum]+"\t\t"+userName[loginNum]+"\t\t"+userPass[loginNum]+"\t"+moneys[loginNum]+"\t"+isLogin[loginNum]);
				}else{
					System.out.println("请先登录!");
				}
			}else if(num==2){
				if(isLogin[loginNum] == true){
					System.out.println("欢迎进入ATM银行系统  > 存钱");
					System.out.print("请输入存款金额：");
					int money = sc.nextInt();
					if(money%100==0&&money<=9900 && money >= 100){
						moneys[loginNum] += money;
						System.out.print("你已成功存款："+moneys[loginNum]+"\n");
					}else{
						System.out.println("金额有误！单笔最高9900，必须存取整百");
					}
				}else{
					System.out.println("请先登录！");
				}
			}else if(num==3){
				if(isLogin[loginNum] == true){
					System.out.println("欢迎进入ATM银行系统  > 取钱");
					System.out.print("请输入您的取款金额：");
					int money =sc.nextInt();
					if(money%100==0&&money<=9900){
						if(money <= moneys[loginNum]){
							moneys[loginNum] -= money;
							System.out.println("取款成功！请收好您的money");
						}else{
							System.out.println("余额不足！");
						}
					}else{
						System.out.println("金额有误！单笔最高5000，必须存取整百");
					}
				}else{
					System.out.println("请先登录！");
				}
			}else if(num==4){
				if(isLogin[loginNum] == true){
					System.out.println("欢迎进入ATM银行系统  > 转账");
					System.out.println("请输入对方卡号：");
					String tempname=sc.next();
					System.out.println("请输入转账金额");
					double money = sc.nextDouble();
					int usernum = -1;
					for(int i=0; i<userName.length; i++){
						if(tempname.equals(userName[i])){
							usernum = i;
							System.out.println("卡号为"+usernum);
							break;
						}
					}
					if(usernum != -1){
						System.out.println("请核对对方信息！");
						System.out.println("姓名\t用户名");
						System.out.println(names[usernum]+"\t"+userName[usernum]);
						System.out.println("确定是否转账(y/n)");
						String temp = sc.next();
						if("y".equals(temp)){
							if(money>0 && money <= moneys[loginNum]){
								moneys[loginNum] -= money;
								moneys[usernum] += money;
								System.out.println("转账成功！");
							}else{
								System.out.println("余额不足！");
							}
						}else{
							System.out.println("转账失败");
						}
					}else{
						System.out.println("账号不存在！转账失败");
					}
				}else{
					System.out.println("请先登录！");
				}
			}else if(num==5){
				login:
				for(int j =0; j<3; j++) {
					System.out.println("欢迎进入ATM银行系统  > 登录");
					System.out.println("请输入用户名");
					String name = sc.next();
					System.out.println("请输入密码");
					String pass = sc.next();
					boolean templogin = false;
					for (int i = 0; i < userName.length; i++) {
						//模拟判断用户和密码在数据库中是否存在
						if (name.equals(userName[i]) && pass.equals(userPass[i])) {
							loginNum = i;//把存在用户的下标赋值给登录id，模拟数据库里的用户唯一id
							isLogin[i] = true;//把登录状态设置为一登录true
							templogin = true;
							System.out.println("卡号为" + i);
							System.out.println("欢迎" + userName[i] + "进入ATM银行系统");
							break login;
						}
					}
					if(!templogin){
						System.out.println("登录失败！还有"+(2-j)+"机会");
						if(j==2){
							System.out.println("卡已经被吞掉！请联系110！");
							break menu;
						}
					}
				}
			}else if(num==6){//取卡
				System.out.print("继续吗？（y/n）：");
				String close = sc.next();
				if("y".equals(close)){
					System.out.println("请取走您的卡片！");
					break;
				}
			}else{
				System.out.println("输入有误，请重新输入");
				continue;
			}
		}
	}
}
