package com.demo.io.java输入流和输出流.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileDemo {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1="";
		String str2="";
		int i=0;
		while(true){
			System.out.println("请写入"+(i+1)+"第一行内容");
			str1 =sc.next();
			System.out.println("是否继续（y/n）");
			str2 = sc.next();
			String[] a =new String[i+1];
			a[i]=str1;
			Write(str1);
			i++;
			if(str2.equals("n")){
				System.out.println("写入成功！");
				read();
				break;
			}
		}
	}
	//写入文本内容
	public static void Write(String str) throws Exception{
		File file = new File("C:\\Users\\DELL\\Desktop\\1","1.txt");
		FileOutputStream fos = new FileOutputStream(file,true);//true为在文本末尾添加，默认为false会覆盖原来的内容
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
//		System.out.println(str);
			bw.write(str);
			bw.newLine();
			bw.flush();
			bw.close();
			fos.close();
			osw.close();
			
	}
	
	public static void read() throws Exception{
		File file = new File("C:\\Users\\DELL\\Desktop\\1","1.txt");
		FileInputStream fis = new FileInputStream(file);//true为在文本末尾添加，默认为false会覆盖原来的内容
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("读取结果为");
		while(true){
			String s=br.readLine();
			if(s==null){
				break;
			}
			System.out.println(s);
		}
		fis.close();
		isr.close();
		br.close();	
	}
}
