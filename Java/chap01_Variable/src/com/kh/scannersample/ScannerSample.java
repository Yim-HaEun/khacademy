package com.kh.scannersample;

import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴�" + age + "�Դϴ�.");
		
		
		String name;
		int phoneNumber;
		
		
		
		System.out.print("����� �̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		System.out.print("����� ��ȣ�� �Է��ϼ���.");
		phoneNumber = sc.nextInt(); //������ ��������
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� 1�� ����ϱ�
		String hobby;
		String food;
		String myAddress;
		
		System.out.print("����� ��̰� �����Դϱ�?");
		hobby = sc.next();
		System.out.println("����� ��̴� " + hobby +"����!");
		System.out.print("����� �����ϴ� ������ �����Դϱ�?");
		food = sc.next();
		System.out.println("����� �����ϴ� ������ " + food +"����!");
		System.out.print("����� �ּҴ� �����Դϱ�?");
		myAddress = sc.next();
		System.out.println("����� �ּҴ� " + myAddress +"����!");
		
		String name1, name2;
		
	}

}
