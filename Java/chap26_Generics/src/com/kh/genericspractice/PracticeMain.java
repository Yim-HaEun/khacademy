package com.kh.genericspractice;

import java.util.ArrayList;

import javax.swing.Box;

public class PracticeMain {

	
	
	public void practice1() {
		
			ArrayList<Integer> intList = new ArrayList<>();
			intList.add(1);
			intList.add(2);
			intList.add(5);
			
			ArrayList<String> strList = new ArrayList<>();
			strList.add("�ȳ��ϼ���");
			strList.add("�߰�");
			
			printList(intList);
			printList(strList);
		}
	public static <T> void printList(ArrayList<T> list){
	for(T item : list) {
				System.out.println(item);
			}
		
	}

	public void practice2() {
		// ������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		// ���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		// ���� ���
		//���� for �� �̿��ؼ� �� ��� ���
		Box<Integer> intBox = new Box<>();
		intBox.put(1);
		intBox.put(2);
		
		int intValue = intBox.get();
		
		Box<String> strBox = new Box<>();
		strBox.put("�ý�4");
		strBox.put("�尩");
		
		String strValue = strBox.get();
		
		System.out.println("IntValue : " + intValue);
		System.out.println("String Value : " + strValue);
		
	}//public static <B> void printList(Box<B> list){
		//for(B item : list) {
			//System.out.println(item);
		//}
	
	//}
}
