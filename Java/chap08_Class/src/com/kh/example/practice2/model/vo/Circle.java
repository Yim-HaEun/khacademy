package com.kh.example.practice2.model.vo;

public class Circle {
	//�ʵ� �������
	private double PI = 3.14;
	private int radius = +1;
	
	
		
	
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}

	public void setPI(double pI) {
		this.PI = PI;
		
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	//�޼��� 
	
	public void incrementRadius() {
		radius++;
		System.out.println("������ : "+ radius);
	
	}
	public void  getAreaOfCircle() {
		System.out.println("���� ���� : " + (PI*radius*radius) );
	}
	
	public void getSizeOfCircle() {
		System.out.println("���� �ѷ� : " + (2*PI*radius));
	}
	
	
	


}
