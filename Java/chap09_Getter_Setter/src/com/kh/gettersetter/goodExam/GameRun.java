package com.kh.gettersetter.goodExam;

public class GameRun {

	public static void main(String[] args) {
		//�÷��� ������ �����
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("�����");
		player1.setHealth(-10); //-10ü���� �������ְ�
		player1.isValidHealth();//-10�� ���Ἲ(���� ���� �ڵ尡 ������ ������)���� �����Ѵ�.
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		
		player1.displayInfo();
		
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("����Ʋ��");
		player2.setHealth(700);
		player2.isValidHealth();
		player2.setAttackPower(300);
		player2.ValidAttackPower();
		
		player2.displayInfo();
		
		//System.out.println("������ ����");
		//player1.attack(player2);
		//player2.attack(player1);
	
	}

}
