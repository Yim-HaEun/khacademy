package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe client1 = new Cafe("�Ƹ޸�ī��",1,false);
		Cafe client2 = new Cafe("��",1,true);
		Cafe client3 = new Cafe("�ڸ���Ϻ�Ƽ", 2, true);
		
		client1.cafeMenu();
		client2.cafeMenu();
		client3.cafeMenu();

	}

}
