package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		
		//����ڿ� ���� Ű����� �Է¹޾� ���� �տ��� �տ��� �� ���� ����ϼ���
				String word;
				Scanner sc = new Scanner(System.in);
				System.out.print("���ڿ��� �Է��ϼ���: ");
				word = sc.next();
				char c1 = word.charAt(0);//���ڸ� 1�ھ� ���� ���ڸ��� ���� ������ apple 1�ڰ� �Ѿ ����� �� ����->�ڸ� ��ġ ���ؼ� ����ϱ�
				char c2 = word.charAt(1);
				char c3 = word.charAt(2);
				System.out.println("ù��° ���� : " + c1);
				System.out.println("�ι�° ���� : " + c2);
				System.out.println("����° ���� : " + c3);
				
				Scanner scan = new Scanner(System.in);
				System.out.print("���ڿ��� �Է��ϼ���: ");
				String word2 = scan.next();
				
				String a = word2.substring(0,1);
				String p1 = word2.substring(1,2);
				String p2 = word2.substring(2,3);
				
				//���ڸ��� �ƴ϶� �ڸ��� ���ؼ� ����� �� ���� ���۸� ���ص��ǰ� ���� ���ص���
				//�ڸ� ��ġ ���ؼ� ����ϱ�
				//���۸� �� ��� ������ �ε��� ��ġ���� ������ ��µ�(�⺻)
				System.out.println("ù��° ���� : " + a);
				System.out.println("�ι�° ���� : " + p1);
				System.out.println("����° ���� : " + p2);
				

	}

}
