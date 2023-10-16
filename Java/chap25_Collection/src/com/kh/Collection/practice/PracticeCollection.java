package com.kh.Collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
		pc.practiceMap();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add �غ��� for �� ����ϱ�
		pList.add("�ȳ�");
		pList.add("���");
		pList.add("���ġ��");
		pList.add("�ϼ�");
		pList.add("�ȳ�");
		System.out.println("List(�ߺ� ���) : ");
		for(String greeting : pList) {
			System.out.println(greeting);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� for�� ���, �ߺ��� �� add �ؾ���
		pSet.add("�ѱ�");
		pSet.add("�̱�");
		pSet.add("�Ϻ�");
		pSet.add("ȫ��");
		pSet.add("�ѱ�");
		
		System.out.println("Set(�ߺ� �Ұ�) : ");
		for(String Nation : pSet) {
			System.out.println(Nation);
		}
		
	}
	public void practiceMap() {
		//Ű�� ���� �̿��ؼ� map put �� ����, ���� for������ ����غ���
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("������ ����", 15);
		myMap.put("�߰�︲", 2);
		myMap.put("ų��", 5);
		myMap.put("ŷ����", 3);
		myMap.put("�μ���", 1);
		
		for(String movie:myMap.keySet()) {
			int code = myMap.get(movie);
			System.out.println(movie+ " : " + code);
		}
		
	}

}
