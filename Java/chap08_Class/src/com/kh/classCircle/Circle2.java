package com.kh.classCircle;

public class Circle2 {
	//�������
	final double PI = 3.14;//���
	private int radius = 1;//���� 
	
	//������
	public Circle2() {
		//�⺻������
	}
	//�޼���
	//�������� ���� ���
	public void inRadius() {
		//������ ���� ������ų ���� ������ �� �ִ�.!
		radius++;
		
	}
	public void AreaCircle() {
	//���� ���̸� ����ϰ� ����ϴ� �޼���
	double area = PI * radius * radius;
	System.out.println("���� ���� : "+ area);
	}
	public void SizeofCircle() {
		System.out.println("���� ũ�� : " + radius);
	}
	
}
