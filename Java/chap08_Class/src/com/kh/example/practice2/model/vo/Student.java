package com.kh.example.practice2.model.vo;

public class Student {
	int grade;
	int classroom;
	String name;
	double height;
	char gender;

	public Student(int grade, int classroom, String name, double height, char gender) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	public void information() {
		System.out.println("�г� : " + grade + "�г��Դϴ�.");
		System.out.println("�� : " + classroom + "��");
		System.out.println("�̸� : " + name + "�Դϴ�.");
		System.out.println("Ű : " + height + "cm");
		System.out.println("���� : " + gender);
		
	}

}
