package com.kh.mvc.circle.vo;

import java.util.Scanner;
public class CircleView {
	public double getUserInput1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		return scan.nextDouble();
		
	}//���
	public void display(double result) {
		System.out.println("��� : " + result);
		
	}

}
