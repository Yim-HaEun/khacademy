package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ڷκ��� �� ���� ���� �Է¹޾� 1 ���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		//�� �Է��� ���� 1���� ũ�ų� ���ƾ��մϴ�.
		//���� 1 �̸��� ���ڰ� �Էµƴٸ� "1�̻��� ���ڸ� �Է����ּ���"�� ����ϰ� �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		Scanner sc = new Scanner(System.in);
				
				System.out.println("���ڸ� �Է��ϼ���: ");
				int num = sc.nextInt();
				boolean isTrue = true;
				while(!isTrue) {
					if(num < 1) {
						System.out.println("1�̻��� ���ڸ� �Է����ּ���");
					}else {
						for(int i = 1; i <= num; i++) {
							System.out.println(i);
						}
						//���� false �����
						isTrue = true;
					}
				}
				
	}

}
