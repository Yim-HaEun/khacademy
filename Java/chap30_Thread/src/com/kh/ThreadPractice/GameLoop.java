package com.kh.ThreadPractice;

import java.util.Random;

public class GameLoop extends Runnable{
	
	GameMain gm = new GameMain();
	
	@Override
	public void run() {
		
		while(!gm.getisGameOver()) {
			//���� ���� ����
			int randomValue = new Random().nextInt(10);
			System.out.println("������ ���� : " + randomValue);
			
			//���� ���� ���� �ð�
			try {
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//���� ���� ����
			//EnterŰ�� ������ ������ ����˴ϴ�.
			System.out.println("������ �����Ϸ��� Enter�� ��������");
		}
	}
	
}
