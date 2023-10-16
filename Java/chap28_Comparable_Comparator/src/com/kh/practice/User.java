package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	
	@Override
	public int compare(String user1, String user2) {
		
		//���̰� ������ 0��ȯ 
		if(user1.length() == user2.length()) {
			return 0;
		//user1�� user2 ���� ��� ��� ��ȯ
		}else if(user1.length() == user2.length()) {
			return 1;
		}
		//user1�� user2���� ª���� ���� ��ȯ
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// List ArrayList ���� Comparator ����
		List<String> user = new ArrayList<>();
		user.add("�̻���");
		user.add("������");
		user.add("HideOnBush");
		user.add("[SKT T1]Faker");
		user.add("������");
		
		//Comparator�� ����ؼ� ���ڿ��� ���� 
		Collections.sort(user, new User());
		
		//���ĵ� ��� ���
		for(String u : user) {
			System.out.println(u);
		}
	}
}
