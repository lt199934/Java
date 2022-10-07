package com.demo.oop.exciseEdu.door接口编程;

public class Mydoor extends Door implements Lock,Bell {

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		System.out.println("用力推，门打开了");
	}

	@Override
	public void closeDoor() {
		// TODO Auto-generated method stub
		System.out.println("轻轻拉门，门关上了。");
	}

	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙，向左旋转钥匙三圈，锁打开了，拔出钥匙。");
	}

	@Override
	public void closeLock() {
		// TODO Auto-generated method stub
		System.out.println("插进钥匙，向右旋转钥匙三圈，锁上了，拔出钥匙。");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("铃铃铃......咔嚓......照片已保存");
	}

}
