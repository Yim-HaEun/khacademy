package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		// 					  FoodStore -> ��ü�� �ƴ϶� ������ �� ����.
		FoodStore order = new Order();
		order.addMenu("«�� �ֹ�");
		order.addMenu("¥��� �ֹ�");
		order.addMenu("��«�� �ֹ�");
		order.printMenu();
	}

}
