package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {{"Apple","Banana","Cherry"},
				{"Grapes","Orange","strawberry"},
				{"Kiwi", "Mango","pineApple"}};
		System.out.println("fruits.length: " + fruits.length);
		
		for (int i =0; i<fruits.length;i++) {
			System.out.println("ù��° for�� : "+ i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.println(fruits[i][a] + " ");
				System.out.println("�ι�° for�� : "+ a);
			}
			System.out.println(); //���������� �̵��� �� �ְ� enter�� ��� �޼ҵ� �Է�
		}

	}

}
