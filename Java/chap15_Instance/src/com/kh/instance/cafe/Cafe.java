package com.kh.instance.cafe;

public class Cafe {
	private String type; //���� ���� 
	private int size; //���� ������
	private boolean isSugar; // ��������
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	public void cafeMenu() {
		System.out.println("�ֹ��� �ްڽ��ϴ�.");
		System.out.println("���� : " + type);
		System.out.println("������ : " + size);
		
		if(isSugar) { //true
			System.out.println("������ �߰��մϴ�.");
		}
		
	}
	
	
}
