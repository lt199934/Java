package com.demo.oop.homework.counter;

public class Counter {
	public void sreach(Count count){
		int a = 0;//定义出现次数
		int numa = count.str1.indexOf(count.str2);//第一次需要查询字符的返回值
		int numb = count.str1.lastIndexOf(count.str2);//第三次需要查询字符的返回值
		int numc = count.str1.lastIndexOf(count.str2,numb-1);//第二次需要查询字符的返回值
			if(numa!=-1){
				a++;
			}
			if(numb!=-1){
				a++;
			}

			if(numc!=-1){
				a++;
			}
			if(numa==numb || numa==numc){
				a--;
			}
//		System.out.println(numa);//第一次字符出现的位置
//		System.out.println(numb);//第三次字符出现的位置
//		System.out.println(numc);//第二次字符出现的位置
		System.out.println("”"+count.str1+"。“中"+"包含”"+a+"个”"+count.str2+"“");
	}
}
