package com.demo.oop.homework.computer;
	
public class Computer implements VideoCard,Adapter,SoundCard,Cpu,MainBoard,InterStorage,computerSystem,HardDisc{
	private String Brand;
	private String type;
	public Computer() {
		super();
	}

	public Computer(String brand,String type) {
		super();
		this.Brand = brand;
		this.type = type;
	}

	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		this.Brand = brand;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void show() {
		// TODO Auto-generated method stub
		setBrand("Dell");
		String a =getBrand();
		setType("G3  3779");
		String b =getType();
		System.out.println("电脑："+a+b);
	}
	
	@Override
	public void mainBoard() {
		// TODO Auto-generated method stub
		System.out.println("主板：戴尔04R93M（300 series 芯片组 Family - A30D）");
	}

	@Override
	public void cpu() {
		// TODO Auto-generated method stub
		System.out.println("cpu：英特尔 Core i7-8750H @ 2.20GHz 六核");
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("声卡：瑞昱 @ 英特尔 High Definition Audio 控制器");
	}

	@Override
	public void Video() {
		// TODO Auto-generated method stub
		System.out.println("显卡：Nvidia GeFoce GTX 1060 with Max-Q Design（6GB）");
	}

	@Override
	public void sys() {
		// TODO Auto-generated method stub
		System.out.println("操作系统：Windows 10 64位");
	}

	@Override
	public void interStorage() {
		// TODO Auto-generated method stub
		System.out.println("内存：16 GB（镁光 DDR4 2666MHz）");
	}

	@Override
	public void Adapter() {
		// TODO Auto-generated method stub
		System.out.println("网卡：英特尔 Wireless-AC 9560");
	}

	@Override
	public void hardDisc() {
		// TODO Auto-generated method stub
		System.out.println("主硬盘：希捷 ST100LM035-1RK172（1TB /5400转 /分）");
	}
	
}
