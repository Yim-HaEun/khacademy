package com.kh.practice4.func;

import java.util.Scanner;

public class HardPractice_1 {

	public static void main(String[] args) {
		// �Ҽ� ���ϱ� 
		int count = 0; //����������� ���� ���⿡ �����ſ���.
		
		Scanner scan = new Scanner(System.in);	//����ڷκ��� ���ڸ� �Է¹޽��ϴ�.
		System.out.println("���� : ");
		int num = scan.nextInt();
		
		if(num<2) { // �Է��� ���� 2���� ���� ���,
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); //�߸� �Է��ϼ̽��ϴ�. ���
		}else { // �Է��� ���� 2���� ū ���,
			for(int i =1; i<=num; i++) { //�ݺ����� ����ؼ�
				if(num%i == 0) {
					count++;
				}else {
					continue;
				}
			}
			if(count == 2) {
				System.out.println("�Ҽ��Դϴ�.");
			}else {
				System.out.println("�Ҽ��� �ƴմϴ�.");
			}

		}

	}

}
