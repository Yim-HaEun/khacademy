package com.kh.Practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int menu ; 
		System.out.println("1.�Է�  2.����  3.��ȸ 4. ����  7.����" );
		System.out.print("�޴� ��ȣ�� �Է��ϼ���.");
		menu = scan.nextInt();
		
		/**1.if��**/
		/*
		if (menu == 1) {
			System.out.println("�Է�");
		}else if(menu ==2) {
			System.out.println("����");
		}else if(menu ==3) {
			System.out.println("��ȸ");
		}else if(menu ==4) {
			System.out.println("����");
		}else if(menu == 7) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}
		
		*/
		
		/**2.switch��**/
		
		switch (menu) {
			
		case 1 :
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2 :
			System.out.println("����  �޴��Դϴ�.");
			break;
		case 3 :
			System.out.println("��ȸ  �޴��Դϴ�.");
			break;
		case 4 :
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7 :
			System.out.println("����  �޴��Դϴ�.");
			break;
		default :
			System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
		}
	}

}
