package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 1. ���ڿ��� �Է� �޾� 
		 2. ���� �ϳ��ϳ� �迭�� �ְ�
		 3. �˻��� ���ڰ�
		 4. ���ڿ��� �� �� �� �ִ��� ������
		 5. �� ��° �ε����� ��ġ�ϴ���
		 6. �ε��� ����ϱ�
		 * */ 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		String inputString = sc.next(); 
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");//�˻��� ���� �Է¹ޱ�
		char searchChar = sc.next().charAt(0); //ù ��°
		
		char[] charString = inputString.toCharArray(); // String�ȿ� Char�迭�� �������
		
		int charCount = charString.length;
		System.out.println("charCount : "+charCount);
		
		//���ڿ�>���ڷ� ��ȯ
		//�ȳ��ϼ���-> {'��', '��', '��', '��', '��'}
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		//String-> char
		
		//�˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ -> length
		//�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� -> �ε��� �� ����ϱ�
		//�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		
		System.out.println(inputString + "�� " + searchChar + "�� �����ϴ� ��ġ(�ε���)");
		//�ݺ����� ����ؼ� ��ġ ã��
		int count = 0;
		for(int i = 0; i<charCount; i++){
			//���� ���� �� �ܾ �˻����� �� �� ���ڴ� �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if (charString[i] == searchChar) { //charString[i] �������� �ƴ϶� i���� �Ǿ��ϴ� ����: 
															//searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ⶧���� ���� �����Ǿ� �־����
			System.out.println(i);
			count++;
			}
			
		}
		
	}

}
