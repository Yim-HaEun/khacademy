package com.kh.instance.tv;
//TV ���� 
public class Tv {

	//TV �Ӽ�(�ʵ�)
	String color; //Ƽ�� ����
	boolean power; // ���� ����
	int channel;
	//TV ���(�޼���)
	public void power() {
		power = !power; //���� ����
		
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}

}
