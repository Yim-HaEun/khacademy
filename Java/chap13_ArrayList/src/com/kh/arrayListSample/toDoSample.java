package com.kh.arrayListSample;
import java.util.ArrayList;
public class toDoSample {

	public static void main(String[] args) {
		// ArrayList�̿��ؼ� 
		//���� �����(3��
		//�����ϰ� (2��
		//�����(1��
		//���� �� �����ϱ�
		
		ArrayList<String> todo = new ArrayList<>();
		//���� �����
		todo.add("�������̸� �����ϱ�");
		System.out.println("ToDo List +: "+ todo);
		todo.add("�ݺ��� hard ����Ǯ��");
		System.out.println("ToDo List +: "+ todo);
		todo.add("�ｺ�� ����");
		System.out.println("ToDo List + : "+ todo);
		
		//�����ϱ�
		todo.set(0,"�ٸ���ȭ �����ϱ�");
		todo.set(1,"��ȭ���� �� Ǯ��");
		System.out.println("ToDo List (������): " + todo);
		
		//�����
		todo.remove(0);
		System.out.println("���� �� �� : " + todo);
		
		//ArrayList ��ȸ�ؼ� ������
		for(String aaaaa : todo) {
			System.out.println("�� �� ��� : " + todo);
		}
		//�ߺ��� ���� ����
		//���� �� �����
		todo.clear();
		System.out.println("ToDo List �����Ǿ����ϴ�." + todo);
	}

}
