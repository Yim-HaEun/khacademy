package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	
	public static void main(String[]args) {
	//Ű���忡�� ���� �ΰ��� �Է¹޾� �� ���� �� �� �� �������� ��� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int inum4,inum5;
		inum4 = sc.nextInt();
		System.out.println("������ �Է��ϼ���");
		inum5 = sc.nextInt();
		
		System.out.println(inum4 - inum5);
		
	}
}