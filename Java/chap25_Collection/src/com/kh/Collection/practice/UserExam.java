package com.kh.Collection.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	//�̸� ����
	public static void main(String[] args) {
		Map <String, Integer> userSalary = new HashMap<>();
		
		userSalary.put("äġ��",5000);
		userSalary.put("����ȣ", 15000);
		userSalary.put("���¿�", 25000);
		
		
		String userName = "���¿�";
		
		if(userSalary.containsKey(userName)) {
			int salary = userSalary.get(userName);
			System.out.println(userName + "�� ����(�� ��) " + salary);
			
		}else {
			System.out.println(userName + "�� ������ ã�� �� �����ϴ�.");
		}
		
	}

}
