package com.demo.oop.exciseEdu.avgscore;

public class AvgScore {

	public double showAvg(Student stu){ //平均分
		double avg=(stu.java+stu.sql+stu.html)/3;
		return avg;
	}

	public double addSum(Student stu){ //总分
		double sum=(stu.java+stu.sql+stu.html);
		return sum;
	}

	public double showAvgHeight(Student[] stu){
		int sumHeight=0;
		for(int i=0; i<stu.length;i++){
			sumHeight+=stu[i].stuHeight;
		}
		double avgHeight=sumHeight/stu.length;
		return avgHeight;
	}
}
