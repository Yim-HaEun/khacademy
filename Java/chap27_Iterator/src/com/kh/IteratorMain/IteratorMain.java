package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

/*
Iterator
	�÷���(������ �׷�)�� �ݺ�(iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
	�پ��� �÷��� ����(ArrayList,HashSet ��)�� ����� �� ����
	�÷����� ��Ҹ� �а� �����ϴµ� ���
	�÷����� ũ�⳪ ���� ������ ������� ��ҿ� ������ �� ����.
* */
public class IteratorMain {

	
	public static void main(String[] args) {
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("NCT");
		music.add("Travis Scott");
		music.add("The Weeknd");
		music.add("Harry Styles");
		
		//Iterator ����
		Iterator<String> iter = music.iterator();
		
		//Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String artists = iter.next();
			System.out.println(artists);
		}
		//Iterator�� ����Ͽ� ��� ����
		iter = music.iterator(); //�ٽ� Iterator �ʱ�ȭ
		while (iter.hasNext()) {
			String artists = iter.next();
			//���࿡ Ʈ��Ʈ�� ������ �����ϱ� ����
			if(artists.equals("NCT")) {
				iter.remove(); // ���� ��� ����
			}
			System.out.println(artists);
		}
		//���� �� ArrayList ���
		System.out.println("���� �� ���");
		for (String a: music) {
			System.out.println(a);
		}

	}

}
