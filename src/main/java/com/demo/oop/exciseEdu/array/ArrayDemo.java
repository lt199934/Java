package com.demo.oop.exciseEdu.array;

import java.util.Arrays;

public class ArrayDemo {
	public String[] myArraySort(String[] names){
		Arrays.sort(names);
		return names;
	}

	public void showNames(String[] names){ //升序
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]);
		}
		System.out.println();
	}

	public void show(String[] names){ //降序
		for(int i=names.length-1;i>=0;i--){
			System.out.print(names[i]);
		}
		System.out.println();
	}
}
