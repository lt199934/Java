package com.demo.java.b.for循环;
/**
 * @Program: java
 * @ClassName Goods
 * @Author: liutao
 * @Description: 循环打印商品信息
 * @Create: 2022-10-07 12:29
 * @Version 1.0
 **/
public class Goods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []goodsName ={"Nike背包","Adidas运动衫","李宁运动鞋","Kappa外套","361°腰包"};
		System.out.println("本次活动特价商品有：");
		for(int i=0; i <goodsName.length;i++){
			System.out.println(goodsName[i]);
		}
	}
}
