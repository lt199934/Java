package com.demo.io.java输入流和输出流.FileDemo.FileDemo.src.com.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class newFileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("D:\\FileDemo\\1");
		File f2=new File("D:\\FileDemo\\2");
		newFileCopy.copyFile(f1,f2);	
	}
	public static void copyFile(File path,File newpath) throws IOException{
		File[] f1=path.listFiles();
		for (File file : f1) {
			System.out.println(file.isFile()+""+file.getName());
			File f2=new File(newpath,file.getName());
			if(file.exists()){
				//复制文件夹
				if(file.isDirectory()){
					System.out.println(f2.mkdir());
				}else if(file.isFile()){//复制文件
					byte[] b = new byte[(int)file.length()];
					FileInputStream fis = new FileInputStream(file);
					fis.read(b);
					FileOutputStream fos = new FileOutputStream(f2);
					fos.write(b);
					fis.close();
					fos.close();
				}
			}
		}
		
	}

}
