package com.kh.abstractSample;
//�߻�Ŭ���� ����
abstract class Shape {
	//�Ϲ� �ʵ�
	private String color;

	//������
	public Shape(String color) {
		this.color = color;
	}
	//�Ϲ� �޼���
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	//�߻� �޼���(���� Ŭ�������� �����ؾ���)
	abstract double calculateArea();
		
	abstract double calculateArea1(); 
	
	
	
	
	

}
