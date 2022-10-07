package com.demo.oop.exciseEdu.studentavgheight;

public class AvgHeight {
	public double showAvgHeight(StudentHeight[] stu){
		int sumHeight=0;
		for(int i=0; i<stu.length;i++){
			sumHeight+=stu[i].stuHeight;
		}
		double avgHeight=sumHeight/stu.length;
		return avgHeight;
	}
}
