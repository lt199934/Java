package com.demo.io.复制文件夹以及文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class newFileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		newFileCopy.copyFile("C:\\Users\\DELL\\Desktop\\java输入流和输出流\\FileDemo\\1","C:\\Users\\DELL\\Desktop\\java输入流和输出流\\FileDemo\\2");	
	}
	public static void copyFile(String path,String newpath) throws IOException{
		File oldfile=new File(path);
		File[] f1=oldfile.listFiles();
		File newfile = new File(newpath);
		if(!newfile.exists()){
			newfile.mkdir();
			System.out.println("目录创建成功");
		}else{
			System.out.println("目录已存在");
		}
		for (File file : f1) {
			System.out.println(file.isFile()+""+file.getName());
			File f2=new File(newpath+"\\"+file.getName());
				//复制文件夹
				if(file.isDirectory()){
					f2.mkdir();//创建新目录
					copyFile(file.getPath(),newpath+"\\"+file.getName());//递归
				}else if(file.isFile()){//复制文件
					byte[] b = new byte[(int)file.length()];
					FileInputStream fis = new FileInputStream(file);
					fis.read(b); //ctrl+c
					FileOutputStream fos = new FileOutputStream(f2);
					fos.write(b);//ctrl+v
					fis.close();
					fos.close();
				}
			}
		
	}

}
