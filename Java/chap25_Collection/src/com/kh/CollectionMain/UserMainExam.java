package com.kh.CollectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMainExam {

	public static void main(String[] args) {
		//HashMap ����  UserAge
		Map<String, Integer> userInfo = new HashMap<>();
		
		//������ �̸��� ��ȣ
		userInfo.put("äġ��", 4);
		userInfo.put("���븸", 14);
		userInfo.put("���¼�", 7);
		userInfo.put("����ȣ", 11);
		userInfo.put("���¿�", 10);
		
		//Ư�� ���� �˻�
		String userName = "���븸";
		if(userInfo.containsKey(userName)) {
			int number = userInfo.get(userName);
			System.out.println(userName+ "�� ��ȣ : " + number);
		}else {
			System.out.println(userName + "�� ���ȣ�� �����ϴ�.");
		}
		//��� ���� ��ȣ ���
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int number = entry.getValue();
			System.out.println(name + " : " + number);
		}
		
		//���� ��ȣ ����

		String userUpdate = "����ȣ";
		int newNum = 11;
		userInfo.put(userUpdate, newNum);
		System.out.println(userInfo + "�� ��ȣ�� ���Ѿ� " + newNum + "�� �Ǿ����ϴ�.");
		
		String userUpdate1 = "���¿�";
		int newNum1 = 10;
		userInfo.put(userUpdate1, newNum1);
		System.out.println(userInfo + "�� ��ȣ�� ���Ѱ� " + newNum1 + "�� �Ǿ����ϴ�.");
		
		//���� Ż��
		String removeUser = "äġ��";
		userInfo.remove(removeUser);
		
		System.out.println(removeUser + "�� ���� �߽��ϴ�.");
		//���� ���� �̸� ���� ���
		System.out.println("�ϻ� ���� ���� ��� : ");
		for(Map.Entry<String, Integer> entry : userInfo.entrySet()) {
			String name = entry.getKey();
			int num = entry.getValue();
			System.out.println(name + " : " +num);
		}

	}

}
