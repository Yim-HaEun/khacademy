package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������ּ���");
		
		int fruit = sc.nextInt();
		
		switch(fruit) {
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("����");
			break;
		default : 
			System.out.println("�߸��� �����Դϴ�.");
		}
		//Scanner�� �̿��ؼ� ���ڸ� �����ϴ� switch�� �����
		System.out.println("���ڸ� �������ּ���.1.���ڰ��� 2.����Ĩ���� 3.�������");
		
		boolean isChoice = false;
		int snack = sc.nextInt();
		
		switch(snack) {
		case 1:
			System.out.println("���ڰ���");
			break;
		case 2: 
			System.out.println("����Ĩ ����");
			break;
		case 3:
			System.out.println("���� ����");
			break;
		default : 
			System.out.println("�߸��� �����Դϴ�. �ٽ� �������ּ���.");
		}
	}
}
		
		
		/*
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1.�Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. ī���ī");
			
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("ī��� �ֹ��ϼ̽��ϴ�.");
			break;
		case 3:
			System.out.println("ī���ī �ֹ��ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���");
		}
	}
	*/

