package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		//List �������̽� LinkedList ��ü Ȱ���ؼ� �� �ְ� ���
		//String �� �ְ� ����, ����, ���
		List<String> LinkedList = new LinkedList<>();
		LinkedList.add("�� �ֱ� 1");
		LinkedList.add("�� �ֱ� 2");
		LinkedList.add("�� �ֱ� 3");
		
		LinkedList.set(0,"�� ����1");
		
		LinkedList.remove(2);
		
		
		//LinkedList ��ü new LinkedList ��ü
		//int �� �ְ� ����, ���� ���
		
		LinkedList<int> LinkedList = new LinkedList<>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.set(0,5);
		linkedList.remove(2);
		
		
	}

}
