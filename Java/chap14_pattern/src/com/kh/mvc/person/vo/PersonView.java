package com.kh.mvc.person.vo;

import java.util.Scanner;

public class PersonView {
	public String getUserInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		return scan.next();
	}
	//���
	public void displayName(String result) {
			System.out.println("�̸� : " + result);
		
	}
		

}
