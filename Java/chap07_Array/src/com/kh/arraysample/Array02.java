package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		// 1. �迭�� ���̸� ����
		int[] num = new int[10]; //���̰� 3�� �迭
		//1~0�����ǹݺ����� �̿��ؼ� ������� �迭 �ε����� ���� �� 
		for(int i =0; i<num.length;i++) {
			num[i] = i+1;
			System.out.println(num[i]);
		}
		// �� ���� ���
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	
		
		//���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ������̿��� ���
		//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		//��°� : 10 9 8 7 6 5 4 3 2 1
		
		int[] num1 = new int[10]; //
		int val = 10;
		//1~0�����ǹݺ����� �̿��ؼ� ������� �迭 �ε����� ���� �� 
		for(int i = 0; i<num.length;i++) {
			num[i] = val--;
			System.out.println(num[i]);
		}
		// �� ���� ���
		
		//2.���̰� 5�� String �迭 �����ϰ� 
		//"���" "��" "����" "������" "����"�� �ʱ�ȭ �� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		
		String[] fruits = {"���", "��", "����", "������", "����"};
		
		
		System.out.println(fruits[1]);
		
		

	}

}
