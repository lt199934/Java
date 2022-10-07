package com.demo.java.b.奖客富翁系统;

import java.util.Scanner;


public class EduSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] username = new String[100]; //用户名
		String[] userpass = new String[100]; //密码
		int[] idNo = new int[100];//会员卡号
		boolean[] isLogin = new boolean[100];//用户登录状态
		while(true){
			System.out.println("*****欢迎进入奖客翁系统*****");
			System.out.println("\t1注册");
			System.out.println("\t2登录");
			System.out.println("\t3抽奖");
			System.out.println("\t4查询所有注册信息");
			System.out.println("***********************");
			System.out.println("请选择菜单：");
			int num = sc.nextInt();
			if(num == 1){//注册
				System.out.println("[奖客翁系统 > 注册]");
				System.out.println("请填写个人注册信息");
				System.out.println("用户名");
				String name = sc.next();
				System.out.println("密码");
				String pass = sc.next();
				int idnum = (int)(Math.random()*9000)+1000;
				for(int i=0; i<username.length; i++){
					if(username[i] == null){
						username[i] = name;
						userpass[i] = pass;
						idNo[i] = idnum;
						System.out.println("注册成功！请记号您的会员卡号");
						System.out.println("用户名\t密码\t会员卡号");
						System.out.println(username[i] +"\t"+userpass[i] +"\t"+idNo[i]);
						break;
					}else{
						if(username.length-1 == i){
							System.out.println("注册失败！会员已被抢完");
						}
					}

				}
			}else if(num == 2){//登录
				System.out.println("[奖客翁系统 > 登录]");
				for(int i=0; i<3; i++){
					System.out.println("请输入用户名");
					String name = sc.next();
					System.out.println("请输入密码");
					String pass = sc.next();

					boolean tempIsLogin=false;
					//判断登录
					for(int j=0; j<username.length; j++){
						if(name.equals(username[j]) && pass.equals(userpass[j])){
							isLogin[j] = true;
							tempIsLogin = true;
							System.out.println("欢迎"+username[j]+"用户登录系统");
						}else{
							isLogin[j] = false;
						}
					}
					if(tempIsLogin){

						break;
					}else{
						System.out.println("用户名或密码错误！还有"+(2-i)+"次机会");
						if(i==2){
							System.out.println("没有机会了！");
							break;
						}
					}
				}
			}else if(num == 3){//抽奖

				int tempNum=0;
				//找到登录的会员号是那一个下标
				for(int j=0; j<isLogin.length; j++){
					if(isLogin[j] == true){
						tempNum = j;
						break;
					}
				}

				if(isLogin[tempNum]==true){//请先登录，在进行抽奖
					System.out.println("[奖客翁系统 > 抽奖]");
					System.out.println("请输入您的卡号");
					int newNum = sc.nextInt();
					if(newNum == idNo[tempNum]){//卡号与账号不一致或
						System.out.print("本日的幸运数字是：");
						int[] luckNum = new int[5];//中奖号码
						for(int i=0; i<luckNum.length;i++){//循环产生中奖号码 存入数组
							luckNum[i]=(int)(Math.random()*9000)+1000;
							System.out.print(luckNum[i]+"\t");
						}
						System.out.println();
						boolean isLuck=false;//判断是否中奖
						for(int i=0; i<luckNum.length;i++){
							if(idNo[tempNum] == luckNum[i]){
								isLuck = true;
								break;
							}
						}
						if(isLuck){
							System.out.println("中奖了");
						}else{
							System.out.println("抱歉没有中奖");
						}
					}else{
						System.out.println("卡号与账号不一致或输入错误");
					}
				}else{
					System.out.println("请先登录，在进行抽奖！");
				}
			}else if(num == 4){//查询所有注册用户信息
				System.out.println("用户名\t密码\t会员号");
				for(int i=0; i<username.length;i++){
					if(username[i]==null){
						break;
					}
					System.out.println(username[i]+"\t"+userpass[i]+"\t"+idNo[i]+"\t"+isLogin[i]);
				}
			}else{
				System.out.println("输入有误，请重新输入");
				continue;
			}
			System.out.println("继续吗？（y/n）");
			String close = sc.next();
			if(!"y".equals(close)){
				break;
			}
		}
	}

}
