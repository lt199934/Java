package com.demo.java.b.ATM银行系统.teacher;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String[] usernames = {"aaa","bbb","ccc"};
		String[] userpasss = {"111","123","321"};
		double[] moneys = {995.6,3000,50.7};
		String[] names = {"张三","李四","王五"};
		boolean[] logins={false,false,false};
		int loginNum=0;
		menu:
		while(true){
			System.out.println("欢迎来到ATM银行系统");
			System.out.println("    1、查询");
			System.out.println("    2、存钱");
			System.out.println("    3、取钱");
			System.out.println("    4、转账");
			System.out.println("    5、登录");
			System.out.println("    6、取卡");
			System.out.println("请选择菜单：");
			int num = sc.nextInt();
			if(num == 1){
				if(logins[loginNum] == true){
					System.out.println("姓名\t用户名\t密码\t余额\t状态");
					System.out.println(names[loginNum]+"\t"+usernames[loginNum]+"\t"+userpasss[loginNum]+"\t"+moneys[loginNum]+"\t"+logins[loginNum]);
				}else{
					System.out.println("请先登录！");
				}
			}else if(num == 2){
				if(logins[loginNum] == true){
					System.out.println("请输入存款金额");
					int money = sc.nextInt();
					if(money % 100 == 0 && money <= 9900 && money >= 100){
						moneys[loginNum] += money;
						System.out.println("存款成功！");
					}else{
						System.out.println("金额有误！单笔最高9900，必须存取整百");
					}
				}else{
					System.out.println("请先登录！");
				}
			}else if(num == 3){
				if(logins[loginNum] == true){
					System.out.println("请输入取款金额");
					int money = sc.nextInt();
					if(money % 100 == 0 && money <= 5000 && money >= 100){
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
			}else if(num == 4){
				if(logins[loginNum] == true){
					System.out.println("请输入对方卡号：");
					String tempname=sc.next();
					System.out.println("请输入转账金额");
					double money = sc.nextDouble();
					int usernum = -1;
					for(int i=0; i<usernames.length; i++){
						if(tempname.equals(usernames[i])){
							usernum = i;
						}
					}
					if(usernum != -1){
						System.out.println("请核对对方信息！");
						System.out.println("姓名\t用户名");
						System.out.println(names[usernum]+"\t"+usernames[usernum]);
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
			}else if(num == 5){
				for(int i=0; i<logins.length; i++){
					logins[i]=false;
				}
				for(int i =0; i<3; i++){
					System.out.println("请输入用户名：");
					String tempname=sc.next();
					System.out.println("请输入密码：");
					String temppass=sc.next();
					boolean templogin = false;
					for(int j=0; j<usernames.length; j++){
						if(tempname.equals(usernames[j]) && temppass.equals(userpasss[j])){
							logins[j]=true;
							System.out.println("登录成功！欢迎："+usernames[j]+"来到ATM系统");
							templogin=true;
							loginNum=j;
							continue menu;
						}
					}
					if(!templogin){
						System.out.println("登录失败！还有"+(2-i)+"机会");
						if(i==2){
							System.out.println("卡已经被吞掉！请联系110！");
							break menu;
						}
					}
				}


			}else if(num == 6){
				System.out.println("请取走您的卡片！");
				break;
			}else{
				System.out.println("输入错误！请重新输入");
			}
		}
	}

}
