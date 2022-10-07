package com.demo.io.复制文件夹以及文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFIle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		MyFIle.deleteFile("D:\\filedemo\\1");
		MyFIle.copyFile("D:\\filedemo\\1","D:\\filedemo\\2");
		
	}
	
	//删除文件
	public static void deleteFile(String path){
		File file = new File(path);
		File[] files = file.listFiles();//将指定路径下的文件及文件夹以File数组返回
		for (File file2 : files) {
			if(file2.isFile()){
				System.out.println("删除文件："+file2.getName());
				
			}else if(file2.isDirectory()){
				String newParth=path+"\\"+file2.getName();
				System.out.println("文件夹"+file2.getName()+"构建新文件目录"+newParth);
				deleteFile(newParth);//递归
			}
		}
	}
	//复制文件到指定目录  oldpath 复制源文件的路径   newpath 指定复制后的文件存放位子
	public static void copyFile(String oldpath,String newpath) throws IOException{
		File oldfile = new File(oldpath);
		File[] files = oldfile.listFiles();
		
		//判断newpath路径是否存在 
		File newfile = new File(newpath);
		if(!newfile.exists()){
			newfile.mkdir();//创建新目录
			System.out.println("目录已经创建");
		}else{
			System.out.println("目录已存在");
		}
		
		for(File file:files){
			if(file.isFile()){//是文件
				//后缀名处理
				if(!file.getName().endsWith("jpg")){
					continue;
				}
				//判断文件大小
				if(file.length() == 0 || file.length()>500*1024*1024){
					continue;
				}
				
				FileInputStream fis = new FileInputStream(file);
				byte[] b = new byte[(int)file.length()];
				fis.read(b);//将当前文件通过fis 存入b数组 Ctrl+C
				
				//构建一个新路径下的file文件
				File newFile = new File(newpath+"\\"+file.getName());
				FileOutputStream fos = new FileOutputStream(newFile);
				fos.write(b);//通过fos将b数组里面的内容存入newFile路径下的文件里 Ctrl+V
				fis.close();
				fos.close();
			}else if(file.isDirectory()){//文件夹
				
				String newDirectoryPath = newpath+"\\"+file.getName();
				File newDirectoryFile = new File(newDirectoryPath);
				newDirectoryFile.mkdir();//创建新路径
				
				//通过递归循环将新路径下的文件在进行一次以上操作以此内推
				copyFile(file.getPath(),newDirectoryPath);
			}
		}
	}
}
