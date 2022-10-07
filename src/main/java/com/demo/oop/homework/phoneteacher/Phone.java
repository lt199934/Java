package com.demo.oop.homework.phoneteacher;

public class Phone {
	String phoneName;
	double price;
	String type;
	Cell cell = new Cell();
	
	public void init(){
		cell.cellNum=50;
		cell.cellName="飞毛腿";
	}
	
	public boolean downMusic(){
		System.out.println("下载音乐");
		cell.updateCell();
		System.out.println(cell.selectCell());	
		if(cell.selectCell() <= 20){
			System.out.println("电量不足请及时充电");
		}
		if(cell.selectCell() == 0){
			System.out.println("没电了自动关机");
			return true;
		}
		return false;
	}
	
	public boolean playMusic(){
		System.out.println("播放音乐");
		cell.updateCell();
		cell.updateCell();
		System.out.println(cell.selectCell());	
		if(cell.selectCell() <= 20){
			System.out.println("电量不足请及时充电");
		}
		if(cell.selectCell() == 0){
			System.out.println("没电了自动关机");
			return true;
		}
		return false;
	}
	
	public void addCell(){
		cell.addCell();
		System.out.println("正在充电，当前电量："+cell.selectCell());	
		if(cell.selectCell() == 100){
			System.out.println("充电完成");
		}
	}
	
}
