package com.kh.gettersetter;

public class GameRun {

	public static void main(String[] args) {
		//�÷��� ������ �����
		PlayerCharacter player1 = new PlayerCharacter();
		
		player1.setName("�����");
		player1.setHealth(800);
		player1.setAttackPower(150);
		
		player1.displayInfo();
		
		PlayerCharacter player2 = new PlayerCharacter();
		player2.setName("����Ʋ��");
		player2.setHealth(700);
		player2.setAttackPower(300);
		
		player2.displayInfo();
		
		System.out.println("������ ����");
		player1.attack(player2);
		//player2.attack(player1);
	}

}
