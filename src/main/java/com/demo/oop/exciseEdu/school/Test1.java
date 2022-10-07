package com.demo.oop.exciseEdu.school;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		school school = new school();
		school.name="chengduUniversity";
		school.num1=100;
		school.num2=200;
		
		school.show();
		
		Student student = new Student();
		student.name="张浩";
		student.age=10;
		student.className="s1班";
		student.like="篮球";
		student.show();
		
		Teacher teacher = new Teacher();
		teacher.name="王老师";
		teacher.side="计算机";
		teacher.classn="使用java语言理解程序逻辑";
		teacher.teachAge=5;
		teacher.show();
	}

}
