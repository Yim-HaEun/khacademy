package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
	
		
		System.out.print("������ �Է��ϼ��� ");
		num1 = sc.nextInt();
		System.out.print("������ �Է��ϼ��� ");
		num2 = sc.nextInt();
		
		System.out.println("���ϱ� ���: " + (num1+ num2));
		System.out.println("���� ���: " +( num1 - num2));
		System.out.println("���ϱ� ���: " + (num1 * num2));
		System.out.println("������  �� ���: " + (num1 / num2));

	}

}
