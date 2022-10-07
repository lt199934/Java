package com.demo.io.ObjectStream;

import java.io.File;
import java.io.FileOutputStream;

public class Objfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\DELL\\Desktop\\1","1.txt");
		FileOutputStream fos = new FileOutputStream(file,true);//true为在文本末尾添加，默认为false会覆盖原来的内容
		
	}

}
