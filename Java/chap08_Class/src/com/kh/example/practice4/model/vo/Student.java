package com.kh.example.practice4.model.vo;

public class Student {
/*
 * grade : int
- classroom : int
- name : String
- height : double
- gender : char
 * */
	//1.�������
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	//2.������ Student()
	public Student() {
		this.grade = 1;
		this.classroom = 11;
		this.name = "������";
		this.height = 158.9;
		this.gender = '��';
		
	}
	//3.��¸޼ҵ�
	public void information() {
		System.out.println("�г� : "+ grade);
		System.out.println("��: "+ classroom);
		System.out.println("�̸� :"+ name);
		System.out.println("Ű : "+ height + "cm");
		System.out.println("���� : "+ gender);
	}
}
