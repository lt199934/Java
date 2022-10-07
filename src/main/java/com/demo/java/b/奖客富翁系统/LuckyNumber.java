package com.demo.java.b.奖客富翁系统;
import java.util.Scanner;
public class LuckyNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String chance = "y";
		String username ="";
		String pass ="0";
		int num=0;
		int sjs=0;
		boolean temp = true;
		int[] a = new int[4];
		while( chance.equals("y")) {
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("*************************");
			System.out.print("请输入菜单：");
			num = sc.nextInt();
			if(num > 3){
				System.out.println("[您的输入有误！]");
			}else{
				switch(num){
					case 1:
						System.out.println("[奖客富翁系统 > 注册]");
						System.out.print("请输入用户名：");
						username =sc.next();
						System.out.print("请输入密码：");
						pass = sc.next();
						System.out.println("注册成功，请记住你的会员卡号");
						for(int i=0; i<4; i++){
							sjs =(int) (Math.random()*9000)+1000;
							a[i] = sjs;
						}
						System.out.println("用户名\t密码\t会员卡号");
						System.out.println(username+"\t"+pass+"\t"+sjs);
						break;
					case 2:
						System.out.println("[奖客富翁系统 > 登录]");
						if (temp) {
							temp=false;
							System.out.println("[请先注册，再登录]");
						}else{

							for(int i=0;i<3;i++){
								System.out.print("请输入用户名：");
								String username1 =sc.next();
								System.out.print("请输入密码：");
								String pass1 = sc.next();
								if(username.equals(username1)&& pass.equals(pass1)){
									System.out.println("欢迎登陆奖客富翁系统系统！");
									System.out.println("欢迎您"+username+"！！！");
									break;
								}else{
									System.out.println("用户名或密码输入错误！你还有"+(2-i)+"次机会！\n");
									if(i==2){
										System.out.println("您没有机会了！！！");
									}
									continue;
								}
							}
						}
						break;
					case 3:
						System.out.println("[奖客富翁系统 > 抽奖]");
						if (temp) {
							temp=false;
							System.out.println("请先登录 ，再抽奖");
						}else{
							System.out.print("请输入您的卡号：");
							if(num>=1000&&num<10000){
								int []b = new int[4];
								int []c = new int[4];
								int []d = new int[4];
								int []f = new int[4];
								int []g = new int[4];
								for(int i=0; i<b.length; i++){
									int shu =(int) (Math.random()*10);
									b[i]=shu;
								}
								for(int i=0; i<c.length; i++){
									int shu =(int) (Math.random()*10);
									c[i]=shu;
								}
								for(int i=0; i<d.length; i++){
									int shu =(int) (Math.random()*10);
									d[i]=shu;
								}
								for(int i=0; i<f.length; i++){
									int shu =(int) (Math.random()*10);
									f[i]=shu;
								}
								for(int i=0; i<g.length; i++){
									int shu =(int) (Math.random()*10);
									g[i]=shu;
								}
								System.out.print("本日的幸运数字为：\t"+b[0]+b[1]+b[2]+b[3]+"\t"+c[0]+c[1]+c[2]+c[3]+"\t"+d[0]+d[1]+d[2]+d[3]+"\t"+f[0]+f[1]+f[2]+f[3]+"\t"+g[0]+g[1]+g[2]+g[3]+"\t");
								if(a[0]==b[0]&&a[1]==b[1]&&a[2]==b[2]&&a[3]==b[3]){
									System.out.println("恭喜您！！！成为今天的幸运用户");
									System.out.println("奖励苹果手机一部！！！");
								}else if(a[0]==c[0]&&a[1]==c[1]&&a[2]==c[2]&&a[3]==c[3]){
									System.out.println("恭喜您！！！成为今天的幸运用户");
									System.out.println("奖励苹果手机一部！！！");
								}else if(a[0]==d[0]&&a[1]==d[1]&&a[2]==d[2]&&a[3]==d[3]){
									System.out.println("恭喜您！！！成为今天的幸运用户");
									System.out.println("奖励苹果手机一部！！！");
								}else if(a[0]==f[0]&&a[1]==f[1]&&a[2]==f[2]&&a[3]==f[3]){
									System.out.println("恭喜您！！！成为今天的幸运用户");
									System.out.println("奖励苹果手机一部！！！");
								}else if(a[0]==g[0]&&a[1]==g[1]&&a[2]==g[2]&&a[3]==g[3]){
									System.out.println("恭喜您！！！成为今天的幸运用户");
									System.out.println("奖励苹果手机一部！！！");
								}else{
									System.out.println("\n抱歉！您不是本日的幸运用户！！！");
								}
							}else{
								System.out.println("输入错误");
							}
						}
						break;
				}
			}
			System.out.print("\n继续吗？（y/n）:");
			chance = sc.next();
		}
	}
}

